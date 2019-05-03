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
import static proyectounidad4.ConexionesBD.conexion;
import static proyectounidad4.VentanaBD.btnDelete;
import static proyectounidad4.VentanaBD.btnInsert;
import static proyectounidad4.VentanaBD.btnSelect;
import static proyectounidad4.VentanaBD.btnUpdate;
import static proyectounidad4.VentanaBD.lblApellidos;
import static proyectounidad4.VentanaBD.lblCargo;
import static proyectounidad4.VentanaBD.lblId;
import static proyectounidad4.VentanaBD.lblNombre;
import static proyectounidad4.VentanaBD.txtApellidos;
import static proyectounidad4.VentanaBD.txtCargo;
import static proyectounidad4.VentanaBD.txtId;
import static proyectounidad4.VentanaBD.txtNombre;
import static proyectounidad4.VentanaConexiones.cbUsuarios;

/**
 *
 * @author Omar
 */
public class EventosBD implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getActionCommand().equals("SELECT")) {
            System.out.println("Select Funciona!!");
            lblId.setVisible(false);
            txtId.setVisible(false);
            lblNombre.setVisible(false);
            txtNombre.setVisible(false);
            lblApellidos.setVisible(false);
            txtApellidos.setVisible(false);
            lblCargo.setVisible(false);
            txtCargo.setVisible(false);
            btnSelect.setVisible(true);
            btnInsert.setVisible(false);
            btnUpdate.setVisible(false);
            btnDelete.setVisible(false);
        }
        
        if (e.getActionCommand().equals("INSERT")) {
            System.out.println("Insert Funciona!! :D");
            lblId.setVisible(true);
            txtId.setVisible(true);
            lblNombre.setVisible(true);
            txtNombre.setVisible(true);
            lblApellidos.setVisible(true);
            txtApellidos.setVisible(true);
            lblCargo.setVisible(true);
            txtCargo.setVisible(true);
            btnSelect.setVisible(false);
            btnInsert.setVisible(true);
            btnUpdate.setVisible(false);
            btnDelete.setVisible(false);
        }
        
        if (e.getActionCommand().equals("UPDATE")) {
            System.out.println("Update Funciona!! :D");
            lblId.setVisible(true);
            txtId.setVisible(true);
            lblNombre.setVisible(true);
            txtNombre.setVisible(true);
            lblApellidos.setVisible(true);
            txtApellidos.setVisible(true);
            lblCargo.setVisible(true);
            txtCargo.setVisible(true);
            btnSelect.setVisible(false);
            btnInsert.setVisible(false);
            btnUpdate.setVisible(true);
            btnDelete.setVisible(false);
        }
        
        if (e.getActionCommand().equals("DELETE")) {
            System.out.println("Delete Funciona :D");
            lblId.setVisible(true);
            txtId.setVisible(true);
            lblNombre.setVisible(false);
            txtNombre.setVisible(false);
            lblApellidos.setVisible(false);
            txtApellidos.setVisible(false);
            lblCargo.setVisible(false);
            txtCargo.setVisible(false);
            btnSelect.setVisible(false);
            btnInsert.setVisible(false);
            btnUpdate.setVisible(false);
            btnDelete.setVisible(true);
        }
        
        if (e.getSource().equals(btnSelect)) {
            
            System.out.println("Esto Funciona!!");
            
            try {
                new Consultas().SeleccionaBD(conexion);
            } catch (SQLException ex) {
                Logger.getLogger(EventosBD.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        if (e.getSource().equals(btnInsert)) {
            
            System.out.println("Esto Funciona alv");
            
            try {
                new Consultas().InsertaBD(conexion);
            } catch (SQLException ex) {
                Logger.getLogger(EventosBD.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Tu no puedes hacer esto :/");
            }
            
        }
        
        if (e.getSource().equals(btnUpdate)) {
            
            System.out.println("Update Funciona");
            
            try {
                new Consultas().ActualizaBD(conexion);
            } catch (SQLException ex) {
                Logger.getLogger(EventosBD.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Tu no puedes hacer esto :/");
            }
            
        }
        
        if (e.getSource().equals(btnDelete)) {
            
            System.out.println("Esto Tambien funciona");
            
            try {
                new Consultas().EliminaBD(conexion);
            } catch (SQLException ex) {
                Logger.getLogger(EventosBD.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Tu no puedes hacer esto :/");
            }
            
        }
                
        
    }
    
}
