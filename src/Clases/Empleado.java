/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Hensser
 */
public class Empleado extends Persona {
   
    private String puesto;
    private double salario;
    private String fechaIngreso;
    private String departamento;
    private int horasTrabajadas;
    private double bono;
    private double descuento;
    private String turno;
    private String usuario;
    private String contrasena;

    public Empleado() {}

    public Empleado(int id, String nombre, String apellido, String telefono, String direccion,
                    String correo, String dpi, String genero, String fechaNacimiento, boolean activo,
                    String puesto, double salario, String fechaIngreso, String departamento, int horasTrabajadas,
                    double bono, double descuento, String turno, String usuario, String contrasena) {

        super(id, nombre, apellido, telefono, direccion, correo, dpi, genero, fechaNacimiento, activo);
        this.puesto = puesto;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
        this.departamento = departamento;
        this.horasTrabajadas = horasTrabajadas;
        this.bono = bono;
        this.descuento = descuento;
        this.turno = turno;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    public void mostrarEmpleado() {
        System.out.println("Empleado: " + getNombre() + " " + getApellido());
        System.out.println("Puesto: " + puesto + " | Departamento: " + departamento);
        System.out.println("Salario base: Q" + salario);
    }

    public double calcularSalarioFinal() {
        return salario + bono - descuento;
    }

    public void registrarAsistencia(String fecha) {
        System.out.println("Empleado " + getNombre() + " registró asistencia el " + fecha);
    }

    public void cambiarDepartamento(String nuevoDepartamento) {
        departamento = nuevoDepartamento;
    }

    public void aumentarSalario(double porcentaje) {
        salario += salario * (porcentaje / 100);
    }

    public boolean verificarAcceso(String usuarioIngresado, String contrasenaIngresada) {
        return usuario.equals(usuarioIngresado) && contrasena.equals(contrasenaIngresada);
    }

    public void mostrarResumenPago() {
        System.out.println("Salario total de " + getNombre() + ": Q" + calcularSalarioFinal());
    }

    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public String getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(String fechaIngreso) { this.fechaIngreso = fechaIngreso; }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    public int getHorasTrabajadas() { return horasTrabajadas; }
    public void setHorasTrabajadas(int horasTrabajadas) { this.horasTrabajadas = horasTrabajadas; }

    public double getBono() { return bono; }
    public void setBono(double bono) { this.bono = bono; }

    public double getDescuento() { return descuento; }
    public void setDescuento(double descuento) { this.descuento = descuento; }

    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }

    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }

    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }
}
    
