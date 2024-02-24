package bista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kontrolatzaile.funtzioak.FuntzioErabilgarriak;
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
import javax.swing.JScrollPane;

public class ErosketaKonfirmazioaBista extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    	
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
        
        JPanel panelInformazioa = new JPanel();
        panelInformazioa.setBounds(10, 61, 1046, 461);
        Content.add(panelInformazioa);
        
        JScrollPane scrollPane = new JScrollPane();
        panelInformazioa.add(scrollPane);
        FuntzioErabilgarriak.ErosketarenDatuak(scrollPane);
        
        JLabel lblInfoFilma = new JLabel("Informazioa:");
        lblInfoFilma.setHorizontalAlignment(SwingConstants.LEFT);
        lblInfoFilma.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblInfoFilma.setBounds(10, 11, 139, 39);
        Content.add(lblInfoFilma);
    }
}
