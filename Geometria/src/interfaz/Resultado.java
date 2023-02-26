package interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Font;

public class Resultado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Component scroll;
	private static Resultado ventanaResultado;
	
	// Singleton
	
	public static Resultado getSesionInstance() {
		if (ventanaResultado == null) {
			ventanaResultado = new Resultado();
		}
		return ventanaResultado;
	}
	
	// Ventana	
	public Resultado() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\eclipse-workspace\\Geometria\\icons\\geo.png"));
		setTitle("Resultado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 154);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		// Boton Nuevo alumno
		JButton btnNuevoAlumno = new JButton("Nuevo alumno");
		btnNuevoAlumno.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNuevoAlumno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new inicio.Login().setVisible(true);
				dispose();
			}
		});
		btnNuevoAlumno.setBounds(10, 81, 138, 23);
		contentPane.add(btnNuevoAlumno);
		
		// Boton Repetir prueba
		JButton btnRepetirPrueba = new JButton("Repetir prueba");
		btnRepetirPrueba.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRepetirPrueba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prueba prueba = Prueba.getSesionInstance();
				prueba.setVisible(true);
				dispose();
			}
		});
		btnRepetirPrueba.setBounds(158, 81, 138, 23);
		contentPane.add(btnRepetirPrueba);
		
		// Boton Salir
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Opciones cerrar = Opciones.getSesionInstance();
				cerrar.setVisible(true);
				dispose();
			}
		});
		btnSalir.setBounds(306, 81, 111, 23);
		contentPane.add(btnSalir);
		
		// Area de texto de resultado
		JTextPane textResultado = new JTextPane();
		textResultado.setEditable(false);
		textResultado.setBounds(10, 11, 407, 59);
		contentPane.add(textResultado);
		textResultado.setBackground(new Color(240, 240, 240));
		textResultado.add(scroll);

		

	}
}
