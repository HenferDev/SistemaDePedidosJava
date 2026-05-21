/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Hensser
 */
public class Pago {
    private int idPago;
    private Pedido pedido;
    private String fecha;
    private String hora;
    private double montoPagado;
    private double montoTotal;
    private String metodoPago;    
    private boolean completado;
    private String numeroComprobante;
    private String banco;
    private String observaciones;

    public Pago() {}

    public Pago(int idPago, Pedido pedido, String fecha, String hora, double montoPagado, double montoTotal,
                String metodoPago, boolean completado, String numeroComprobante, String banco, String observaciones) {
        this.idPago = idPago;
        this.pedido = pedido;
        this.fecha = fecha;
        this.hora = hora;
        this.montoPagado = montoPagado;
        this.montoTotal = montoTotal;
        this.metodoPago = metodoPago;
        this.completado = completado;
        this.numeroComprobante = numeroComprobante;
        this.banco = banco;
        this.observaciones = observaciones;
    }

    public void registrarPago() {
        if (montoPagado >= montoTotal) {
            completado = true;
            System.out.println("Pago completado correctamente. Pedido #" + pedido.getIdPedido());
        } else {
            completado = false;
            System.out.println("Pago incompleto. Falta Q" + (montoTotal - montoPagado));
        }
    }

    public boolean estaCompletado() {
        return completado;
    }

    public double calcularSaldoPendiente() {
        return montoTotal - montoPagado;
    }

    public void cambiarMetodoPago(String nuevoMetodo) {
        metodoPago = nuevoMetodo;
    }

    public void aplicarDescuento(double porcentaje) {
        double descuento = montoTotal * (porcentaje / 100);
        montoTotal -= descuento;
        System.out.println("Descuento aplicado de Q" + descuento);
    }

    public void generarComprobante() {
        System.out.println("Comprobante #" + numeroComprobante + 
                           " | Pedido #" + pedido.getIdPedido() + 
                           " | Monto: Q" + montoPagado + 
                           " | Método: " + metodoPago);
    }

    public void mostrarInfoPago() {
        System.out.println("Pago #" + idPago + " | Fecha: " + fecha + " | Monto: Q" + montoPagado + 
                           " | Método: " + metodoPago + " | Estado: " + (completado ? "Completado" : "Pendiente"));
    }
    public int getIdPago() { return idPago; }
    public void setIdPago(int idPago) { this.idPago = idPago; }

    public Pedido getPedido() { return pedido; }
    public void setPedido(Pedido pedido) { this.pedido = pedido; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    public double getMontoPagado() { return montoPagado; }
    public void setMontoPagado(double montoPagado) { this.montoPagado = montoPagado; }

    public double getMontoTotal() { return montoTotal; }
    public void setMontoTotal(double montoTotal) { this.montoTotal = montoTotal; }

    public String getMetodoPago() { return metodoPago; }
    public void setMetodoPago(String metodoPago) { this.metodoPago = metodoPago; }

    public boolean isCompletado() { return completado; }
    public void setCompletado(boolean completado) { this.completado = completado; }

    public String getNumeroComprobante() { return numeroComprobante; }
    public void setNumeroComprobante(String numeroComprobante) { this.numeroComprobante = numeroComprobante; }

    public String getBanco() { return banco; }
    public void setBanco(String banco) { this.banco = banco; }

    public String getObservaciones() { return observaciones; }
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }
}
