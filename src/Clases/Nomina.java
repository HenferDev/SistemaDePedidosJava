/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Hensser
 */
public class Nomina {
    private int idNomina;
    private Empleado empleado;
    private String mes;
    private int anio;
    private double salarioBase;
    private double horasExtras;
    private double bonificacion;
    private double descuentos;
    private double totalPagar;
    private boolean pagada;
    private String fechaPago;

    public Nomina() {}
    
    public Nomina(int idNomina, Empleado empleado, String mes, int anio, double salarioBase,
                  double horasExtras, double bonificacion, double descuentos, boolean pagada, String fechaPago) {
        this.idNomina = idNomina;
        this.empleado = empleado;
        this.mes = mes;
        this.anio = anio;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
        this.bonificacion = bonificacion;
        this.descuentos = descuentos;
        this.pagada = pagada;
        this.fechaPago = fechaPago;
        this.totalPagar = 0;
    }
    public void calcularTotal() {
        totalPagar = salarioBase + horasExtras + bonificacion - descuentos;
    }

    public void registrarPago(String fecha) {
        if (totalPagar > 0) {
            pagada = true;
            fechaPago = fecha;
            System.out.println("Pago registrado para " + empleado.getNombre() + " por Q" + totalPagar);
        } else {
            System.out.println("Debe calcular el total antes de registrar el pago.");
        }
    }

    public void mostrarResumen() {
        System.out.println("Nómina #" + idNomina + " | Empleado: " + empleado.getNombre() + " " + empleado.getApellido());
        System.out.println("Mes: " + mes + " " + anio + " | Salario base: Q" + salarioBase);
        System.out.println("Bonificación: Q" + bonificacion + " | Descuentos: Q" + descuentos);
        System.out.println("Total a pagar: Q" + totalPagar + " | Estado: " + (pagada ? "Pagada" : "Pendiente"));
    }

    public void aplicarAumento(double porcentaje) {
        double aumento = salarioBase * (porcentaje / 100);
        salarioBase += aumento;
        System.out.println("Aumento aplicado: Q" + aumento);
    }

    public void aplicarDescuento(double monto) {
        descuentos += monto;
    }

    public void aplicarBonificacion(double monto) {
        bonificacion += monto;
    }
    public boolean estaPagada() {
        return pagada;
    }

    public int getIdNomina() { return idNomina; }
    public void setIdNomina(int idNomina) { this.idNomina = idNomina; }

    public Empleado getEmpleado() { return empleado; }
    public void setEmpleado(Empleado empleado) { this.empleado = empleado; }

    public String getMes() { return mes; }
    public void setMes(String mes) { this.mes = mes; }

    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

    public double getSalarioBase() { return salarioBase; }
    public void setSalarioBase(double salarioBase) { this.salarioBase = salarioBase; }

    public double getHorasExtras() { return horasExtras; }
    public void setHorasExtras(double horasExtras) { this.horasExtras = horasExtras; }

    public double getBonificacion() { return bonificacion; }
    public void setBonificacion(double bonificacion) { this.bonificacion = bonificacion; }

    public double getDescuentos() { return descuentos; }
    public void setDescuentos(double descuentos) { this.descuentos = descuentos; }

    public double getTotalPagar() { return totalPagar; }
    public void setTotalPagar(double totalPagar) { this.totalPagar = totalPagar; }

    public boolean isPagada() { return pagada; }
    public void setPagada(boolean pagada) { this.pagada = pagada; }

    public String getFechaPago() { return fechaPago; }
    public void setFechaPago(String fechaPago) { this.fechaPago = fechaPago; }
}
    
