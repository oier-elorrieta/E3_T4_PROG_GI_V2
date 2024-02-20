package bista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import kontrolatzaile.funtzioak.Funtzioak;
import modeloa.Aldagaiak;
import modeloa.objetuak.Pelikula;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PelikulaBista extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Create the frame.
     */
    public PelikulaBista() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(PelikulaBista.class.getResource(Aldagaiak.ikonoLogo)));
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

        JButton btnAtzeraPelikula = new JButton("ATZERA");
        btnAtzeraPelikula.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Funtzioak.zinemaBistaVisible();
                dispose();
            }
        });
        Titulua.add(btnAtzeraPelikula, BorderLayout.EAST);

        JScrollPane scrollPane = new JScrollPane();
        contentPane.add(scrollPane, BorderLayout.CENTER);

        Funtzioak.filmaDatuak(scrollPane);
    }

}
