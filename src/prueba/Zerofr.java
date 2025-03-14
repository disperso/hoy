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
		btn.setBounds(286, 97, 60, 23);
		contentPane.add(btn);
		
		oct01 = new JTextField();
		oct01.setBounds(58, 41, 66, 20);
		contentPane.add(oct01);
		oct01.setColumns(10);
		
		oct02 = new JTextField();
		oct02.setColumns(10);
		oct02.setBounds(134, 41, 66, 20);
		contentPane.add(oct02);
		
		oct03 = new JTextField();
		oct03.setColumns(10);
		oct03.setBounds(210, 41, 66, 20);
		contentPane.add(oct03);
		
		oct04 = new JTextField();
		oct04.setColumns(10);
		oct04.setBounds(286, 41, 66, 20);
		contentPane.add(oct04);
		
		oct05 = new JTextField();
		oct05.setColumns(10);
		oct05.setBounds(175, 72, 66, 20);
		contentPane.add(oct05);
	}
}
