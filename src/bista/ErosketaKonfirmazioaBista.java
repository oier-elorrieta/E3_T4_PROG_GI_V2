package bista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modeloa.objetuak.Bezeroa;
import modeloa.objetuak.Erosketak;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;

public class ErosketaKonfirmazioaBista extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ErosketaKonfirmazioaBista frame = new ErosketaKonfirmazioaBista();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    } 
    	
    public ErosketaKonfirmazioaBista() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1280, 720);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setResizable(false);
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        JPanel Titulua = new JPanel();
        Titulua.setBackground(new Color(240, 240, 240));
        contentPane.add(Titulua, BorderLayout.NORTH);
        Titulua.setLayout(new BorderLayout(0, 0));

        JLabel lblTitulua = new JLabel("Erosketa Konfirmatu");
        lblTitulua.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulua.setFont(new Font("Tahoma", Font.PLAIN, 30));
        Titulua.add(lblTitulua, BorderLayout.NORTH);

        JPanel Content = new JPanel();
        Content.setBackground(new Color(240, 240, 240));
        contentPane.add(Content, BorderLayout.CENTER);
        Content.setLayout(null);

        // Crea una instancia de Bezeroa y Erosketak con datos concretos
        Bezeroa bezeroa = new Bezeroa("B01", "12345678A", "Jon", "Doe", "jondoe", "password", 123456789, "Gizona");
        Erosketak erosketak = new Erosketak(1, LocalDate.now());

        JLabel lblBezeroNAN = new JLabel("NAN: ");
        lblBezeroNAN.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblBezeroNAN.setHorizontalAlignment(SwingConstants.LEFT);
        lblBezeroNAN.setBounds(33, 99, 379, 38);
        Content.add(lblBezeroNAN);

        JLabel lblBezeroIzenaAbizena = new JLabel("Izena/Abizena:");
        lblBezeroIzenaAbizena.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblBezeroIzenaAbizena.setHorizontalAlignment(SwingConstants.LEFT);
        lblBezeroIzenaAbizena.setBounds(33, 148, 379, 37);
        Content.add(lblBezeroIzenaAbizena);

        JLabel lblBezeroErabiltzailea = new JLabel("Erabiltzailea: ");
        lblBezeroErabiltzailea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblBezeroErabiltzailea.setHorizontalAlignment(SwingConstants.LEFT);
        lblBezeroErabiltzailea.setBounds(33, 50, 379, 39);
        Content.add(lblBezeroErabiltzailea);

        JLabel lblBezeroGeneroa = new JLabel("Generoa:");
        lblBezeroGeneroa.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblBezeroGeneroa.setHorizontalAlignment(SwingConstants.LEFT);
        lblBezeroGeneroa.setBounds(33, 196, 379, 26);
        Content.add(lblBezeroGeneroa);

        JButton ErosketaBai = new JButton("Bai");
        ErosketaBai.setBounds(380, 533, 242, 59);
        Content.add(ErosketaBai);

        JButton ErosketaEz = new JButton("Ez");
        ErosketaEz.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes añadir la lógica para manejar el evento del botón "Ez"
            }
        });
        ErosketaEz.setBounds(619, 533, 242, 59);
        Content.add(ErosketaEz);
        
        JLabel lblFilma = new JLabel("Filma/k:");
        lblFilma.setHorizontalAlignment(SwingConstants.LEFT);
        lblFilma.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblFilma.setBounds(380, 51, 379, 37);
        Content.add(lblFilma);
        
        JLabel lblZinema = new JLabel("Zinema/k:");
        lblZinema.setHorizontalAlignment(SwingConstants.LEFT);
        lblZinema.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblZinema.setBounds(380, 100, 379, 37);
        Content.add(lblZinema);
        
        JLabel lblAretoa = new JLabel("Aretoa/k:");
        lblAretoa.setHorizontalAlignment(SwingConstants.LEFT);
        lblAretoa.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblAretoa.setBounds(380, 148, 379, 37);
        Content.add(lblAretoa);
        
        JLabel lbl = new JLabel("Eguna/k:");
        lbl.setHorizontalAlignment(SwingConstants.LEFT);
        lbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lbl.setBounds(380, 191, 379, 37);
        Content.add(lbl);
        
        JLabel lblFilma_1_1 = new JLabel("Ordua/k:");
        lblFilma_1_1.setHorizontalAlignment(SwingConstants.LEFT);
        lblFilma_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblFilma_1_1.setBounds(380, 233, 379, 37);
        Content.add(lblFilma_1_1);
    }
}
