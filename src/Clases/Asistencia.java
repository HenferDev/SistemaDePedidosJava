/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Hensser
 */
public class Asistencia {
    private int idAsistencia;
    private Empleado empleado;      
    private String fecha;
    private String horaEntrada;
    private String horaSalida;
    private boolean presente;
    private boolean retraso;
    private boolean justificada;
    private double horasTrabajadas;
    private String observaciones;
    private String tipoTurno;       

    public Asistencia() {}

    public Asistencia(int idAsistencia, Empleado empleado, String fecha, String horaEntrada, String horaSalida,
                      boolean presente, boolean retraso, boolean justificada, double horasTrabajadas,
                      String observaciones, String tipoTurno) {
        this.idAsistencia = idAsistencia;
        this.empleado = empleado;
        this.fecha = fecha;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.presente = presente;
        this.retraso = retraso;
        this.justificada = justificada;
        this.horasTrabajadas = horasTrabajadas;
        this.observaciones = observaciones;
        this.tipoTurno = tipoTurno;
    }


    public void registrarEntrada(String hora) {
        this.horaEntrada = hora;
        this.presente = true;
        System.out.println("Entrada registrada para " + empleado.getNombre() + " a las " + hora);
    }

    public void registrarSalida(String hora) {
        this.horaSalida = hora;
        System.out.println("Salida registrada para " + empleado.getNombre() + " a las " + hora);
    }

    public void calcularHoras(double horas) {
        this.horasTrabajadas = horas;
    }

    public void marcarRetraso() {
        this.retraso = true;
    }

    public void justificarFalta(String motivo) {
        this.justificada = true;
        this.observaciones = motivo;
    }

    public void mostrarResumen() {
        System.out.println("Empleado: " + empleado.getNombre() + " " + empleado.getApellido());
        System.out.println("Fecha: " + fecha + " | Entrada: " + horaEntrada + " | Salida: " + horaSalida);
        System.out.println("Presente: " + presente + " | Retraso: " + retraso + " | Justificada: " + justificada);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
    }

    public boolean asistenciaValida() {
        return presente && !justificada;
    }

    public int getIdAsistencia() { return idAsistencia; }
    public void setIdAsistencia(int idAsistencia) { this.idAsistencia = idAsistencia; }

    public Empleado getEmpleado() { return empleado; }
    public void setEmpleado(Empleado empleado) { this.empleado = empleado; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getHoraEntrada() { return horaEntrada; }
    public void setHoraEntrada(String horaEntrada) { this.horaEntrada = horaEntrada; }

    public String getHoraSalida() { return horaSalida; }
    public void setHoraSalida(String horaSalida) { this.horaSalida = horaSalida; }

    public boolean isPresente() { return presente; }
    public void setPresente(boolean presente) { this.presente = presente; }

    public boolean isRetraso() { return retraso; }
    public void setRetraso(boolean retraso) { this.retraso = retraso; }

    public boolean isJustificada() { return justificada; }
    public void setJustificada(boolean justificada) { this.justificada = justificada; }

    public double getHorasTrabajadas() { return horasTrabajadas; }
    public void setHorasTrabajadas(double horasTrabajadas) { this.horasTrabajadas = horasTrabajadas; }

    public String getObservaciones() { return observaciones; }
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }

    public String getTipoTurno() { return tipoTurno; }
    public void setTipoTurno(String tipoTurno) { this.tipoTurno = tipoTurno; }
}
