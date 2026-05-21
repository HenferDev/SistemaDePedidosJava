/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Hensser
 */
public class Cliente extends Persona {

    private String nit;
    private String tipoCliente;         
    private int puntosAcumulados;
    private String metodoPagoFavorito;
    private String direccionEntrega;
    private int pedidosRealizados;
    private double totalGastado;
    private boolean activoEnPromos;
    private String usuario;
    private String contrasena;

    public Cliente() {}

    public Cliente(int id, String nombre, String apellido, String telefono, String direccion,
                   String correo, String dpi, String genero, String fechaNacimiento, boolean activo,
                   String nit, String tipoCliente, int puntosAcumulados, String metodoPagoFavorito,
                   String direccionEntrega, int pedidosRealizados, double totalGastado,
                   boolean activoEnPromos, String usuario, String contrasena) {

        super(id, nombre, apellido, telefono, direccion, correo, dpi, genero, fechaNacimiento, activo);

        this.nit = nit;
        this.tipoCliente = tipoCliente;
        this.puntosAcumulados = puntosAcumulados;
        this.metodoPagoFavorito = metodoPagoFavorito;
        this.direccionEntrega = direccionEntrega;
        this.pedidosRealizados = pedidosRealizados;
        this.totalGastado = totalGastado;
        this.activoEnPromos = activoEnPromos;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public void mostrarCliente() {
        System.out.println("Cliente: " + getNombre() + " " + getApellido());
        System.out.println("NIT: " + nit + " | Tipo: " + tipoCliente + " | Puntos: " + puntosAcumulados);
    }

    public void agregarPuntos(int puntos) {
        puntosAcumulados += puntos;
    }

    public void canjearPuntos(int puntos) {
        if (puntos <= puntosAcumulados) {
            puntosAcumulados -= puntos;
            System.out.println("Puntos canjeados correctamente.");
        } else {
            System.out.println("No tiene suficientes puntos.");
        }
    }

    public void registrarCompra(double monto) {
        pedidosRealizados++;
        totalGastado += monto;
    }

    public void actualizarDireccionEntrega(String nuevaDireccion) {
        direccionEntrega = nuevaDireccion;
    }

    public boolean verificarAcceso(String usuarioIngresado, String contrasenaIngresada) {
        return usuario.equals(usuarioIngresado) && contrasena.equals(contrasenaIngresada);
    }

    public void mostrarHistorial() {
        System.out.println("Cliente: " + getNombre() + " | Pedidos: " + pedidosRealizados + " | Total gastado: Q" + totalGastado);
    }

    public String getNit() { return nit; }
    public void setNit(String nit) { this.nit = nit; }

    public String getTipoCliente() { return tipoCliente; }
    public void setTipoCliente(String tipoCliente) { this.tipoCliente = tipoCliente; }

    public int getPuntosAcumulados() { return puntosAcumulados; }
    public void setPuntosAcumulados(int puntosAcumulados) { this.puntosAcumulados = puntosAcumulados; }

    public String getMetodoPagoFavorito() { return metodoPagoFavorito; }
    public void setMetodoPagoFavorito(String metodoPagoFavorito) { this.metodoPagoFavorito = metodoPagoFavorito; }

    public String getDireccionEntrega() { return direccionEntrega; }
    public void setDireccionEntrega(String direccionEntrega) { this.direccionEntrega = direccionEntrega; }

    public int getPedidosRealizados() { return pedidosRealizados; }
    public void setPedidosRealizados(int pedidosRealizados) { this.pedidosRealizados = pedidosRealizados; }

    public double getTotalGastado() { return totalGastado; }
    public void setTotalGastado(double totalGastado) { this.totalGastado = totalGastado; }

    public boolean isActivoEnPromos() { return activoEnPromos; }
    public void setActivoEnPromos(boolean activoEnPromos) { this.activoEnPromos = activoEnPromos; }

    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }

    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }
}