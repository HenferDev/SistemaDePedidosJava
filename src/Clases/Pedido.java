/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.util.ArrayList;

/**
 *
 * @author Hensser
 */
public class Pedido {

    private int idPedido;
    private String fecha;
    private String hora;
    private Cliente cliente;
    private ArrayList<Producto> listaProductos;
    private double subtotal;
    private double descuentoTotal;
    private double totalPagar;
    private String metodoPago;
    private String estado;  

    public Pedido() {
        listaProductos = new ArrayList<>();
        subtotal = 0;
        descuentoTotal = 0;
        totalPagar = 0;
    }

    public Pedido(int idPedido, String fecha, String hora, Cliente cliente, String metodoPago, String estado) {
        this.idPedido = idPedido;
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.metodoPago = metodoPago;
        this.estado = estado;
        this.listaProductos = new ArrayList<>();
        this.subtotal = 0;
        this.descuentoTotal = 0;
        this.totalPagar = 0;
    }

    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
        subtotal += producto.getPrecio();
        descuentoTotal += (producto.getPrecio() * producto.getDescuento() / 100);
        totalPagar = subtotal - descuentoTotal;
    }

    public void eliminarProducto(Producto producto) {
        if (listaProductos.remove(producto)) {
            subtotal -= producto.getPrecio();
            descuentoTotal -= (producto.getPrecio() * producto.getDescuento() / 100);
            totalPagar = subtotal - descuentoTotal;
        }
    }

    public double calcularTotal() {
        totalPagar = subtotal - descuentoTotal;
        return totalPagar;
    }

    public void mostrarResumen() {
        System.out.println("Pedido #" + idPedido + " - Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
        System.out.println("Fecha: " + fecha + " " + hora);
        System.out.println("Productos:");
        for (Producto p : listaProductos) {
            System.out.println(" - " + p.getNombre() + " Q" + p.getPrecio());
        }
        System.out.println("Subtotal: Q" + subtotal);
        System.out.println("Descuento total: Q" + descuentoTotal);
        System.out.println("Total a pagar: Q" + totalPagar);
        System.out.println("Método de pago: " + metodoPago + " | Estado: " + estado);
    }

    public void cambiarEstado(String nuevoEstado) {
        estado = nuevoEstado;
    }

    public void registrarPago(String metodo, double monto) {
        metodoPago = metodo;
        if (monto >= totalPagar) {
            estado = "Pagado";
            System.out.println("Pago registrado correctamente.");
        } else {
            System.out.println("Pago insuficiente. Faltan Q" + (totalPagar - monto));
        }
    }

    public int cantidadProductos() {
        return listaProductos.size();
    }
    public int getIdPedido() { return idPedido; }
    public void setIdPedido(int idPedido) { this.idPedido = idPedido; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public ArrayList<Producto> getListaProductos() { return listaProductos; }
    public void setListaProductos(ArrayList<Producto> listaProductos) { this.listaProductos = listaProductos; }

    public double getSubtotal() { return subtotal; }
    public void setSubtotal(double subtotal) { this.subtotal = subtotal; }

    public double getDescuentoTotal() { return descuentoTotal; }
    public void setDescuentoTotal(double descuentoTotal) { this.descuentoTotal = descuentoTotal; }

    public double getTotalPagar() { return totalPagar; }
    public void setTotalPagar(double totalPagar) { this.totalPagar = totalPagar; }

    public String getMetodoPago() { return metodoPago; }
    public void setMetodoPago(String metodoPago) { this.metodoPago = metodoPago; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
    
