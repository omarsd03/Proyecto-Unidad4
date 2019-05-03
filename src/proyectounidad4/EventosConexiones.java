/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectounidad4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static proyectounidad4.VentanaConexiones.btnConectar;
import static proyectounidad4.VentanaConexiones.btnIngresar;
import static proyectounidad4.VentanaConexiones.cbGestores;

/**
 *
 * @author Omar
 */
public class EventosConexiones implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(btnConectar)) {
            
            if (cbGestores.getSelectedItem().equals("MySQL")) {
                try {
                    new ConexionesBD().ConectaMySQL();
                    btnIngresar.setEnabled(true);
                } catch (SQLException ex) {
                    Logger.getLogger(EventosConexiones.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (cbGestores.getSelectedItem().equals("PostgreSQL")) {
                try {
                    new ConexionesBD().ConectaPostgreSQL();
                    btnIngresar.setEnabled(true);
                } catch (SQLException ex) {
                    Logger.getLogger(EventosConexiones.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
        
        if (e.getSource().equals(btnIngresar)) {
            System.out.println("Ingresar Works");
            new VentanaBD();
        }
        
    }
    
}
