/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectounidad4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static proyectounidad4.VentanaConexiones.cbUsuarios;
import static proyectounidad4.VentanaConexiones.txtPassword;

/**
 *
 * @author Omar
 */
public class ConexionesBD {
    
    static Connection conexion = null;
    
    public Connection ConectaMySQL() throws SQLException {
        
        String driver = "jdbc:mysql://localhost/bdejemplo";
        //conexion = DriverManager.getConnection(driver, "root", "omar");
        conexion = DriverManager.getConnection(driver, cbUsuarios.getSelectedItem().toString(), txtPassword.getText());
        System.out.println("Conexion Establecida!! :D");
        return conexion;
        
    }
    
    public Connection ConectaPostgreSQL() throws SQLException {
        
        String driver = "jdbc:postgresql://localhost/bdejemplo";
        conexion = DriverManager.getConnection(driver, cbUsuarios.getSelectedItem().toString(), txtPassword.getText());
        System.out.println("Conexion Establecida!! :D");
        
        return conexion;
        
    }
    
}
