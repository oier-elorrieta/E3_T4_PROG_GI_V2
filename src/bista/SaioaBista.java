package bista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jdatepicker.impl.DateComponentFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import modeloa.Aldagaiak;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class SaioaBista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaioaBista frame = new SaioaBista();
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(464, 344, 459, 61);
		Titulua.add(comboBox);
		
		JLabel lblFilmArgazki = new JLabel("");
		lblFilmArgazki.setHorizontalAlignment(SwingConstants.CENTER);
		lblFilmArgazki.setIcon(new ImageIcon(SaioaBista.class.getResource("/modeloa/img/karteldegia/Cazafantasmas.jpg")));
		lblFilmArgazki.setBounds(60, 0, 400, 630);
		Titulua.add(lblFilmArgazki);
			
		JLabel lblFilmSaioa = new JLabel("SAIOA:");
		lblFilmSaioa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFilmSaioa.setBounds(464, 287, 419, 46);
		Titulua.add(lblFilmSaioa);
		
		JLabel lblFilmEguna = new JLabel("EGUNA:");
		lblFilmEguna.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFilmEguna.setBounds(464, 105, 419, 46);
		Titulua.add(lblFilmEguna);
		
		JLabel lblFilmIzena = new JLabel("PELIKULA");
		lblFilmIzena.setHorizontalAlignment(SwingConstants.CENTER);
		lblFilmIzena.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblFilmIzena.setBounds(618, 48, 554, 46);
		Titulua.add(lblFilmIzena);    
		
        UtilDateModel model = new UtilDateModel();
        Properties properties = new Properties();
        properties.put("text.today", "Hoy");
        properties.put("text.month", "Mes");
        properties.put("text.year", "Año");
        
        model.setDate(2024, Calendar.FEBRUARY, 1); 
        model.setSelected(true);
        
        JDatePanelImpl datePanel = new JDatePanelImpl(model, properties);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateComponentFormatter());
        datePicker.getJFormattedTextField().setEditable(true);
        datePicker.setBounds(569, 118, 202, 23);
        Titulua.add(datePicker);
        
        Date aukeratuta = model.getValue();
        Date gaurkoData = new Date();
                
        if (aukeratuta != null && aukeratuta.before(gaurkoData)) {
            model.setValue(gaurkoData);
            model.setSelected(true);
        }

		JButton btnEzSaioa = new JButton("EZ");
		btnEzSaioa.setBounds(986, 550, 258, 79);
		Titulua.add(btnEzSaioa);
		
		JButton btnBaiSaioa = new JButton("BAI");
		btnBaiSaioa.setBounds(718, 550, 258, 79);
		Titulua.add(btnBaiSaioa);
		
		JButton btnAtzeraSaioa = new JButton("ATZERA");
		btnAtzeraSaioa.setBounds(1144, 15, 89, 23);
		Titulua.add(btnAtzeraSaioa);
	}
}
