/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectounidad4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static proyectounidad4.VentanaBD.modelo;
import static proyectounidad4.VentanaBD.txtApellidos;
import static proyectounidad4.VentanaBD.txtCargo;
import static proyectounidad4.VentanaBD.txtId;
import static proyectounidad4.VentanaBD.txtNombre;
import static proyectounidad4.VentanaConexiones.cbUsuarios;
import static proyectounidad4.VentanaConexiones.txtPassword;
import static proyectounidad4.VentanaBD.modelo;

/**
 *
 * @author Omar
 */
public class Consultas {
    
    public void SeleccionaBD(Connection conexion) throws SQLException {
        
        modelo.setRowCount(0);
        
        String query = "SELECT * FROM empleados";
        Statement stmt = conexion.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        
        while(rs.next()){

            //modelo.setRowCount(2);

            Object[] fila = new Object[4];
            fila[0] = rs.getInt("id");
            fila[1] = rs.getString("nombre");
            fila[2] = rs.getString("apellidos");
            fila[3] = rs.getString("cargo");

            modelo.addRow(fila);
            
            System.out.print(rs.getInt("id"));
            System.out.print(rs.getString("nombre"));
            System.out.print(rs.getString("apellidos"));
            System.out.print(rs.getString("cargo"));

        }
        
    }
    
    public void InsertaBD(Connection conexion) throws SQLException {
        
        int id = Integer.parseInt(txtId.getText());
        String nombre = txtNombre.getText();
        String apellidos = txtApellidos.getText();
        String cargo = txtCargo.getText();
        
        String query = "INSERT INTO empleados VALUES (" + id + ", '" + nombre + "', '" + apellidos + "', '" + cargo + "');";
        PreparedStatement stmt = conexion.prepareStatement(query);
        stmt.executeUpdate();
        
        System.out.println("Se ha insertado el empleado");
        
    }
    
    public void ActualizaBD(Connection conexion) throws SQLException {
        
        int id = Integer.parseInt(txtId.getText());
        String nombre = txtNombre.getText();
        String apellidos = txtApellidos.getText();
        String cargo = txtCargo.getText();
        
        String query = "UPDATE empleados SET nombre='" + nombre + "', apellidos='" + apellidos + "', cargo='" + cargo + "' WHERE id=" + id;
        PreparedStatement stmt = conexion.prepareStatement(query);
        stmt.executeUpdate();
        
        System.out.println("Se ha actualizado el empleado");
        
    }
    
    public void EliminaBD(Connection conexion) throws SQLException {
        
        int id = Integer.parseInt(txtId.getText());
        
        String query = "DELETE FROM empleados WHERE id = " + id;
        PreparedStatement stmt = conexion.prepareStatement(query);
        stmt.executeUpdate();
        // Statement stmt = conexion.createStatement();
        //ResultSet rs = stmt.executeQuery(query);
        
        System.out.println("Se ha eliminado el empleado");
        
    }
    
}
