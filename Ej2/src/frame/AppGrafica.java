package frame;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class AppGrafica extends JFrame {

	private JPanel contentPane;
	private JLabel mensaje;
	private JTextField titulo;
	private JComboBox<Object> menu;

	public AppGrafica() {
		
//		Contenedor.
		setTitle("Peliculas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 200);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

//		Mensaje.
		mensaje = new JLabel("Introduzca una pelicula");
		mensaje.setBounds(20, 20, 190, 20);
		contentPane.add(mensaje);

//		Titulo.
		titulo = new JTextField();
		titulo.setBounds(20, 50, 99, 26);
		contentPane.add(titulo);

//		Mensaje.
		JLabel listaPeliculas = new JLabel("PELICLUAS");
		listaPeliculas.setBounds(200, 24, 68, 13);
		contentPane.add(listaPeliculas);

//		Menu de peliculas.
		menu = new JComboBox<>();
		menu.setBounds(200, 51, 141, 22);
		contentPane.add(menu);
		menu.addItem("Casino");
		menu.addItem("Uno de los nuestros");
		menu.addItem("Scarface");

//		Boton.
		JButton boton = new JButton("AGREGAR");
		boton.setBounds(20, 86, 90, 21);
		contentPane.add(boton);
		boton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				menu.addItem(titulo.getText());
				
			}
		});

	}
}