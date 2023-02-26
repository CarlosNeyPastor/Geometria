package inicio;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import data.Datos; // Import de clase creada

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField campo_Nombre;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static Login getSesionInstance() {
		return null;
	}
	// Ventana	
	public Login() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\eclipse-workspace\\Geometria\\icons\\geo.png"));
		setTitle("Te damos la bienvenida a");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 373, 166);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		// Boton Salir
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setBounds(258, 95, 89, 23);
		contentPane.add(btnSalir);
		
		// Campo Nombre
		campo_Nombre = new JTextField();
		campo_Nombre.setBounds(75, 64, 247, 20);
		contentPane.add(campo_Nombre);
		campo_Nombre.setColumns(10);
		
		// Etiqueta nombre
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNombre.setBounds(10, 67, 75, 14);
		contentPane.add(lblNombre);
		
		// Titulo
		JLabel lblTitulo = new JLabel("Apolonio");
		lblTitulo.setFont(new Font("Old English Text MT", Font.BOLD, 39));
		lblTitulo.setBounds(100, 11, 201, 45);
		contentPane.add(lblTitulo);
		
		// Boton aceptar
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			if (campo_Nombre.getText().isBlank()) { // Verifica campo Nombre no este en blanco
					JOptionPane.showMessageDialog(null, "El campo nombre no debe estar vacio",
						      "Error!", JOptionPane.ERROR_MESSAGE);
									
			}else {
				Datos datos = Datos.getInstance(); // Invocar instancia datos
				datos.setNombre(campo_Nombre.getText()); // Tomar texto de datos
				new interfaz.Menu().setVisible(true); // Invocar ventana Menu
				dispose(); // Cerrar ventana actual
				}	
			}
		});
		btnAceptar.setBounds(156, 95, 89, 23);
		contentPane.add(btnAceptar);
		
	}
}
