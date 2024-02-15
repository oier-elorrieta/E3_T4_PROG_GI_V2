package bista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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

public class Zinema extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Zinema() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Zinema.class.getResource(Aldagaiak.ikonoLogo)));
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
		panelZinemak.setLayout(new GridLayout(0, 1, 0, 0));
		panelZinemak.add(btnElorrieta);
		
		JButton btnBasauri = new JButton("Basauri Zinema");
		panelZinemak.add(btnBasauri);
		
		JButton btnErandio = new JButton("Erandio Zinema");
		panelZinemak.add(btnErandio);
		
		JButton btnSantutxu = new JButton("Santutxu Zinema");
		panelZinemak.add(btnSantutxu);
		
		JButton btnBarakaldo = new JButton("Barakaldo Zinema");
		panelZinemak.add(btnBarakaldo);
	}
}
