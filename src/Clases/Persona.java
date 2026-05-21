/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Hensser
 */
    
  public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String correo;
    private String dpi;
    private String genero;
    private String fechaNacimiento;
    private boolean activo;

    public Persona() {}

    public Persona(int id, String nombre, String apellido, String telefono, String direccion,
                   String correo, String dpi, String genero, String fechaNacimiento, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.dpi = dpi;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.activo = activo;
    }

    public void activar() { this.activo = true; }

    public void desactivar() { this.activo = false; }

    public boolean estaActivo() { return this.activo; }

    public String nombreCompleto() { return nombre + " " + apellido; }

    public void mostrarInformacion() {
        System.out.println("ID: " + id + " | " + nombreCompleto() + " | Tel: " + telefono + " | Activo: " + activo);
    }

    public void actualizarContacto(String nuevoTelefono, String nuevaDireccion, String nuevoCorreo) {
        this.telefono = nuevoTelefono;
        this.direccion = nuevaDireccion;
        this.correo = nuevoCorreo;
    }

    public boolean coincideNombre(String filtro) {
        if (filtro == null) return false;
        String base = nombreCompleto().toLowerCase();
        return base.contains(filtro.toLowerCase());
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getDpi() { return dpi; }
    public void setDpi(String dpi) { this.dpi = dpi; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public String getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }
}