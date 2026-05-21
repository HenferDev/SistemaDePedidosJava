/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author Hensser
 */
public class Main {
        public static void main(String[] args) {
        // Intentar conectar
        Connection prueba = ConexionBD.conectar();

        if (prueba != null) {
            System.out.println("Prueba de conexión completada correctamente.");
            try {
                prueba.close(); // cerrar conexión
                System.out.println("Conexión cerrada.");
            } catch (SQLException e) {
                System.out.println("Error al cerrar: " + e.getMessage());
            }
        } else {
            System.out.println("No se pudo establecer conexión.");
        }
    }
}

  
