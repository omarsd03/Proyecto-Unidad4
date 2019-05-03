/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectounidad4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
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
    
    public Connection ConectaInformix() throws ClassNotFoundException, SQLException {
        
        String cmd = null;
        int rc;
        
        Class.forName("com.informix.jdbc.IfxDriver");
        String driver = "jdbc:informix-sqli://localhost:9091:INFORMIXSERVER=Localhost";
        conexion = DriverManager.getConnection(driver, cbUsuarios.getSelectedItem().toString(), txtPassword.getText());
        // conexion = DriverManager.getConnection("jdbc:informix-sqli://localhost:9091:INFORMIXSERVER=Localhost;user=informix;password=zmur300");
        System.out.println("Conexion Establecida!! :D");
        
        try {
            Statement stmt = conexion.createStatement();
            cmd = "database bdejemplo;";
            rc = stmt.executeUpdate(cmd);
            stmt.close();
            System.out.println("Se testeo la correctamente la BD");
        } catch (SQLException e) {
            System.out.println("ERROR: execution failed - statement:" + cmd);
            System.out.println("ERROR: " + e.getMessage());
        }
        
        return conexion;
        
    }
    
    public Connection ConectaOracle() throws SQLException {
        
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        String driver = "jdbc:oracle:thin:@localhost:1521:XE";
        conexion = DriverManager.getConnection(driver, cbUsuarios.getSelectedItem().toString(), txtPassword.getText());
        System.out.println("Conexion Establecida!! :D");
        
        return conexion;
        
    }
    
}
