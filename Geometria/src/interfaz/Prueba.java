package interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Prueba extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static Prueba ventanaPrueba;
	private JTextField textPregunta;
	
	// Singleton
	
	public static Prueba getSesionInstance() {
		if (ventanaPrueba == null) {
			ventanaPrueba = new Prueba();
		}
		return ventanaPrueba;
	}
	
	// Ventana	
	public Prueba() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\eclipse-workspace\\Geometria\\icons\\geo.png"));
		setTitle("Prueba");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		// Boton falso
		JButton btnFalso = new JButton("Falso");
		btnFalso.setBounds(213, 215, 204, 120);
		contentPane.add(btnFalso);
		
		// Boton verdadero
		JButton btnVerdadero = new JButton("Verdadero");
		btnVerdadero.setBounds(10, 215, 204, 120);
		contentPane.add(btnVerdadero);
		
		
		// Cuadro para mostrar pregutnas
		textPregunta = new JTextField();
		textPregunta.setBounds(10, 58, 407, 146);
		contentPane.add(textPregunta);
		textPregunta.setColumns(10);
		textPregunta.setBackground(new Color(240, 240, 240));
		textPregunta.setEditable(false);
		
		//#############//
		// Corregir    //
		//#############//
		
		// Boton finalizar prueba
		JButton btnFinalizarPrueba = new JButton("Finalizar prueba");
		btnFinalizarPrueba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Opciones pruebaOpciones = Opciones.getSesionInstance();
				pruebaOpciones.setVisible(true);
				dispose();
			}
		});
		btnFinalizarPrueba.setBounds(252, 346, 165, 23);
		contentPane.add(btnFinalizarPrueba);

		

	}
}
