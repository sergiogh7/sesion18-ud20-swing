package objeto;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;

public class Ej4 extends JFrame {

	private JPanel contentPane;
	private JTextField op1;
	private JTextField op2;
	private JTextField resultado;
	private JButton restar;
	private JButton sumar;
	private JButton multiplicar;
	private JButton dividir;
	private JButton acercaDe;
	private JButton salir;
	private JLabel operador1M;
	private JLabel operador2M;
	private JLabel resultadoM;

	public Ej4() {
		
//		CONTENEDOR
		setTitle("<<<<<<<<< MINI CALCULADORA >>>>>>>>>");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 450, 310);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

//		MENSAJE
		operador1M = new JLabel("Operador 1:");
		operador1M.setBounds(53, 30, 87, 13);
		contentPane.add(operador1M);

		operador2M = new JLabel("Operador 2:");
		operador2M.setBounds(53, 81, 87, 13);
		contentPane.add(operador2M);

		resultadoM = new JLabel("Resultado:");
		resultadoM.setBounds(53, 131, 87, 13);
		contentPane.add(resultadoM);

//		OPERADOR 1
		op1 = new JTextField();
		op1.setBounds(150, 30, 96, 19);
		contentPane.add(op1);

//		OPERADOR 2
		op2 = new JTextField();
		op2.setBounds(150, 80, 96, 19);
		contentPane.add(op2);

//		RESULTADO
		resultado = new JTextField();
		resultado.setBounds(150, 129, 96, 19);
		contentPane.add(resultado);

//		SUMA
		sumar = new JButton("+");
		sumar.setBounds(311, 27, 50, 25);
		contentPane.add(sumar);
		
//		Cuando el usuario haga click muestra resultado de la suma
		sumar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String oper1 = op1.getText();
				String oper2 = op2.getText();
				int num1 = Integer.parseInt(oper1);
				int num2 = Integer.parseInt(oper2);
				int resul = num1 + num2;
				String total = String.valueOf(resul);
				resultado.setText(total);
				
			}
		});

//		RESTA
		restar = new JButton("-");
		restar.setBounds(311, 60, 50, 25);
		contentPane.add(restar);
		
		restar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String oper1 = op1.getText();
				String oper2 = op2.getText();
				int num1 = Integer.parseInt(oper1);
				int num2 = Integer.parseInt(oper2);
				int resul = num1 - num2;
				String total = String.valueOf(resul);
				resultado.setText(total);
				
			}
		});
		
//		MULTIPLICAR
		multiplicar = new JButton("X");
		multiplicar.setBounds(311, 92, 50, 25);
		contentPane.add(multiplicar);
		multiplicar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String oper1 = op1.getText();
				String oper2 = op2.getText();
				int num1 = Integer.parseInt(oper1);
				int num2 = Integer.parseInt(oper2);
				int resul = num1 * num2;
				String total = String.valueOf(resul);
				resultado.setText(total);
				
			}
		});

//		DIVIDIR
		dividir = new JButton("/");
		dividir.setBounds(311, 122, 50, 25);
		contentPane.add(dividir);
		dividir.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String oper1 = op1.getText();
				String oper2 = op2.getText();
				int num1 = Integer.parseInt(oper1);
				int num2 = Integer.parseInt(oper2);
				int resul = num1 / num2;
				String total = String.valueOf(resul);
				resultado.setText(total);
				
			}
		});
		
//		PARA MOSTRAR INFORMACION
		acercaDe = new JButton("INFO");
		acercaDe.setBounds(311, 152, 68, 30);
		contentPane.add(acercaDe);
		acercaDe.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Mini calculadora.\n\nProgramado por:\nSergio G.H");
				
			}
		});
		
//		PARA SALIR DE LA APP
		salir = new JButton("SALIR");
		salir.setBounds(311, 186, 68, 30);
		contentPane.add(salir);
		salir.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});

	}
}