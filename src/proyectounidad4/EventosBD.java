/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectounidad4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Omar
 */
public class EventosBD implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getActionCommand().equals("SELECT")) {
            System.out.println("Select Funciona!!");
        }
        
        if (e.getActionCommand().equals("INSERT")) {
            System.out.println("Insert Funciona!! :D");
        }
        
        if (e.getActionCommand().equals("UPDATE")) {
            System.out.println("Update Funciona!! :D");
        }
        
        if (e.getActionCommand().equals("DELETE")) {
            System.out.println("Delete Funciona :D");
        }
                
        
    }
    
}
