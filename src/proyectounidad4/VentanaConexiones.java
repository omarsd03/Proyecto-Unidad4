/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectounidad4;

import Componentes.MisComponentes;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Omar
 */
public class VentanaConexiones {
    
    static JLabel lblUsuarios, lblGestores;
    static JButton btnConectar, btnIngresar;
    static JCheckBox jcSelect, jcInsert, jcUpdate, jcDelete;
    static JComboBox cbUsuarios, cbGestores;
    
    VentanaConexiones() {
        
        JFrame f = new JFrame("Gestor de BD");
        
        JPanel p = new JPanel();
        
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints restricciones = new GridBagConstraints();
        
        MisComponentes c = new MisComponentes();
        
        p.setLayout(gridBagLayout);
        f.setSize(400, 350);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblUsuarios = c.getLabel("Usuarios");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblUsuarios, restricciones);
        
        p.add(lblUsuarios);
        
        lblGestores = c.getLabel("Gestores");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 1;
        restricciones.gridy = 0;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblGestores, restricciones);
        
        p.add(lblGestores);
        
        cbUsuarios = new JComboBox();
        cbUsuarios.addItem("Seleccione un Usuario");
        cbUsuarios.addItem("omarsd");
        cbUsuarios.addItem("fraankaf");
        cbUsuarios.addItem("kevin");
        cbUsuarios.addItem("pepe");
        cbUsuarios.addItem("root");
        cbUsuarios.addItem("postgres");
        cbUsuarios.addItem("informix");
        cbUsuarios.addItem("system");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 0;
        restricciones.gridy = 1;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(cbUsuarios, restricciones);
        
        p.add(cbUsuarios);
        
        cbGestores = new JComboBox();
        cbGestores.addItem("Seleccione un Gestor de BD");
        cbGestores.addItem("MySQL");
        cbGestores.addItem("PostgreSQL");
        cbGestores.addItem("Oracle");
        cbGestores.addItem("Informix");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(cbGestores, restricciones);
        
        p.add(cbGestores);
        
        btnConectar = c.getButton("Conectar");
        btnConectar.addActionListener(new EventosConexiones());
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridwidth = 2; // Ancho de columnas
        restricciones.gridx = 0;
        restricciones.gridy = 2;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(btnConectar, restricciones);
        
        p.add(btnConectar);
        
        jcSelect = c.getCheck("SELECT");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        // restricciones.gridwidth = 2; // Ancho de columnas
        restricciones.gridx = 0;
        restricciones.gridy = 3;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(jcSelect, restricciones);
        
        p.add(jcSelect);
        
        jcInsert = c.getCheck("INSERT");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        // restricciones.gridwidth = 2; // Ancho de columnas
        restricciones.gridx = 0;
        restricciones.gridy = 4;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(jcInsert, restricciones);
        
        p.add(jcInsert);
        
        jcUpdate = c.getCheck("UPDATE");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        // restricciones.gridwidth = 2; // Ancho de columnas
        restricciones.gridx = 0;
        restricciones.gridy = 5;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(jcUpdate, restricciones);
        
        p.add(jcUpdate);
        
        jcDelete = c.getCheck("DELETE");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        // restricciones.gridwidth = 2; // Ancho de columnas
        restricciones.gridx = 0;
        restricciones.gridy = 6;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(jcDelete, restricciones);
        
        p.add(jcDelete);
        
        btnIngresar = c.getButton("Ingresar");
        btnIngresar.addActionListener(new EventosConexiones());
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridwidth = 2; // Ancho de columnas
        // restricciones.gridheight = 2;
        restricciones.gridx = 0;
        restricciones.gridy = 7;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(btnIngresar, restricciones);
        
        p.add(btnIngresar);
         
        f.add(p);
        
        f.setVisible(true);
        
    }
    
}
