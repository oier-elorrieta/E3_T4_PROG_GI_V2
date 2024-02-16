package bista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modeloa.dao.BezeroaDao;
import modeloa.objetuak.*;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Label;
import javax.swing.JTextField;

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
    	
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1280, 720);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setResizable(false);

        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        JPanel Titulua = new JPanel();
        Titulua.setBackground(new Color(240, 240, 240));
        contentPane.add(Titulua, BorderLayout.NORTH);
        Titulua.setLayout(new BorderLayout(0, 0));

        JLabel lblTitulua = new JLabel("Erosketa Konfirmatu");
        lblTitulua.setBackground(new Color(240, 240, 240));
        lblTitulua.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulua.setFont(new Font("Tahoma", Font.PLAIN, 30));
        Titulua.add(lblTitulua, BorderLayout.NORTH);

        JPanel Content = new JPanel();
        Content.setBackground(new Color(240, 240, 240));
        contentPane.add(Content, BorderLayout.CENTER);
        Content.setLayout(null);
        
        Bezeroa bezeroa = new Bezeroa("B01", "12345678A", "Jon", "Doe", "jondoe", "password", 123456789, "Gizona");
        
        String idBezero = bezeroa.getIdBezeroa();
        String NAN = bezeroa.getNAN();
        String izena = bezeroa.getIzena();
        String abizena = bezeroa.getAbizena();
        String erabiltzailea = bezeroa.getErabiltzailea();
        String pasahitza = bezeroa.getPasahitza();
        int txartela = bezeroa.getTxartela();
        String sexua = bezeroa.getSexua();
        
        Erosketak erosketak = new Erosketak(1, bezeroa, null );
        
        int idErosketak = erosketak.getIdErosketak();
        
        Pelikula pelikula = new Pelikula(1, "Cars", "Aventura", 169);
        
        int idPelikula = pelikula.getIdPelikula();
        
        JLabel erosketaid = new JLabel("idErosketa: " + idErosketak);
        erosketaid.setHorizontalAlignment(SwingConstants.CENTER);
        erosketaid.setBounds(428, 58, 379, 37);
        Content.add(erosketaid);
        
        JLabel bezeroid = new JLabel("idBezeroa: " + idBezero);
        bezeroid.setHorizontalAlignment(SwingConstants.CENTER);
        bezeroid.setBounds(428, 99, 379, 37);
        Content.add(bezeroid);
        
        JLabel bezeroNAN = new JLabel("NAN: " + NAN);
        bezeroNAN.setHorizontalAlignment(SwingConstants.CENTER);
        bezeroNAN.setBounds(428, 147, 379, 38);
        Content.add(bezeroNAN);
        
        JLabel bezeroIzena = new JLabel("Izena: " + izena);
        bezeroIzena.setHorizontalAlignment(SwingConstants.CENTER);
        bezeroIzena.setBounds(428, 196, 379, 37);
        Content.add(bezeroIzena);
        
        JLabel bezeroAbizena = new JLabel("Abizena: "+ abizena);
        bezeroAbizena.setHorizontalAlignment(SwingConstants.CENTER);
        bezeroAbizena.setBounds(428, 244, 379, 37);
        Content.add(bezeroAbizena);
        
        JLabel bezeroErabiltzailea = new JLabel("Erabiltzailea: " + erabiltzailea);
        bezeroErabiltzailea.setHorizontalAlignment(SwingConstants.CENTER);
        bezeroErabiltzailea.setBounds(428, 292, 379, 39);
        Content.add(bezeroErabiltzailea);
        
        JLabel bezeroPasahitza = new JLabel("Pasahitza: " + pasahitza);
        bezeroPasahitza.setHorizontalAlignment(SwingConstants.CENTER);
        bezeroPasahitza.setBounds(428, 342, 379, 37);
        Content.add(bezeroPasahitza);
        
        JLabel bezerotxartela = new JLabel("Txartela: " + txartela);
        bezerotxartela.setHorizontalAlignment(SwingConstants.CENTER);
        bezerotxartela.setBounds(428, 390, 379, 37);
        Content.add(bezerotxartela);
        
        JLabel bezeroSexua = new JLabel("Sexua: " + sexua);
        bezeroSexua.setHorizontalAlignment(SwingConstants.CENTER);
        bezeroSexua.setBounds(428, 438, 379, 26);
        Content.add(bezeroSexua);
        
        JLabel lblNewLabel = new JLabel("New label" + idPelikula);
        lblNewLabel.setBounds(115, 159, 46, 14);
        Content.add(lblNewLabel);

        JButton ErosketaBai = new JButton("Bai");
        ErosketaBai.setBounds(380, 533, 242, 59);
        Content.add(ErosketaBai);

        JButton ErosketaEz = new JButton("Ez");
        ErosketaEz.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        ErosketaEz.setBounds(619, 533, 242, 59);
        Content.add(ErosketaEz);
        
    }
}
