package bista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class OngiEtorri extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel Logo;
    private JPanel pProgreso;
    private JProgressBar progressBar;
    private JLabel lblBehekoMargena;
    private JLabel lblEzkerrekoMargena;
    private JLabel lblEskuinekoMargena;
    private int barraBat;

    public OngiEtorri() {
    	
        setTitle("Elorrieta Films");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 380);
        Logo = new JPanel();
        Logo.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(Logo);
        Logo.setLayout(new BorderLayout(0, 0));

            JPanel Irudia = new JPanel();
            Logo.add(Irudia, BorderLayout.CENTER);
            Irudia.setLayout(new BorderLayout(0, 0));
    
                JLabel lblNewLabel = new JLabel("");
                lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
                Irudia.add(lblNewLabel, BorderLayout.CENTER);

            pProgreso = new JPanel();
            Logo.add(pProgreso, BorderLayout.SOUTH);
            pProgreso.setLayout(new BorderLayout(0, 0));
    
            progressBar = new JProgressBar();
            pProgreso.add(progressBar, BorderLayout.CENTER);
            pProgreso.setVisible(true);
    
            progressBar.setMaximum(30);
            progressBar.setStringPainted(true);
        
            lblBehekoMargena = new JLabel("          ");
            pProgreso.add(lblBehekoMargena, BorderLayout.SOUTH);
            
            lblEzkerrekoMargena = new JLabel("                            ");
            pProgreso.add(lblEzkerrekoMargena, BorderLayout.WEST);
            
            lblEskuinekoMargena = new JLabel("                            ");
            pProgreso.add(lblEskuinekoMargena, BorderLayout.EAST);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Thread(new Runnable() {
                    public void run() {
                        pProgreso.setVisible(true);
                        while (barraBat == 0) {
                            barraBat++;
                            for (int i = 0; i <= 30; i++) {
                                final int value = i;
                                EventQueue.invokeLater(new Runnable() {
                                    public void run() {
                                        progressBar.setValue(value);
                                        System.out.println(value + " " + progressBar.getValue());
                                    }
                                });
                                try {
                                    Thread.sleep(100);
                                } catch (Exception p) {
                                    System.out.println("Algo va mal");
                                }
                            }
                            Login frame = new Login();
                            frame.setVisible(true);
                               dispose();  
                        }
                    }
                }).start();
            }
        });
    }
}