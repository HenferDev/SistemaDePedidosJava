/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;


import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Empleado emp1 = new Empleado(1, "Hensser", "Díaz", "5555-1234", "Esquipulas", "hensser@gmail.com", "1234567890101",
                "Masculino", "2003-05-20", true, "Cajero", 3500, "2023-01-01", "Ventas",
                160, 250, 50, "Matutino", "hensserD", "1234");

        Empleado emp2 = new Empleado(2, "María", "Gómez", "5555-5678", "Chiquimula", "maria@gmail.com", "9876543210101",
                "Femenino", "1998-07-12", true, "Gerente", 5500, "2022-10-10", "Administración",
                180, 500, 0, "Matutino", "mariaG", "5678");

        Cliente cli1 = new Cliente(1, "Carlos", "López", "5555-0001", "Esquipulas", "carlos@gmail.com", "3010123450101",
                "Masculino", "1995-09-18", true, "CF", "Frecuente", 120, "Tarjeta",
                "Zona 1, Esquipulas", 10, 850, true, "carlosL", "abcd");

        Cliente cli2 = new Cliente(2, "Laura", "Mendoza", "5555-0002", "Chiquimula", "laura@gmail.com", "4020123450101",
                "Femenino", "2001-03-15", true, "CF", "Regular", 30, "Efectivo",
                "Barrio El Centro", 4, 250, false, "lauraM", "xyz");

        Producto p1 = new Producto(1, "Café Americano", "Café tostado molido", 15.00, "Bebida", true, 50, "2025-10-23", 0, "vaso");
        Producto p2 = new Producto(2, "Sandwich Club", "Jamón, queso y vegetales", 30.00, "Comida", true, 30, "2025-10-23", 5, "unidad");
        Producto p3 = new Producto(3, "Brownie", "Chocolate artesanal", 20.00, "Postre", true, 40, "2025-10-23", 0, "unidad");

        Pedido pedido1 = new Pedido(1, "2025-10-23", "10:30 AM", cli1, "Tarjeta", "Pendiente");
        pedido1.agregarProducto(p1);
        pedido1.agregarProducto(p2);
        pedido1.agregarProducto(p3);
        pedido1.mostrarResumen();

        Pago pago1 = new Pago(1, pedido1, "2025-10-23", "11:00 AM", pedido1.getTotalPagar(),
                pedido1.getTotalPagar(), "Tarjeta", false, "R-1001", "Banco G&T", "Pago completado");
        pago1.registrarPago();
        pago1.generarComprobante();

        Asistencia asistencia1 = new Asistencia(1, emp1, "2025-10-23", "08:00", "16:00", true, false, false, 8, "", "Matutino");
        asistencia1.mostrarResumen();

        Nomina nom1 = new Nomina(1, emp1, "Octubre", 2025, 3500, 150, 250, 100, false, "");
        nom1.calcularTotal();
        nom1.mostrarResumen();
        nom1.registrarPago("2025-10-30");

        Departamento depto1 = new Departamento(1, "Ventas", "Sucursal Esquipulas", "5555-7890",
                "ventas@donNicolas.com", "María Gómez", 10000, 2, true);
        depto1.agregarEmpleado(emp1);
        depto1.agregarEmpleado(emp2);
        depto1.mostrarInfo();
        depto1.mostrarEmpleados();

        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(emp1);
        listaEmpleados.add(emp2);

        ArrayList<Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(cli1);
        listaClientes.add(cli2);

        ArrayList<Pedido> listaPedidos = new ArrayList<>();
        listaPedidos.add(pedido1);

        Reporte rep = new Reporte(1, "Ventas", "2025-10-23", "11:30 AM", "Mensual", "María Gómez",
                "Reporte general de ventas del mes", 0, false, "");
        rep.generarReporteVentas(listaPedidos);
        rep.generarReporteEmpleados(listaEmpleados);
        rep.generarReporteClientes(listaClientes);
        rep.guardar("C:/reportes/ventas_octubre.pdf");
        rep.mostrarResumenFinal();

        System.out.println("Sistema ejecutado correctamente. Datos de prueba cargados.");
    }
}
