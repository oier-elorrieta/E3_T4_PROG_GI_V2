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
import java.awt.Container;

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

    /**
     * Create the frame.
     */
<<<<<<< HEAD:src/bista/ErosketaKonfirmazioaBista.java
    public ErosketaKonfirmazioaBista() {
    	
=======
    public ErosketaKonfirmazioa() {
>>>>>>> 7127c7e8c7b26302f041e94211105eaafefb9ac9:src/bista/ErosketaKonfirmazioa.java
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
        Erosketak erosketak = new Erosketak(1, bezeroa, LocalDate.now());

        // Crea etiquetas para mostrar los datos
        JLabel erosketaid = new JLabel("idErosketa: " + erosketak.getIdErosketak());
        erosketaid.setHorizontalAlignment(SwingConstants.CENTER);
        erosketaid.setBounds(428, 58, 379, 37);
        Content.add(erosketaid);

        JLabel bezeroid = new JLabel("idBezeroa: " + bezeroa.getIdBezeroa());
        bezeroid.setHorizontalAlignment(SwingConstants.CENTER);
        bezeroid.setBounds(428, 99, 379, 37);
        Content.add(bezeroid);

        JLabel bezeroNAN = new JLabel("NAN: " + erosketak.getData());
        bezeroNAN.setHorizontalAlignment(SwingConstants.CENTER);
        bezeroNAN.setBounds(428, 147, 379, 38);
        Content.add(bezeroNAN);

        JLabel bezeroIzena = new JLabel("Izena: " + bezeroa.getIzena());
        bezeroIzena.setHorizontalAlignment(SwingConstants.CENTER);
        bezeroIzena.setBounds(428, 196, 379, 37);
        Content.add(bezeroIzena);

        JLabel bezeroAbizena = new JLabel("Abizena: " + bezeroa.getAbizena());
        bezeroAbizena.setHorizontalAlignment(SwingConstants.CENTER);
        bezeroAbizena.setBounds(428, 244, 379, 37);
        Content.add(bezeroAbizena);

        JLabel bezeroErabiltzailea = new JLabel("Erabiltzailea: " + bezeroa.getErabiltzailea());
        bezeroErabiltzailea.setHorizontalAlignment(SwingConstants.CENTER);
        bezeroErabiltzailea.setBounds(428, 292, 379, 39);
        Content.add(bezeroErabiltzailea);

        JLabel bezeroSexua = new JLabel("Sexua: " + bezeroa.getSexua());
        bezeroSexua.setHorizontalAlignment(SwingConstants.CENTER);
        bezeroSexua.setBounds(428, 438, 379, 26);
        Content.add(bezeroSexua);

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
    }

}
