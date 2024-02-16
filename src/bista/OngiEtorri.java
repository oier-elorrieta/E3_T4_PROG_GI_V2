package bista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modeloa.Aldagaiak;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

public class OngiEtorri extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel Logo;
    private JPanel pProgreso;
    private JProgressBar progressBar1;
    private JLabel lblBehekoMargena;
    private JLabel lblEzkerrekoMargena;
    private JLabel lblEskuinekoMargena;
    private int barraBat = 0;

    public OngiEtorri() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage(OngiEtorri.class.getResource(Aldagaiak.ikonoLogo)));
    	setTitle("Elorrieta Film");
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
		        lblNewLabel.setIcon(new ImageIcon(OngiEtorri.class.getResource(Aldagaiak.ikonoLogo)));
		        Irudia.add(lblNewLabel, BorderLayout.CENTER);

	        pProgreso = new JPanel();
	        Logo.add(pProgreso, BorderLayout.SOUTH);
	        pProgreso.setLayout(new BorderLayout(0, 0));
	
	        progressBar1 = new JProgressBar();
	        pProgreso.add(progressBar1, BorderLayout.CENTER);
	        pProgreso.setVisible(true);
	
	        progressBar1.setMaximum(30);
	        progressBar1.setStringPainted(true);
        
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
	                                    progressBar1.setValue(value);
	                                    System.out.println(value + " " + progressBar1.getValue());
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