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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Omar
 */
public class VentanaBD {
    
    static JLabel lblId, lblNombre, lblApellidos, lblCargo;
    static JTextField txtId, txtNombre, txtApellidos, txtCargo;
    static JButton btnSelect, btnUpdate, btnInsert, btnDelete;
    
    VentanaBD() {
        
        JFrame f = new JFrame("CRUD BD");
        
        JPanel p = new JPanel();
        
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints restricciones = new GridBagConstraints();
        
        MisComponentes c = new MisComponentes();
        
        p.setLayout(gridBagLayout);
        f.setSize(400, 350);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JMenuBar contenedor = new JMenuBar();
        
        JMenu menuOpciones = new JMenu("Opciones");
        JMenuItem itemOpciones1 = new JMenuItem("SELECT");
        JMenuItem itemOpciones2 = new JMenuItem("INSERT");
        JMenuItem itemOpciones3 = new JMenuItem("UPDATE");
        JMenuItem itemOpciones4 = new JMenuItem("DELETE");
        
        itemOpciones1.addActionListener(new EventosBD());
        itemOpciones2.addActionListener(new EventosBD());
        itemOpciones3.addActionListener(new EventosBD());
        itemOpciones4.addActionListener(new EventosBD());
        
        menuOpciones.add(itemOpciones1);
        menuOpciones.add(itemOpciones2);
        menuOpciones.add(itemOpciones3);
        menuOpciones.add(itemOpciones4);
        
        contenedor.add(menuOpciones);
        
        f.setJMenuBar(contenedor);
        
        lblId = c.getLabel("ID");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblId, restricciones);
        
        p.add(lblId);
        
        txtId = c.getField(10);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 1;
        restricciones.gridy = 0;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(txtId, restricciones);
        
        p.add(txtId);
        
        lblNombre = c.getLabel("Nombre");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 0;
        restricciones.gridy = 1;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblNombre, restricciones);
        
        p.add(lblNombre);
        
        txtNombre = c.getField(10);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(txtNombre, restricciones);
        
        p.add(txtNombre);
        
        lblApellidos = c.getLabel("Apellidos");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 0;
        restricciones.gridy = 2;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblApellidos, restricciones);
        
        p.add(lblApellidos);
        
        txtApellidos = c.getField(10);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 1;
        restricciones.gridy = 2;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(txtApellidos, restricciones);
        
        p.add(txtApellidos);
        
        lblCargo = c.getLabel("Cargo");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 0;
        restricciones.gridy = 3;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblCargo, restricciones);
        
        p.add(lblCargo);
        
        txtCargo = c.getField(10);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 1;
        restricciones.gridy = 3;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(txtCargo, restricciones);
        
        p.add(txtCargo);
        
        btnSelect = c.getButton("Obtener empleados");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridwidth = 2; // Ancho de columnas
        restricciones.gridx = 0;
        restricciones.gridy = 4;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(btnSelect, restricciones);
        
        p.add(btnSelect);
        
        btnInsert = c.getButton("Agregar empleado");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridwidth = 2; // Ancho de columnas
        restricciones.gridx = 0;
        restricciones.gridy = 5;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(btnInsert, restricciones);
        
        p.add(btnInsert);
        
        btnUpdate = c.getButton("Actualizar empleado");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridwidth = 2; // Ancho de columnas
        restricciones.gridx = 0;
        restricciones.gridy = 6;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(btnUpdate, restricciones);
        
        p.add(btnUpdate);
        
        btnDelete = c.getButton("Eliminar empleado");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridwidth = 2; // Ancho de columnas
        restricciones.gridx = 0;
        restricciones.gridy = 7;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(btnDelete, restricciones);
        
        p.add(btnDelete);
        
        f.add(p);
        
        f.setVisible(true);
        
    }
    
}
