package biblioteca.demo.util;

import java.awt.EventQueue;
import javax.swing.JFrame;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import biblioteca.demo.run.*;
import java.awt.BorderLayout;


/**
 * Punto de entrada principal que incluye botones para la ejecucion de las pantallas 
 * de las aplicaciones de ejemplo
 * y acciones de inicializacion de la base de datos.
 * No sigue MVC pues es solamente temporal para que durante el desarrollo se tenga posibilidad
 * de realizar acciones de inicializacion
 */
public class SwingMain {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { //NOSONAR codigo autogenerado
			public void run() {
				try {
					SwingMain window = new SwingMain();
					window.frame.setVisible(true);
					window.frame.setBounds(500,400,300,350);
					//window.frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace(); //NOSONAR codigo autogenerado
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SwingMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Main");
		frame.setBounds(0, 0, 287, 185);
		frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("BIENVENIDO A LA GESTIÓN DE BIBLIOTECAS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//BibliotecaView biblioteca = new BibliotecaView();	
			    BibliotecaLogin bb=new BibliotecaLogin();
			    
				//bb.getFrame().setVisible(true);
			
			}
		});
		frame.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		Database db=new Database(); //creo la base de datos de prueba
		
		db.createDatabase(false); //le paso el valor falso porque considero que no esta creada aun
		db.loadDatabase(); //cargo datos de prueba
		
	}
		
	public JFrame getFrame() { return this.frame; }
	
}
