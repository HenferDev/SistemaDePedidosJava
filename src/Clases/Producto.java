/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Hensser
 */
public class Producto {
   private int idProducto;
    private String nombre;
    private String descripcion;
    private double precio;
    private String categoria;        
    private boolean disponible;
    private int cantidadStock;
    private String fechaIngreso;
    private double descuento;
    private String unidadMedida;       

    public Producto() {}

    public Producto(int idProducto, String nombre, String descripcion, double precio, String categoria,
                    boolean disponible, int cantidadStock, String fechaIngreso, double descuento, String unidadMedida) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
        this.disponible = disponible;
        this.cantidadStock = cantidadStock;
        this.fechaIngreso = fechaIngreso;
        this.descuento = descuento;
        this.unidadMedida = unidadMedida;
    }


    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " | Precio: Q" + precio + " | Categoría: " + categoria);
    }

    public double calcularPrecioFinal() {
        return precio - (precio * (descuento / 100));
    }

    public void reducirStock(int cantidadVendida) {
        if (cantidadVendida <= cantidadStock) {
            cantidadStock -= cantidadVendida;
        } else {
            System.out.println("No hay suficiente stock para " + nombre);
        }
    }

    public void aumentarStock(int cantidad) {
        cantidadStock += cantidad;
    }

    public void cambiarDisponibilidad(boolean estado) {
        disponible = estado;
    }

    public boolean hayStock() {
        return cantidadStock > 0;
    }

    public void aplicarDescuento(double nuevoDescuento) {
        this.descuento = nuevoDescuento;
    }

    public int getIdProducto() { return idProducto; }
    public void setIdProducto(int idProducto) { this.idProducto = idProducto; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    public int getCantidadStock() { return cantidadStock; }
    public void setCantidadStock(int cantidadStock) { this.cantidadStock = cantidadStock; }

    public String getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(String fechaIngreso) { this.fechaIngreso = fechaIngreso; }

    public double getDescuento() { return descuento; }
    public void setDescuento(double descuento) { this.descuento = descuento; }

    public String getUnidadMedida() { return unidadMedida; }
    public void setUnidadMedida(String unidadMedida) { this.unidadMedida = unidadMedida; }
}