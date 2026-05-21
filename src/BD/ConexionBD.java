/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;
import java.sql.*;

/**
 *
 * @author Hensser
 */


public class ConexionBD {

public static Connection conectar() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bd_expres",
                "root",
                ""
            );
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
        return con;
    }
}
