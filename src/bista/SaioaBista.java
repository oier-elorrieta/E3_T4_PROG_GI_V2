package bista;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jdatepicker.impl.DateComponentFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import kontrolatzaile.funtzioak.Funtzioak;
import modeloa.Aldagaiak;
import modeloa.objetuak.Pelikula;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;

public class SaioaBista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static JTextField textSarreraKop;
	


	public SaioaBista() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SaioaBista.class.getResource(Aldagaiak.ikonoLogo)));
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
		
		JLabel lblFilmArgazki = new JLabel("");
		lblFilmArgazki.setHorizontalAlignment(SwingConstants.CENTER);
		lblFilmArgazki.setIcon(new ImageIcon(SaioaBista.class.getResource("/modeloa/img/logoa/logoa_karratu.png")));
		lblFilmArgazki.setBounds(25, -1, 400, 630);
		Titulua.add(lblFilmArgazki);
			
		JLabel lblFilmSaioa = new JLabel("SAIOA:");
		lblFilmSaioa.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblFilmSaioa.setBounds(461, 340, 419, 46);
		Titulua.add(lblFilmSaioa);
	
		 
		JLabel lblFilmIzena = new JLabel(Funtzioak.Info_filma().getIzena());
		lblFilmIzena.setHorizontalAlignment(SwingConstants.LEFT);
		lblFilmIzena.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblFilmIzena.setBounds(461, 48, 554, 46);
		Titulua.add(lblFilmIzena);    
		
		JLabel lblGenero = new JLabel("Generoa: " + Funtzioak.Info_filma().getGeneroa());
		lblGenero.setHorizontalAlignment(SwingConstants.LEFT);
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblGenero.setBounds(461, 105, 554, 46);
		Titulua.add(lblGenero);
		
		
         JLabel lblIraupena = new JLabel("Iraupena: " + Funtzioak.Info_filma().getIraupena() + " minutuak");		
		lblIraupena.setHorizontalAlignment(SwingConstants.LEFT);
		lblIraupena.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblIraupena.setBounds(461, 162, 554, 46);
		Titulua.add(lblIraupena);
		
		
		JLabel lblIAretoa = new JLabel("Aretoa: " + Funtzioak.Info_saioa().getAretoa().getIzena() + " aretoa");
		lblIAretoa.setHorizontalAlignment(SwingConstants.LEFT);
		lblIAretoa.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblIAretoa.setBounds(461, 219, 554, 46);
		Titulua.add(lblIAretoa);
		
		JLabel lbllPrezioa = new JLabel("Sarreraren prezioa: 6,90 €" );
		lbllPrezioa.setHorizontalAlignment(SwingConstants.LEFT);
		lbllPrezioa.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbllPrezioa.setBounds(461, 276, 554, 46);
		Titulua.add(lbllPrezioa);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(464, 397, 459, 61);

		LocalTime saioaOrdua = Funtzioak.Saio_filma();

		if (saioaOrdua != null) {
		    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		    String formattedTime = saioaOrdua.format(formatter);
		    comboBox.addItem(formattedTime);
		} else {
		    // Manejo del caso en que saioaOrdua es null
		    comboBox.addItem("No hay hora disponible");
		}

		Titulua.add(comboBox);
        
        
		JButton btnBukatuErosketa = new JButton("Bukatu Erosketa");
		btnBukatuErosketa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBukatuErosketa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
            	JOptionPane.showMessageDialog(null, "DENA EZABATU EGIN DA", "!!" ,JOptionPane.ERROR_MESSAGE);
				 Funtzioak.zinemaBistaVisible();
	                dispose();
			}
		});
		btnBukatuErosketa.setBounds(986, 550, 258, 79);
		Titulua.add(btnBukatuErosketa);
		
		JButton btnBesteErosketa = new JButton("Jarraitu Erosketa");
		btnBesteErosketa.setIcon(new ImageIcon(SaioaBista.class.getResource("/modeloa/img/logoa/ErosketaKarritoa3.png")));
		btnBesteErosketa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBesteErosketa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				 
				JOptionPane.showMessageDialog(null, "DENA ONDO GORDE EGIN DA");
				 Funtzioak.zinemaBistaVisible();
	                dispose();
	                
				
			}
		});
		btnBesteErosketa.setBounds(718, 550, 258, 79);
		Titulua.add(btnBesteErosketa);
		
		JButton btnAtzeraSaioa = new JButton("ATZERA");
		btnAtzeraSaioa.setBounds(1144, 15, 89, 23);
		btnAtzeraSaioa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Funtzioak.pelikulaBistaVisible();
                dispose();
            }
        });
		Titulua.add(btnAtzeraSaioa);
		
		JLabel lblSarreraKopurua = new JLabel("SARRERA KOPURUA");
		lblSarreraKopurua.setHorizontalAlignment(SwingConstants.CENTER);
		lblSarreraKopurua.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSarreraKopurua.setBounds(1025, 105, 208, 46);
		Titulua.add(lblSarreraKopurua);
		
		textSarreraKop = new JTextField();
		textSarreraKop.setHorizontalAlignment(SwingConstants.CENTER);
		textSarreraKop.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textSarreraKop.setBounds(1025, 147, 208, 61);
		textSarreraKop.setColumns(10);
		textSarreraKop.setText("1");	
		textSarreraKop.setEnabled(false); 
		
		Color textuKolorea = Color.BLACK; 
		textSarreraKop.setDisabledTextColor(textuKolorea);
		
		Titulua.add(textSarreraKop);
		 
		JButton btnSarreraGehi = new JButton("+");
		btnSarreraGehi.setBounds(1144, 219, 89, 23);
		Titulua.add(btnSarreraGehi);
		
		JButton btnSarreraKendu = new JButton("-");
		btnSarreraKendu.setBounds(1025, 219, 89, 23);
		Titulua.add(btnSarreraKendu);
		
		
	
		
		
		btnSarreraGehi.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	Funtzioak.GehiSarreraBalioa();
		    }
		});

		btnSarreraKendu.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	Funtzioak.KenduSarreraBalioa();
		    }
		});
	}
}
