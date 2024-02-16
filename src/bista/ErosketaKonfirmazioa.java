package bista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
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

        JLabel ErosketaLaburpena = new JLabel("Laburpena: ");
        ErosketaLaburpena.setHorizontalAlignment(SwingConstants.CENTER);
        ErosketaLaburpena.setBounds(428, 58, 379, 37);
        Content.add(ErosketaLaburpena);

        JButton ErosketaBai = new JButton("Bai");
        ErosketaBai.setBounds(380, 418, 242, 59);
        Content.add(ErosketaBai);

        JButton ErosketaEz = new JButton("Ez");
        ErosketaEz.setBounds(619, 418, 242, 59);
        Content.add(ErosketaEz);

    }
}
