/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;
import Clases.Accesorios;
import BD.ConexionBD;
import java.sql.*;
import java.util.List;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Hensser
 */
public class AccesoriosDB {
    public void agregarAccesorio(Accesorios a) {
        String sql = "INSER INTO accesorios (nombre, tipo, cantidad) VALUES (?, ?, ?)";
        try (Connection con = ConexionBD.conectar();
              
        PreparedStatement ps = con.prepareStatement(sql)) {
        
        ps.setString(1, a.getNombre());
        ps.setString(2, a.getTipo());
        ps.setInt(3, a.getCantidad());
        ps.executeUpdate();   
        JOptionPane.showMessageDialog(null,"Accesorio agregado con exito");
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al agregar accesorio" + e.getMessage());
            }
                        
    }
        public void EditarAccesorio(Accesorios a) {
        String sql = "UPDATE accesorios (nombre=?, tipo=?. cantidad=? WHERE id_accesorio=?";
        try (Connection con = ConexionBD.conectar();
              
        PreparedStatement ps = con.prepareStatement(sql)) {
        
        ps.setString(1, a.getNombre());
        ps.setString(2, a.getTipo());
        ps.setInt(3, a.getCantidad());
        ps.setInt(4, a.getIdAccesorio());
        ps.executeUpdate();   
        JOptionPane.showMessageDialog(null,"Accesorio actualizado con exito");
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al actualizar accesorio" + e.getMessage());
            }
                        
    }
        public void EliminarAccesorio(Accesorios a) {
        String sql = "DELETE FROM accesorios WHERE id_accesorio=?";
        try (Connection con = ConexionBD.conectar();
              
        PreparedStatement ps = con.prepareStatement(sql)) {
        
        ps.setInt(1, a.getIdAccesorio());
        ps.executeUpdate();   
        JOptionPane.showMessageDialog(null,"Accesorio eliminado con exito");
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al eliminar accesorio" + e.getMessage());
        }
        
         }
        public List<Accesorios> listarAccesorios() {
        List<Accesorios> lista = new ArrayList<>();

    String sql = "SELECT * FROM accesorios";
    try (Connection con = ConexionBD.conectar();
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery(sql)) {

        while (rs.next()) {
            Accesorios a = new Accesorios();
            a.setIdAccesorio(rs.getInt("id_accesorio"));
            a.setNombre(rs.getString("nombre"));
            a.setTipo(rs.getString("tipo"));
            a.setCantidad(rs.getInt("cantidad"));
            lista.add(a);
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al listar: " + e.getMessage());
    }

    return lista;
}
}

        
        
                