package frame;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AppGrafica extends JFrame{

	private JPanel contentPane;
	
	public AppGrafica() {
		
		// Contenedor.
		
		setTitle("Saludador");
		
		setBounds(500, 200, 500, 250);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		
		setContentPane(contentPane);
		
		// Componentes
		// Mensaje.
		JLabel mensaje = new JLabel("Escribe un nombre para saludar");
		mensaje.setBounds(155, 50, 250, 50);
		contentPane.add(mensaje);
		
		// TextArea.
		TextField inputNombre = new TextField();
		inputNombre.setBounds(120, 100, 250, 30);
		contentPane.add(inputNombre);
		
		// Boton.
		JButton botonEnviar = new JButton("Saludar");
		botonEnviar.setBounds(200, 140, 80, 25);
		contentPane.add(botonEnviar);
		
		// Eventos y listeners.
		botonEnviar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola " + inputNombre.getText() + " !");
				
			}
		});	
		
	}
	
}
