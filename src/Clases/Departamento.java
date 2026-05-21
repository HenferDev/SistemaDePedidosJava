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
public class Departamento {
    private int idDepartamento;
    private String nombre;
    private String ubicacion;
    private String telefono;
    private String correoContacto;
    private String encargado;
    private double presupuesto;
    private int cantidadEmpleados;
    private boolean activo;
    private ArrayList<Empleado> listaEmpleados;  

    public Departamento() {
        listaEmpleados = new ArrayList<>();
    }

    public Departamento(int idDepartamento, String nombre, String ubicacion, String telefono,
                        String correoContacto, String encargado, double presupuesto,
                        int cantidadEmpleados, boolean activo) {
        this.idDepartamento = idDepartamento;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        this.correoContacto = correoContacto;
        this.encargado = encargado;
        this.presupuesto = presupuesto;
        this.cantidadEmpleados = cantidadEmpleados;
        this.activo = activo;
        this.listaEmpleados = new ArrayList<>();
    }


    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
        cantidadEmpleados++;
    }

  
    public void eliminarEmpleado(Empleado empleado) {
        listaEmpleados.remove(empleado);
        cantidadEmpleados--;
    }

    public void mostrarEmpleados() {
        System.out.println("Empleados del departamento " + nombre + ":");
        for (Empleado e : listaEmpleados) {
            System.out.println("- " + e.getNombre() + " " + e.getApellido() + " (" + e.getPuesto() + ")");
        }
    }

    public double calcularPresupuestoRestante(double gastos) {
        return presupuesto - gastos;
    }

    public void cambiarEncargado(String nuevoEncargado) {
        this.encargado = nuevoEncargado;
    }

    public void activar() { this.activo = true; }
    public void desactivar() { this.activo = false; }

    public void mostrarInfo() {
        System.out.println("Departamento: " + nombre + " | Encargado: " + encargado + 
                           " | Empleados: " + cantidadEmpleados + 
                           " | Presupuesto: Q" + presupuesto);
    }

    public int getIdDepartamento() { return idDepartamento; }
    public void setIdDepartamento(int idDepartamento) { this.idDepartamento = idDepartamento; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getCorreoContacto() { return correoContacto; }
    public void setCorreoContacto(String correoContacto) { this.correoContacto = correoContacto; }

    public String getEncargado() { return encargado; }
    public void setEncargado(String encargado) { this.encargado = encargado; }

    public double getPresupuesto() { return presupuesto; }
    public void setPresupuesto(double presupuesto) { this.presupuesto = presupuesto; }

    public int getCantidadEmpleados() { return cantidadEmpleados; }
    public void setCantidadEmpleados(int cantidadEmpleados) { this.cantidadEmpleados = cantidadEmpleados; }

    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }

    public ArrayList<Empleado> getListaEmpleados() { return listaEmpleados; }
    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) { this.listaEmpleados = listaEmpleados; }
}
    

