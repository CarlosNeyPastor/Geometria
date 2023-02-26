package interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
//import inicio.Login; // Import de clase creada
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Opciones extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	private static Opciones ventanaOpciones;
	
	// Singleton
	
	public static Opciones getSesionInstance() {
		if (ventanaOpciones == null) {
			ventanaOpciones = new Opciones();
		}
		return ventanaOpciones;
	}
	
	// Ventana	
	public Opciones() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\eclipse-workspace\\Geometria\\icons\\geo.png"));
		setTitle("Opciones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 262, 239);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		// Boton nueva prueba
		JButton btnNuevoPrueba = new JButton("Nueva prueba");
		btnNuevoPrueba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new inicio.Login().setVisible(true);
				dispose();
			}
		});
		btnNuevoPrueba.setBounds(10, 11, 225, 53);
		contentPane.add(btnNuevoPrueba);
		
		// Boton Repetir prueba
		JButton btnRepetirPrueba = new JButton("Repetir prueba");
		btnRepetirPrueba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prueba prueba = Prueba.getSesionInstance();
				prueba.setVisible(true);
				dispose();
			}
		});
		btnRepetirPrueba.setBounds(10, 75, 225, 53);
		contentPane.add(btnRepetirPrueba);
		
		// Boton salir
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setBounds(10, 139, 225, 53);
		contentPane.add(btnSalir);
	}

}
