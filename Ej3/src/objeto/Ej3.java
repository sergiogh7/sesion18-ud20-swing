package objeto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JSlider;

public class Ej3 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JRadioButton opcion1, opcion2, opcion3;
	private JLabel especialidad;
	private JCheckBox opcion1B, opcion2B, opcion3B;
	private JSlider slider;

//	Crea el frame
	public Ej3() {
		
//		Contenedor
		setTitle("Entrevista");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 375);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

//		Mensaje
		JLabel SO = new JLabel("Elije un sistema operativo");
		SO.setBounds(20, 22, 150, 13);
		contentPane.add(SO);

//		Radio button
//		Opcion1
		opcion1 = new JRadioButton("Windows", true);
		opcion1.setBounds(20, 41, 109, 23);
		contentPane.add(opcion1);
		
//		Opcion2
		opcion2 = new JRadioButton("Linux", false);
		opcion2.setBounds(20, 66, 109, 23);
		contentPane.add(opcion2);
		
//		Opcion3
		opcion3 = new JRadioButton("Mac", false);
		opcion3.setBounds(20, 91, 109, 23);
		contentPane.add(opcion3);
		
//		Button group
		ButtonGroup grupoB = new ButtonGroup();
		grupoB.add(opcion1);
		grupoB.add(opcion2);
		grupoB.add(opcion3);

		// Especialidad
		especialidad = new JLabel("Elije tu especialidad");
		especialidad.setHorizontalAlignment(SwingConstants.TRAILING);
		especialidad.setBounds(244, 22, 116, 13);
		contentPane.add(especialidad);

//		Checkbox
//		Opcion1
		opcion1B = new JCheckBox("Programación");
		opcion1B.setBounds(231, 42, 116, 21);
		contentPane.add(opcion1B);
//		Opcion2
		opcion2B = new JCheckBox("Diseño gráfico");
		opcion2B.setBounds(231, 67, 116, 21);
		contentPane.add(opcion2B);
//		Opcion3
		opcion3B = new JCheckBox("Administración");
		opcion3B.setBounds(231, 92, 116, 21);
		contentPane.add(opcion3B);

//		Slider
		slider = new JSlider();
		slider.setSnapToTicks(true);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMaximum(10);
		slider.setBounds(80, 137, 200, 69);
		contentPane.add(slider);

//		Boton seleccionar
		JButton boton = new JButton("Mostrar datos ");
		boton.setBounds(102, 227, 171, 21);
		contentPane.add(boton);
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String respuesta = "";
				if (opcion1.isSelected()) {
					respuesta += "Sistema operativo: Windows";
					
				} else if (opcion2.isSelected()) {
					respuesta += "Sistema operativo: Linux";
					
				} else {
					respuesta += "Sistema operativo: Mac";
					
				}
				if (opcion1B.isSelected()) {
					respuesta += "\n Especialidad: Programación";
					
				}
				if (opcion2B.isSelected()) {
					respuesta += "\n Especialidad: Diseño grafico";
					
				}
				if (opcion3B.isSelected()) {
					respuesta += "\n Especialidad: Administración";
					
				}
				JOptionPane.showMessageDialog(null, respuesta + "\n Horas: " + slider.getValue());
			}
		});

	}
}