package bista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kontrolatzaile.funtzioak.Funtzioak;
import modeloa.Aldagaiak;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ZinemaBista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public ZinemaBista() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ZinemaBista.class.getResource(Aldagaiak.ikonoLogo)));
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
		
		JLabel lblTitulua = new JLabel("Zinema");
		lblTitulua.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulua.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Titulua.add(lblTitulua, BorderLayout.NORTH);
		
		JScrollPane scrollPaneZinemak = new JScrollPane();
		contentPane.add(scrollPaneZinemak, BorderLayout.CENTER);
		
		JPanel panelZinemak = new JPanel();
		scrollPaneZinemak.setViewportView(panelZinemak);
		
		
		
		JButton btnElorrieta = new JButton("Elorrieta Zinema");
		btnElorrieta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnElorrieta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("ELORRIETA ZINEMA");
				Funtzioak.setIdZinema(0);
				
				Funtzioak.pelikulaBistaVisible();
				dispose();
			}
		});
		panelZinemak.setLayout(new GridLayout(0, 1, 0, 0));
		panelZinemak.add(btnElorrieta);
		
		JButton btnErandio = new JButton("Erandio Zinema");
		btnErandio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				// Deitu pelikula vista noiz zinema basauri da
				System.out.println("ERANDIO ZINEMA");
				Funtzioak.setIdZinema(1);
				
				Funtzioak.pelikulaBistaVisible();
				dispose();
			}
		});
		panelZinemak.add(btnErandio);
		
		JButton btnBarakaldo = new JButton("Barakaldo Zinema");
		btnBarakaldo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("BARAKALDO ZINEMA");
				Funtzioak.setIdZinema(2);

				Funtzioak.pelikulaBistaVisible();
				dispose();
			}
		});
		panelZinemak.add(btnBarakaldo);
		
		JButton btnSantutxu = new JButton("Santutxu Zinema");
		btnSantutxu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Deitu pelikula vista noiz zinema basauri da
				System.out.println("SANTUTXU ZINEMA");
				Funtzioak.setIdZinema(3);
				 
				Funtzioak.pelikulaBistaVisible();
				dispose();
			}
		});
		panelZinemak.add(btnSantutxu);
		
		JButton btnBasauri = new JButton("Basauri Zinema");
		btnBasauri.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Deitu pelikula vista noiz zinema basauri da
				System.out.println("BASAURI ZINEMA");
				Funtzioak.setIdZinema(4);
				
				Funtzioak.pelikulaBistaVisible();
				dispose();
			}
		});
		panelZinemak.add(btnBasauri);

	}
	
}
