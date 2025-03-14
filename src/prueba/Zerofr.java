package prueba;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Zerofr extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField oct01;
	private JTextField oct02;
	private JTextField oct03;
	private JTextField oct04;
	private JTextField oct05;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zerofr frame = new Zerofr();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Zerofr() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn = new JButton("Clk");
		btn.setBounds(167, 120, 47, 23);
		contentPane.add(btn);
		
		JPanel panel01 = new JPanel();
		panel01.setBackground(new Color(128, 128, 64));
		panel01.setBounds(276, 122, 100, 100);
		contentPane.add(panel01);
		
		JButton btnNewButton = new JButton("New button");
		panel01.add(btnNewButton);
		
		JPanel panel02 = new JPanel();
		panel02.setBounds(10, 200, 10, 10);
		contentPane.add(panel02);
		
	
	}
}
