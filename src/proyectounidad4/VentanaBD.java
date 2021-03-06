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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Omar
 */
public class VentanaBD {
    
    static JLabel lblId, lblNombre, lblApellidos, lblCargo;
    static JTextField txtId, txtNombre, txtApellidos, txtCargo;
    static JButton btnSelect, btnUpdate, btnInsert, btnDelete;
    static JTable tablaEmpleados;
    static DefaultTableModel modelo;
    
    VentanaBD() {
        
        JFrame f = new JFrame("CRUD de Bases de Datos");
        
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
        lblId.setVisible(false);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblId, restricciones);
        
        p.add(lblId);
        
        txtId = c.getField(10);
        txtId.setVisible(false);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 1;
        restricciones.gridy = 0;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(txtId, restricciones);
        
        p.add(txtId);
        
        lblNombre = c.getLabel("Nombre");
        lblNombre.setVisible(false);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 0;
        restricciones.gridy = 1;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblNombre, restricciones);
        
        p.add(lblNombre);
        
        txtNombre = c.getField(10);
        txtNombre.setVisible(false);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(txtNombre, restricciones);
        
        p.add(txtNombre);
        
        lblApellidos = c.getLabel("Apellidos");
        lblApellidos.setVisible(false);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 0;
        restricciones.gridy = 2;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblApellidos, restricciones);
        
        p.add(lblApellidos);
        
        txtApellidos = c.getField(10);
        txtApellidos.setVisible(false);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 1;
        restricciones.gridy = 2;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(txtApellidos, restricciones);
        
        p.add(txtApellidos);
        
        lblCargo = c.getLabel("Cargo");
        lblCargo.setVisible(false);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 0;
        restricciones.gridy = 3;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblCargo, restricciones);
        
        p.add(lblCargo);
        
        txtCargo = c.getField(10);
        txtCargo.setVisible(false);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 1;
        restricciones.gridy = 3;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(txtCargo, restricciones);
        
        p.add(txtCargo);
        
        btnSelect = c.getButton("Obtener empleados");
        btnSelect.addActionListener(new EventosBD());
        btnSelect.setVisible(false);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridwidth = 2; // Ancho de columnas
        restricciones.gridx = 0;
        restricciones.gridy = 4;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(btnSelect, restricciones);
        
        p.add(btnSelect);
        
        btnInsert = c.getButton("Agregar empleado");
        btnInsert.addActionListener(new EventosBD());
        btnInsert.setVisible(false);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridwidth = 2; // Ancho de columnas
        restricciones.gridx = 0;
        restricciones.gridy = 5;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(btnInsert, restricciones);
        
        p.add(btnInsert);
        
        btnUpdate = c.getButton("Actualizar empleado");
        btnUpdate.addActionListener(new EventosBD());
        btnUpdate.setVisible(false);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridwidth = 2; // Ancho de columnas
        restricciones.gridx = 0;
        restricciones.gridy = 6;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(btnUpdate, restricciones);
        
        p.add(btnUpdate);
        
        btnDelete = c.getButton("Eliminar empleado");
        btnDelete.addActionListener(new EventosBD());
        btnDelete.setVisible(false);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridwidth = 2; // Ancho de columnas
        restricciones.gridx = 0;
        restricciones.gridy = 7;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(btnDelete, restricciones);
        
        p.add(btnDelete);
        
        tablaEmpleados = new JTable();
        
        modelo = (DefaultTableModel) tablaEmpleados.getModel();
        tablaEmpleados.setModel(modelo);
        
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Cargo");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridwidth = 2;
        restricciones.gridx = 0;
        restricciones.gridy = 8;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(tablaEmpleados, restricciones);
        
        p.add(tablaEmpleados);
        
        f.add(p);
        
        f.setVisible(true);
        
    }
    
}
