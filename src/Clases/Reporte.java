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
public class Reporte {
    private int idReporte;
    private String tipoReporte;        
    private String fechaGeneracion;
    private String horaGeneracion;
    private String periodo;            
    private String generadoPor;        
    private String descripcion;
    private int cantidadRegistros;
    private boolean guardado;
    private String rutaArchivo;       


    public Reporte() {}


    public Reporte(int idReporte, String tipoReporte, String fechaGeneracion, String horaGeneracion,
                   String periodo, String generadoPor, String descripcion, int cantidadRegistros,
                   boolean guardado, String rutaArchivo) {
        this.idReporte = idReporte;
        this.tipoReporte = tipoReporte;
        this.fechaGeneracion = fechaGeneracion;
        this.horaGeneracion = horaGeneracion;
        this.periodo = periodo;
        this.generadoPor = generadoPor;
        this.descripcion = descripcion;
        this.cantidadRegistros = cantidadRegistros;
        this.guardado = guardado;
        this.rutaArchivo = rutaArchivo;
    }


    public void generarReporteGeneral(String tipo) {
        this.tipoReporte = tipo;
        this.fechaGeneracion = "2025-10-23";
        this.horaGeneracion = "10:00 AM";
        System.out.println("Reporte generado: " + tipoReporte + " | Fecha: " + fechaGeneracion);
    }

    public void mostrarInfo() {
        System.out.println("Reporte #" + idReporte + " | Tipo: " + tipoReporte + " | Registros: " + cantidadRegistros);
        System.out.println("Generado por: " + generadoPor + " | Guardado: " + guardado);
    }

    public void guardar(String ruta) {
        this.rutaArchivo = ruta;
        this.guardado = true;
        System.out.println("Reporte guardado en: " + ruta);
    }

    public void generarReporteVentas(ArrayList<Pedido> pedidos) {
        double total = 0;
        for (Pedido p : pedidos) {
            total += p.getTotalPagar();
        }
        cantidadRegistros = pedidos.size();
        System.out.println("Reporte de Ventas generado. Total Q" + total + " en " + cantidadRegistros + " pedidos.");
    }

    public void generarReporteEmpleados(ArrayList<Empleado> empleados) {
        int activos = 0;
        for (Empleado e : empleados) {
            if (e.isActivo()) activos++;
        }
        cantidadRegistros = empleados.size();
        System.out.println("Empleados activos: " + activos + " de " + cantidadRegistros);
    }

    public void generarReporteClientes(ArrayList<Cliente> clientes) {
        int frecuentes = 0;
        for (Cliente c : clientes) {
            if (c.getTipoCliente().equalsIgnoreCase("Frecuente")) frecuentes++;
        }
        cantidadRegistros = clientes.size();
        System.out.println("Clientes frecuentes: " + frecuentes + " de " + cantidadRegistros);
    }

    public void mostrarResumenFinal() {
        System.out.println("Reporte " + tipoReporte + " generado por " + generadoPor +
                           " con " + cantidadRegistros + " registros el " + fechaGeneracion);
    }

    public int getIdReporte() { return idReporte; }
    public void setIdReporte(int idReporte) { this.idReporte = idReporte; }

    public String getTipoReporte() { return tipoReporte; }
    public void setTipoReporte(String tipoReporte) { this.tipoReporte = tipoReporte; }

    public String getFechaGeneracion() { return fechaGeneracion; }
    public void setFechaGeneracion(String fechaGeneracion) { this.fechaGeneracion = fechaGeneracion; }

    public String getHoraGeneracion() { return horaGeneracion; }
    public void setHoraGeneracion(String horaGeneracion) { this.horaGeneracion = horaGeneracion; }

    public String getPeriodo() { return periodo; }
    public void setPeriodo(String periodo) { this.periodo = periodo; }

    public String getGeneradoPor() { return generadoPor; }
    public void setGeneradoPor(String generadoPor) { this.generadoPor = generadoPor; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public int getCantidadRegistros() { return cantidadRegistros; }
    public void setCantidadRegistros(int cantidadRegistros) { this.cantidadRegistros = cantidadRegistros; }

    public boolean isGuardado() { return guardado; }
    public void setGuardado(boolean guardado) { this.guardado = guardado; }

    public String getRutaArchivo() { return rutaArchivo; }
    public void setRutaArchivo(String rutaArchivo) { this.rutaArchivo = rutaArchivo; }
}
    
    
