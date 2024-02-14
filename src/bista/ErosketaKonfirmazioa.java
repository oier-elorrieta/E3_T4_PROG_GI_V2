package bista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modeloa.Aldagaiak;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import javax.swing.JProgressBar;

public class ErosketaKonfirmazioa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ErosketaKonfirmazioa frame = new ErosketaKonfirmazioa();
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
	public ErosketaKonfirmazioa() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ErosketaKonfirmazioa.class.getResource(Aldagaiak.ikonoLogo)));
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
		
		JLabel lblTitulua = new JLabel("Erosketa Konfirmatu");
		lblTitulua.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulua.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Titulua.add(lblTitulua, BorderLayout.NORTH);
		
		JPanel Content = new JPanel();
		contentPane.add(Content, BorderLayout.CENTER);
		Content.setLayout(new BorderLayout(0, 0));
		
		JProgressBar progressBar = new JProgressBar();
		Content.add(progressBar, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("                                                                                                ");
		Content.add(lblNewLabel, BorderLayout.WEST);
		
		JLabel lblNewLabel_1 = new JLabel("                                                                                                ");
		Content.add(lblNewLabel_1, BorderLayout.EAST);
	}
}
