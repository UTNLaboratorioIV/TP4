package principal;


import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Armamos el marco principal
        JFrame frame = new JFrame("Selección Múltiple");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocation(500, 250);
        frame.setLayout(new GridLayout(4, 1));
        

        
        // Panel para seleccionar sistema operativo
        JPanel soPanel = new JPanel();
        soPanel.setBorder(BorderFactory.createTitledBorder("Sistema Operativo"));
        ButtonGroup soGrupo = new ButtonGroup();
        JRadioButton windowsButton = new JRadioButton("Windows");
        JRadioButton macButton = new JRadioButton("Mac");
        JRadioButton linuxButton = new JRadioButton("Linux");
        soGrupo.add(windowsButton);
        soGrupo.add(macButton);
        soGrupo.add(linuxButton);
        soPanel.add(windowsButton);
        soPanel.add(macButton);
        soPanel.add(linuxButton);
        
        // Panel para seleccionar especialidades
        JPanel especialidadesPanel = new JPanel();
        especialidadesPanel.setBorder(BorderFactory.createTitledBorder("Especialidades"));
        JCheckBox programmingCheckBox = new JCheckBox("Programación");
        JCheckBox designCheckBox = new JCheckBox("Diseño");
        JCheckBox gamingCheckBox = new JCheckBox("Gaming");
        especialidadesPanel.add(programmingCheckBox);
        especialidadesPanel.add(designCheckBox);
        especialidadesPanel.add(gamingCheckBox);

        // Panel para ingresar horas
        JPanel horasPanel = new JPanel();
        horasPanel.setBorder(BorderFactory.createTitledBorder("Horas en la computadora"));
        JLabel horasLabel = new JLabel("Horas:");
        JTextField horasField = new JTextField(5);
        horasPanel.add(horasLabel);
        horasPanel.add(horasField);

        // Botones
        JPanel botonPanel = new JPanel();
        JButton aceptarButton = new JButton("Aceptar");
        JButton cerrarButton = new JButton("Cerrar");
        botonPanel.add(aceptarButton);
        botonPanel.add(cerrarButton);
        
        
     // Agregamos paneles al marco
        frame.add(soPanel);
        frame.add(especialidadesPanel);
        frame.add(horasPanel);
        frame.add(botonPanel);

        // Hacemos visible la ventana
        frame.setVisible(true);
        
        

	}

}

