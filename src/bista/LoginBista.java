package bista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kontrolatzaile.funtzioak.FuntzioErabilgarriak;
import modeloa.Aldagaiak;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class LoginBista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldErabiltzailea;
	private JPasswordField passwordFieldPasahitza;

	public LoginBista() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginBista.class.getResource(Aldagaiak.ikonoLogo)));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);
		
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel Titulua = new JPanel();
		contentPane.add(Titulua, BorderLayout.NORTH);
		Titulua.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitulua = new JLabel("Login"); 
		lblTitulua.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulua.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Titulua.add(lblTitulua, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textFieldErabiltzailea = new JTextField();
		textFieldErabiltzailea.setBounds(657, 150, 163, 20);
		panel.add(textFieldErabiltzailea);
		textFieldErabiltzailea.setColumns(10);
		
		JButton btnLog = new JButton("Login");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String erabiltzailea = textFieldErabiltzailea.getText();
				String pasahitza = new String(passwordFieldPasahitza.getPassword());
				if (FuntzioErabilgarriak.login(erabiltzailea, pasahitza)) {
					dispose();
				}
			}
		});
		btnLog.setBounds(558, 352, 89, 23);
		panel.add(btnLog);
		
		passwordFieldPasahitza = new JPasswordField();
		
		passwordFieldPasahitza.addKeyListener(new KeyAdapter() {
		@Override

		public void keyPressed(KeyEvent e) {

			if (e.getKeyCode() == KeyEvent.VK_ENTER) {

				// Simular el clic en el botón cuando se presiona Enter

				btnLog.doClick();
				// Deitu login botoia click funtzioa
			}

		}

	});
	
	//
	
		
		passwordFieldPasahitza.setBounds(657, 230, 163, 20);
		panel.add(passwordFieldPasahitza);
		
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(657, 352, 89, 23);
		panel.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("Erabiltzailea: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(532, 153, 89, 14);
		panel.add(lblNewLabel);
		
		JLabel lblPasahitza = new JLabel("Pasahitza:");
		lblPasahitza.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPasahitza.setBounds(532, 233, 89, 14);
		panel.add(lblPasahitza);
	}
}
