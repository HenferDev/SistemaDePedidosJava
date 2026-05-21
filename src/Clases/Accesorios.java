/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Hensser
 */
public class Accesorios {
    private int idAccesorio;
    private String nombre;
    private String tipo; 
    private String marca;
    private int cantidad; 
    private double precio;
    
    public Accesorios() {
               
        
    }

    public Accesorios(int idAccesorio, String nombre, String tipo, String marca, int cantidad, double precio) {
        this.idAccesorio = idAccesorio;
        this.nombre = nombre;
        this.tipo = tipo;
        this.marca = marca;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getIdAccesorio() {
        return idAccesorio;
    }

    public void setIdAccesorio(int idAccesorio) {
        this.idAccesorio = idAccesorio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
