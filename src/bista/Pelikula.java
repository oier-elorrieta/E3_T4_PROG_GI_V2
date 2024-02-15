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
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pelikula extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pelikula frame = new Pelikula();
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
	public Pelikula() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Pelikula.class.getResource(Aldagaiak.ikonoLogo)));
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
		
		JLabel lblTitulua = new JLabel("Pelikula");
		lblTitulua.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulua.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Titulua.add(lblTitulua, BorderLayout.NORTH);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panelPelikula = new JPanel();
		scrollPane.setViewportView(panelPelikula);
		panelPelikula.setLayout(new GridLayout(20, 1, 0, 0));
		
		JButton btnExpediente = new JButton("Expediente");
		btnExpediente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelPelikula.add(btnExpediente);

		JButton btnGet = new JButton("Get");
		btnGet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelPelikula.add(btnGet);

		JButton btnHereditary = new JButton("Hereditary");
		btnHereditary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelPelikula.add(btnHereditary);

		JButton btnEl = new JButton("El");
		panelPelikula.add(btnEl);

		JButton btnAnabelle = new JButton("Anabelle");
		panelPelikula.add(btnAnabelle);

		JButton btnDía = new JButton("Día");
		panelPelikula.add(btnDía);

		JButton btnGuardianes = new JButton("Guardianes");
		panelPelikula.add(btnGuardianes);

		JButton btnMatrix = new JButton("Matrix");
		panelPelikula.add(btnMatrix);

		JButton btnAvatar = new JButton("Avatar");
		panelPelikula.add(btnAvatar);

		JButton btnE = new JButton("E");
		panelPelikula.add(btnE);

		JButton btnElIrlandés = new JButton("ElIrlandés");
		panelPelikula.add(btnElIrlandés);

		JButton btnParásitos = new JButton("Parásitos");
		panelPelikula.add(btnParásitos);

		JButton btnForrest = new JButton("Forrest");
		panelPelikula.add(btnForrest);

		JButton btnTitanic = new JButton("Titanic");
		panelPelikula.add(btnTitanic);

		JButton btnCazafantasmas = new JButton("Cazafantasmas");
		panelPelikula.add(btnCazafantasmas);

		JButton btnDos = new JButton("Dos");
		panelPelikula.add(btnDos);

		JButton btnBorat = new JButton("Borat");
		panelPelikula.add(btnBorat);

		JButton btnResacon = new JButton("Resacon");
		panelPelikula.add(btnResacon);

		JButton btnShrek = new JButton("Shrek");
		panelPelikula.add(btnShrek);

		JButton btnCars = new JButton("Cars");
		panelPelikula.add(btnCars);

		JButton btnHandia = new JButton("");
		btnHandia.setIcon(new ImageIcon(Pelikula.class.getResource("/modeloa/img/karteldegia/handia.jpg")));
		panelPelikula.add(btnHandia);

		JButton btnLa = new JButton("");
		btnLa.setIcon(new ImageIcon(Pelikula.class.getResource("/modeloa/img/karteldegia/la_forma_agua.jpg")));
		panelPelikula.add(btnLa);

		JButton btnCadena = new JButton("Cadena");
		panelPelikula.add(btnCadena);

		JButton btnMillion = new JButton("");
		btnMillion.setIcon(new ImageIcon(Pelikula.class.getResource("/modeloa/img/karteldegia/million_dollar.jpg")));
		panelPelikula.add(btnMillion);

		JButton btnOdisea = new JButton("Odisea");
		panelPelikula.add(btnOdisea);

		JButton btnLaNovia = new JButton("LaNovia");
		panelPelikula.add(btnLaNovia);

		JButton btnElPlaneta = new JButton("");
		btnElPlaneta.setIcon(new ImageIcon(Pelikula.class.getResource("/modeloa/img/karteldegia/simios.jpg")));
		panelPelikula.add(btnElPlaneta);

		JButton btnAlien = new JButton("");
		btnAlien.setIcon(new ImageIcon(Pelikula.class.getResource("/modeloa/img/karteldegia/Alien8.jpg")));
		panelPelikula.add(btnAlien);

		JButton btnScary = new JButton("");
		btnScary.setIcon(new ImageIcon(Pelikula.class.getResource("/modeloa/img/karteldegia/scary_movie.jpg")));
		panelPelikula.add(btnScary);

		JButton btnElGran = new JButton("");
		btnElGran.setIcon(new ImageIcon(Pelikula.class.getResource("/modeloa/img/karteldegia/el_gran_lebowski.jpg")));
		panelPelikula.add(btnElGran);

		JButton btnLaVida = new JButton("");
		btnLaVida.setIcon(new ImageIcon(Pelikula.class.getResource("/modeloa/img/karteldegia/vida_brian.jpg")));
		panelPelikula.add(btnLaVida);

		JButton btnAterriza = new JButton("");
		btnAterriza.setIcon(new ImageIcon(Pelikula.class.getResource("/modeloa/img/karteldegia/aterrizapuedas.png")));
		panelPelikula.add(btnAterriza);

		JButton btnPsicosis = new JButton("");
		btnPsicosis.setIcon(new ImageIcon(Pelikula.class.getResource("/modeloa/img/karteldegia/psycosis.jpg")));
		panelPelikula.add(btnPsicosis);

		JButton btnElResplandor = new JButton("");
		btnElResplandor.setIcon(new ImageIcon(Pelikula.class.getResource("/modeloa/img/karteldegia/resplandor.jpg")));
		panelPelikula.add(btnElResplandor);

		JButton btnDrácula = new JButton("");
		btnDrácula.setIcon(new ImageIcon(Pelikula.class.getResource("/modeloa/img/karteldegia/dracula.jpg")));
		panelPelikula.add(btnDrácula);

		JButton btnCisne = new JButton("");
		btnCisne.setIcon(new ImageIcon(Pelikula.class.getResource("/modeloa/img/karteldegia/cisnenegro.jpg")));
		panelPelikula.add(btnCisne);

	}
}
