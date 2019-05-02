/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectounidad4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static proyectounidad4.VentanaConexiones.btnConectar;
import static proyectounidad4.VentanaConexiones.btnIngresar;

/**
 *
 * @author Omar
 */
public class EventosConexiones implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(btnConectar)) {
            System.out.println("Conectar Works");
        }
        
        if (e.getSource().equals(btnIngresar)) {
            System.out.println("Ingresar Works");
            new VentanaBD();
        }
        
    }
    
}
