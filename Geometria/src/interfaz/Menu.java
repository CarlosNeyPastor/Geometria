package interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import data.Datos; // Import de clase creada
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	// Ventana	
	public Menu() {
		setResizable(false);
		setTitle("Men\u00FA principal");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\eclipse-workspace\\Geometria\\icons\\geo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		// Título 
		JLabel lblDefinicionesyPropiedades = new JLabel("Definiciones y propiedades");
		lblDefinicionesyPropiedades.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 33));
		lblDefinicionesyPropiedades.setBounds(271, 11, 505, 77);
		contentPane.add(lblDefinicionesyPropiedades);

		// Area de texto
		JTextArea textArea = new JTextArea();
		textArea.setBounds(268, 99, 545, 296);
		contentPane.add(textArea);
		textArea.setBackground(new Color(240, 240, 240));
		textArea.setEditable(false);
		
		//############################################//
		// Botones con informacion para area de texto //
		//############################################//
		
		// Definicios figura doble
		JButton btnFiguraDoble = new JButton("Figura doble");
		btnFiguraDoble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Una figura doble es una isometria si su imagen es igual a la preimagen.\n"
								+"Sus puntos pueden ser unidos o transformarse en otros puntos de la figura.");
			}
		});
		btnFiguraDoble.setBounds(10, 100, 213, 23);
		contentPane.add(btnFiguraDoble);
		
		// Definicion figura unida
		JButton btnFiguraUnida = new JButton("Figura unida");
		btnFiguraUnida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(" Una figura es unida en una isometria si todos sus puntos son unidos.");
			}
		});
		btnFiguraUnida.setBounds(10, 134, 213, 23);
		contentPane.add(btnFiguraUnida);
		
		// Definicion isometria
		JButton btnIsometria = new JButton("Isometria");
		btnIsometria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Es toda funcion biyectiva del plano en el plano que mantiene las distancias.\n"
						+ "Si f es una isometria entonces:\n"
						+ "f: �?€ â†’ �?€\n"
						+ "Para todos A y B pertenecientes al plano �?€ \n"
						+ "\n"
						+ "\n"
						+ "\n"
						+ "\n"
						+ "NOTA: Funcion biyectiva: es inyectiva y sobreyectiva.\n"
						+ "Si el un conjunto A es el dominio y un conjunto B el codominio,\n"
						+ "a cada elemento de A le corresponde un elemento de B distinto, y\n"
						+ "todos los elementos de B son imagenes de algun elemento de A.");
			}
		});
		btnIsometria.setBounds(10, 168, 213, 23);
		contentPane.add(btnIsometria);
		
		// Definicion punto unido
		JButton btnPuntoUnido = new JButton("Punto unido");
		btnPuntoUnido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Un punto es unido si se transforma en si mismo en una isometria.");
			}
		});
		btnPuntoUnido.setBounds(10, 202, 213, 23);
		contentPane.add(btnPuntoUnido);
		
		// Definicion antitraslacion
		JButton btnAntitraslacion = new JButton("Antitraslacion");
		btnAntitraslacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Es toda transformaciÃ³n del plano en si mismo igual al producto de una\n"
						+ "simetría axial por uan traslación paralela al eje de la simetría, siendo el eje de la\n"
						+ "antitraslacion, el de la simetria y la magnitud de la misma de la traslación.");
			}
		});
		btnAntitraslacion.setBounds(10, 236, 213, 23);
		contentPane.add(btnAntitraslacion);
		
		// Definicion simetria axial
		JButton btnSimetriaAxial = new JButton("Simetria axial");
		btnSimetriaAxial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("La simetrÃ­a axial (tambiÃ©n conocida como reflexion, u simetria rotacional,\n"
						+ "radial o cilÃ­ndrica) es la simetrÃ­a alrededor de un eje. Es el punto de traslacion y\n"
						+ "rotacion de modo que un sistema tiene simetria axial o axisimetria cuando todos los \n"
						+ "semiplanos tomados a partir de cierta matriz y contenido lo presentan identicas carÃ¡cterisitas.\n"
						+ "TambiÃ©n puede decirse que es una isometria indirecta o involutiva.");
			}
		});
		btnSimetriaAxial.setBounds(10, 270, 213, 23);
		contentPane.add(btnSimetriaAxial);
		
		// Definicion simetria
		JButton btnSimetriaCentral = new JButton("Simetria central");
		btnSimetriaCentral.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Se denomina simetria a la correspondencia que se registra entre la posicion, la forma y\n"
						+ "el tamaño de aquellos componentes que forman un todo. Central por su parte, es el adjetivo que\n"
						+ "refiere a lo vinculado a un centro (el espacio aquidista de los lÃ­mites de algo).");
			}
		});
		btnSimetriaCentral.setBounds(10, 304, 213, 23);
		contentPane.add(btnSimetriaCentral);
		
		// Definicion rotacion
		JButton btnRotacion = new JButton("Rotacion");
		btnRotacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Decimos que una figura plana tiene simetria rotacional cuando podemos encontrar un centro\n"
						+ "(llamado centro de rotaciÃ³n) de manera que si giramos la figura completa un cierto Angulo (mayor o \n"
						+ "igual al 0 y menor que 360 grados) la figura rotada coincide con la figura original");
			}
		});
		btnRotacion.setBounds(10, 338, 213, 23);
		contentPane.add(btnRotacion);
		
		// Definicion traslacion
		JButton btnTraslacion = new JButton("Traslacion");
		btnTraslacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Trasladar una figura geometrica es moverla de un lugar a otro sin rotarla.\n"
						+ "Matematicamente, una traslaciÃ³n \"desliza\" un elemento segÃºn a: Ta(p) = p + a");
			}
		});
		btnTraslacion.setBounds(10, 372, 213, 23);
		contentPane.add(btnTraslacion);
		
		// Definicio isometria directa e indirecta
		JButton btnIsometriaDirectaeIndirecta = new JButton("Isometria directa e indirecta");
		btnIsometriaDirectaeIndirecta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Una isometrÃ­a se dice directa si se obtiene solo mediante una traslaciÃ³n y una rotacion,\n"
						+ " llamÃ¡ndose indirecta si se emplean traslaciones o rotaciones con una simetrÃ­a axial. La isometrÃ­a\n"
						+ " directa conserva la disposicion horaria o antihoraria de los vÃ©rtices, mientras que la indirecta \n"
						+ "los invierte.");
			}
		});
		btnIsometriaDirectaeIndirecta.setBounds(10, 65, 213, 23);
		contentPane.add(btnIsometriaDirectaeIndirecta);
		
		// Definicion isometria involutiva
		JButton btnIsometriaInvolutiva = new JButton("Isometria involutiva");
		btnIsometriaInvolutiva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textArea.setText("En geometria trabajamos con representaciones grÃ¡ficas de los elementos matemÃ¡ticos.\n"
						+ " Podemos encontrar para cada punto, recta o plano de sus modelos una notaciÃ³n matemÃ¡tica que\n"
						+ " lo caracterice, por lo que en principio no deberÃ­amos hacer ninguna diferenciaciÃ³n respecto\n"
						+ " de la definiciÃ³n dada anteriormente. Sin embargo los elementos que usamos, aÃºn siendo \n "
						+ " abstractos, pueden manipularse como entes concretos (los puntos de una figura geomÃ©trica,\n"
						+ " por ejemplo) por lo que puede merecer la pena hablar de â€œtransformaciones involutivasâ€� para\n"
						+ " acercarnos al concepto en operaciones grÃ¡ficas.Para terminar esta pequeÃ±a introducciÃ³n al \n"
						+ " concepto de involuciÃ³n podemos discutir sobre algÃºn ejemplo que nos clarifique esta idea.\n"
						+ " Una transformaciÃ³n involutiva sencilla es la simetrÃ­a, tanto las axiales como las centrales.\n"
						+ " Si transformamos un punto P en Pâ€™ mediante una simetrÃ­a, es inmediato\n"
						+ " ver que al aplicar de nuevo la transformaciÃ³n a Pâ€™, llamÃ¡ndole Q, el transformado Qâ€™ \n"
						+ "coincide con el elemento original P.");
			}
		});
		btnIsometriaInvolutiva.setBounds(10, 406, 213, 23);
		contentPane.add(btnIsometriaInvolutiva);
		
		// Boton salir
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSalir.setBounds(707, 442, 117, 23);
		contentPane.add(btnSalir);
		
		// Boton con imagen para informacion
		JButton btnInformacion = new JButton("");
		btnInformacion.setIcon(new ImageIcon("D:\\eclipse-workspace\\Geometria\\icons\\Information.jpg"));
		btnInformacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				Informacion info = Informacion.getSesionInstace();
				info.setVisible(true);
			}
		});
		btnInformacion.setBounds(787, 11, 35, 33);
		contentPane.add(btnInformacion);
		
		// Boton realizar prueba
		JButton btnHacerPrueba = new JButton("Hacer prueba");
		btnHacerPrueba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prueba hacerPrueba = Prueba.getSesionInstance();
				hacerPrueba.setVisible(true);
				dispose();
			}
		});
		btnHacerPrueba.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnHacerPrueba.setBounds(572, 442, 117, 23);
		contentPane.add(btnHacerPrueba);
		
		// Etiqueta identificadora de usuario en menu principal
		JLabel textNombre = new JLabel();
		textNombre.setBounds(10, 11, 213, 14);
		contentPane.add(textNombre);
		Datos datos = Datos.getInstance();
		textNombre.setText("Te damos la bienvenida: "+ datos.getNombre()); 
	}
}
