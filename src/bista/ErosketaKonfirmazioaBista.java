package bista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kontrolatzaile.funtzioak.FuntzioErabilgarriak;
import modeloa.dao.InsertDao;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class ErosketaKonfirmazioaBista extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    //private Erosketak erosketa = FuntzioErabilgarriak.ErosketaSortu();
    InsertDao insert = new InsertDao();
    	
    public ErosketaKonfirmazioaBista() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SaioaBista.class.getResource(FuntzioErabilgarriak.ikonoLogo)));
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
        Titulua.add(lblTitulua, BorderLayout.SOUTH);
        
        JButton btnErosketaAtzera = new JButton("ATZERA");
        btnErosketaAtzera.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		FuntzioErabilgarriak.SarrerenArrayHustu();
        		FuntzioErabilgarriak.zinemaBistaVisible();
            	dispose();
        	}
        });
        Titulua.add(btnErosketaAtzera, BorderLayout.EAST);

        JPanel Content = new JPanel();
        Content.setBackground(new Color(240, 240, 240));
        contentPane.add(Content, BorderLayout.CENTER);
        Content.setLayout(null);

        JButton btnErosketaJarraitu = new JButton("Jarraitu");
        btnErosketaJarraitu.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		FuntzioErabilgarriak.zinemaBistaVisible();
        		
            	JOptionPane.showMessageDialog(null, insert.insertakEgin());
        		
            	FuntzioErabilgarriak.SarrerenArrayHustu();
        		
        		dispose();
        	}
        });
        btnErosketaJarraitu.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnErosketaJarraitu.setBounds(380, 533, 242, 59);
        Content.add(btnErosketaJarraitu);

        JButton btnErosketaFaktura = new JButton("Faktura Sortu");
        btnErosketaFaktura.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                FuntzioErabilgarriak.fitxeroBarruanDatuakIdatzi();
            	JOptionPane.showMessageDialog(null, insert.insertakEgin());

                int aukera = JOptionPane.showConfirmDialog(null, "¿Erosketa gehiago egin nahi dituzu?", "Hautatu", JOptionPane.YES_NO_OPTION);
                
                if (aukera == JOptionPane.YES_OPTION) {
                	JOptionPane.showMessageDialog(null, "Dena ondo gorde egin da");
                	FuntzioErabilgarriak.SarrerenArrayHustu();
                	FuntzioErabilgarriak.ongiEtorriBistaVisible();
                	dispose();
                } else {
                	JOptionPane.showMessageDialog(null, "Mila esker gure programa erabiltzeagatik. Agur!");
                    System.exit(0);
               
                }
                

            }
        });

        btnErosketaFaktura.setBounds(619, 533, 242, 59);
        Content.add(btnErosketaFaktura);
        
        JPanel panelInformazioa = new JPanel();
        panelInformazioa.setBounds(10, 61, 1214, 402);
        Content.add(panelInformazioa);
        
        JScrollPane scrollPane = new JScrollPane();
        panelInformazioa.add(scrollPane);
        FuntzioErabilgarriak.ErosketarenDatuak(scrollPane);
        
        JLabel lblInfoFilma = new JLabel("Informazioa:");
        lblInfoFilma.setHorizontalAlignment(SwingConstants.LEFT);
        lblInfoFilma.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblInfoFilma.setBounds(10, 11, 139, 39);
        Content.add(lblInfoFilma);
        
        JPanel panel = new JPanel();
        panel.setBounds(832, 474, 392, 48);
        Content.add(panel);
        panel.setLayout(new BorderLayout(0, 0));
        
        JLabel lblErosketaPrezioa = new JLabel("Erosketaren prezioa: " +  FuntzioErabilgarriak.totalaErosketa() + "€");
        lblErosketaPrezioa.setFont(new Font("Tahoma", Font.PLAIN, 20));
        panel.add(lblErosketaPrezioa);
    }
}
