package interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;

public class Informacion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static Informacion ventanaInformacion;
	
	// Singleton
	
	public static Informacion getSesionInstace() {
		if (ventanaInformacion == null) {
			ventanaInformacion = new Informacion();
		}
		return ventanaInformacion;
	}
	
	public Informacion() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\eclipse-workspace\\Geometria\\icons\\geo.png"));
		setTitle("Acerca de...");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 317);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		// Area de texto no editable con información referenciado en Menu
		JTextArea textInformacion = new JTextArea();
		textInformacion.setText("Tarea Opcional\r\n\r\n"
				+ "Instituto: Instituto Tecnol\u00F3gico de Inform\u00E1tica\r\n"
				+ "Materia: Geometr\u00EDa\r\n"
				+ "Docente: Enzo Falc\u00F3n\r\n"
				+ "Grupo: 2BR\r\n"
				+ "Autor: Carlos Pastor\r\n\r\n"
				+ "Fecha l\u00EDmite de entrega: Lunes 08/08/2022 a las 23:59hs.");
		textInformacion.setBounds(10, 11, 413, 212);
		textInformacion.setBackground(new Color(240, 240, 240));
		contentPane.add(textInformacion);
		textInformacion.setEditable(false);
		
		
		// Boton cerrar
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setBounds(331, 234, 89, 23);
		contentPane.add(btnCerrar);
		
	}
}
