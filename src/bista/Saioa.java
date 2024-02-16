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
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Saioa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Saioa frame = new Saioa();
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
	public Saioa() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Saioa.class.getResource(Aldagaiak.ikonoLogo)));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);
		
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel Titulua = new JPanel();
		contentPane.add(Titulua);
		Titulua.setLayout(null);
		
		JLabel lblTitulua = new JLabel("Saioa");
		lblTitulua.setBounds(0, 0, 1254, 37);
		lblTitulua.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulua.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Titulua.add(lblTitulua);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(464, 417, 459, 61);
		Titulua.add(comboBox);
		
		JLabel lblFilmArgazki = new JLabel("");
		lblFilmArgazki.setIcon(new ImageIcon(Saioa.class.getResource("/modeloa/img/karteldegia/Cazafantasmas.jpg")));
		lblFilmArgazki.setBounds(57, 0, 397, 629);
		Titulua.add(lblFilmArgazki);
			
		JLabel lblFilmSaioa = new JLabel("SAIOA:");
		lblFilmSaioa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFilmSaioa.setBounds(464, 360, 419, 46);
		Titulua.add(lblFilmSaioa);
		
		JLabel lblFilmEguna = new JLabel("EGUNA:");
		lblFilmEguna.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFilmEguna.setBounds(464, 105, 419, 46);
		Titulua.add(lblFilmEguna);

		
		JLabel lblFilmIzena = new JLabel("PELIKULA");
		lblFilmIzena.setHorizontalAlignment(SwingConstants.CENTER);
		lblFilmIzena.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblFilmIzena.setBounds(618, 48, 554, 46);
		Titulua.add(lblFilmIzena);
		
		JButton btnEzSaioa = new JButton("EZ");
		btnEzSaioa.setBounds(986, 550, 258, 79);
		Titulua.add(btnEzSaioa);
		
		JButton btnBaiSaioa = new JButton("BAI");
		btnBaiSaioa.setBounds(718, 550, 258, 79);
		Titulua.add(btnBaiSaioa);
	}
}
