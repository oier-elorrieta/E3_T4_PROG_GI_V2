package kontrolatzaile.funtzioak;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.invoke.StringConcatFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;

import bista.PelikulaBista;
import javax.swing.JTextField;

import bista.SaioaBista;
import bista.ZinemaBista;
import modeloa.Aldagaiak;
import modeloa.dao.AretoaDao;
import modeloa.dao.BezeroaDao;
import modeloa.dao.ErosketakDao;
import modeloa.dao.PelikulaDao;
import modeloa.dao.SaioaDao;
import modeloa.dao.SarreraDao;
import modeloa.dao.ZinemaDao;
import modeloa.db.Konexioa;
import modeloa.db.Kontsultak;
import modeloa.objetuak.Aretoa;
import modeloa.objetuak.Bezeroa;
import modeloa.objetuak.Erosketak;
import modeloa.objetuak.Pelikula;
import modeloa.objetuak.Saioa;
import modeloa.objetuak.Sarrera;
import modeloa.objetuak.Zinema;

/**
 * Klase honetan, programan erabiltzen diren funtzioak daude. Beste klasetik datuak(aldagaiak) berrezkuratzeko, 
 * hemen atributu batzuk(GETTER AND SETTER) sortu ditugu.
 * 
 * idZinema = Zinema aukeratzean, bere id berrezkuratuko eta funtzio batzuetan sartzeko.
 * idFilma = Filmen botoiak sortzean, botoia bakoitza pelikula jakiteko, id bakarra esleitzen dizkiegu.
 * ordua = saioen orduak berrezkuratzeko eta gordetzeko-
 * Eguna = Date Picker data berrezkuratzeko eta gero konparatzeko. 
 * 
 */
public class FuntzioErabilgarriak {
	
	private static int idZinema;
	private static int idFilma;
	private static LocalTime ordua;
	private static String eguna;
	

	public static int getIdZinema() {
		return idZinema;
	}

	public static void setIdZinema(int idZinema) {
		FuntzioErabilgarriak.idZinema = idZinema;
	}	

	public static int getIdFilma() {
		return idFilma;
	}

	public static void setIdFilma(int idFilma) {
		FuntzioErabilgarriak.idFilma = idFilma;
	}
	
	public static LocalTime getOrdua() {
		return ordua;
	}

	public static void setOrdua(LocalTime ordua) {
		FuntzioErabilgarriak.ordua = ordua;
	}

	public static String getEguna() {
		return eguna;
	}

	public static void setEguna(String todayAsString) {
		FuntzioErabilgarriak.eguna = todayAsString;
	}

	public static void inicio() {
		objektuakHasieratu();
	}

	public static List<Aretoa> areatoakList;
	static List<Bezeroa> bezeroakList;
	static List<Erosketak> erosketakList;
	public static List<Pelikula> pelikulakList;
	public static List<Saioa> saioakList;
	static List<Sarrera> sarrerakList;
	static List<Zinema> zinemakList;
	static List<Pelikula> saioPelikulak;

	static AretoaDao Aretoa;
	static BezeroaDao Bezeroa;
	static ErosketakDao Erosketak;
	static PelikulaDao Pelikula;
	static SaioaDao Saioa;
	static SarreraDao Sarrera;
	static ZinemaDao Zinema;
	public static SaioaDao saioaDao;
	
/**
 * 
 * Dao guztiak hasieratu :D
 * 
 */
	public static void objektuakHasieratu() {
		Aretoa = new AretoaDao();
		Bezeroa = new BezeroaDao();
		Erosketak = new ErosketakDao();
		Pelikula = new PelikulaDao();
		Saioa = new SaioaDao();
		Sarrera = new SarreraDao();
		Zinema = new ZinemaDao();
		saioaDao = new SaioaDao();
		
		areatoakList = new ArrayList<>();
		bezeroakList = new ArrayList<>();
		erosketakList = new ArrayList<>();
		pelikulakList = new ArrayList<>();
		saioakList = new ArrayList<>();
		sarrerakList = new ArrayList<>();
		zinemakList = new ArrayList<>();
		
		
		bezeroakList = Bezeroa.lortuBezeroak();
		erosketakList = Erosketak.lortuErosketak();
		pelikulakList = Pelikula.lortuPelikulak();
		sarrerakList = Sarrera.lortuSarrerak();
		zinemakList = Zinema.lortuZinemak();

	}


	// Login pantaila, egiaztapen funtzioa egiten du eta true edo false itzultzen du.
	public static boolean login(String erabiltzailea, String pasahitza) {
		if (loginOK(erabiltzailea, pasahitza)) {
			zinemaBistaVisible();
			return true;
		}
		return false;
	}
	
	// 
	public static boolean loginOK(String erabiltzailea, String pasahitza) {
	    boolean login = false;

	    // Erabiltzailen listen tamaina errekoritzen du 
	    for (int i = 0; i < bezeroakList.size(); i++) {
	    	
	        // Egiaztatu erabiltzailea eta pasahitza.
	        if (bezeroakList.get(i).getErabiltzailea().equals(erabiltzailea)
	                && bezeroakList.get(i).getPasahitza().equals(pasahitza)) {
	        	
	        	// Kredentzialak ondo badaude, "login" TRUE itzultzen du.
	            login = true;
	            break; // Erabiltzaile bat topatzen badu, for amaituko da.
	        }
	    }

	    // Kredentzialak ondo badaude egiaztatzen du.
	    if (!login) {
	        // Erabiltzailea edo pasahitza txarto jarrita badaude, error mezua aterako da.
	        JOptionPane.showMessageDialog(null, "Erabiltzailea edo pasahitza ez dira zuzenak", "Errorea", JOptionPane.ERROR_MESSAGE);
	    } 
	    
	    return login;
	}

	// Pantailak argitaratu.
	public static void zinemaBistaVisible() {
		try {
			ZinemaBista frame = new ZinemaBista();
			frame.setVisible(true);
		} catch (Exception a) {
			a.printStackTrace();
		}
	}

	public static void pelikulaBistaVisible() {
		try {
			PelikulaBista frame = new PelikulaBista();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void saioaBistaVisible() {
		try {
			SaioaBista frame = new SaioaBista();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Pantailak argitaratu.

	// Filmen botoia sortu.
	public static void filmaDatuak(JScrollPane scrollPane) {
	    JPanel panelContenedor = new JPanel(); // Panelen panela sortu
	    panelContenedor.setLayout(new BoxLayout(panelContenedor, BoxLayout.Y_AXIS)); // Layouta bertikal moduan panelak kokatzeko

	    Set<String> pelikulaIzenak = new HashSet<>(); // Bikoiztu ez duen hutsunea edo balio bakarrak baimentzen dituena. LISTA QUE SOLO AGARRA VALORES UNICOS

	    for (int i = 0; i < zinemakList.get(FuntzioErabilgarriak.getIdZinema()).getSaioList().size(); i++) {
	        String pelikulaIzena = zinemakList.get(FuntzioErabilgarriak.getIdZinema()).getSaioList().get(i).getPelikula().getIzena().toString();

	        if (!pelikulaIzenak.contains(pelikulaIzena)) {

	            JPanel panel = new JPanel();
	            panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS)); // Layouta horizontalki osatzeko komponenteak

	            // Botoia sortu eta filmetako Id-ak asignatu.
	            int filmaId = zinemakList.get(FuntzioErabilgarriak.getIdZinema()).getSaioList().get(i).getPelikula().getIdPelikula();
	            JButton btn = new JButton(zinemakList.get(FuntzioErabilgarriak.getIdZinema()).getSaioList().get(i).getPelikula().getIzena().toString()); // Botoia gehitu
	            btn.addMouseListener(new MouseAdapter() {
	                @Override
	                public void mouseClicked(MouseEvent e) {
	                    FuntzioErabilgarriak.setIdFilma(filmaId);
	                    PelikulaBista.BotoiaEnabled();
	                }
	            });
	            panel.add(btn);

	            panel.add(Box.createHorizontalGlue());

	            panel.add(Box.createRigidArea(new Dimension(0, 10)));

	            panelContenedor.add(panel); 
	            pelikulaIzenak.add(pelikulaIzena);
	        }
	    }

	    scrollPane.setViewportView(panelContenedor); 
	}

	// Aukeratutako filmen datuak berrezkuratu.
	public static Pelikula Info_filma() {
		Pelikula p1 = new Pelikula();
		
		  for (Pelikula pelikula : FuntzioErabilgarriak.pelikulakList) {
              if (pelikula.getIdPelikula() == FuntzioErabilgarriak.getIdFilma()) {
            	  
            	  p1.setIzena(pelikula.getIzena());
            	  p1.setGeneroa(pelikula.getGeneroa());
            	  p1.setIdPelikula(pelikula.getIdPelikula());
            	  p1.setIraupena(pelikula.getIraupena());
                  
                  break;
              }
          }
		  return p1;
		  
	}
	
	// Aukeratutako saioen id eta aretoa berrezkuratu.
	public static Saioa Info_saioa() {
		Saioa s1 = new Saioa();
		
		  for (Saioa saioa : zinemakList.get(FuntzioErabilgarriak.getIdZinema()).getSaioList()) {
              if (saioa.getPelikula().getIdPelikula() == FuntzioErabilgarriak.Info_filma().getIdPelikula()) {
            	  
            	  s1.setIdSaioa(saioa.getIdSaioa());
            	  s1.setAretoa(saioa.getAretoa());
            	  
                  break;
              }
          }
		  return s1;
		  
	}
	
	// AUKERATUTAKO SAIOAREN ORDUA LORTU.
	public static LocalTime Saio_filma() {
				
		LocalTime saioaOrdua = null;  
		String eguna = FuntzioErabilgarriak.getEguna();
		 
		  for (Saioa saioa : zinemakList.get(FuntzioErabilgarriak.getIdZinema()).getSaioList()) {
			  String getEgunaString = "" + saioa.getEguna();
			  if(saioa.getPelikula().getIdPelikula() == FuntzioErabilgarriak.getIdFilma() && getEgunaString.equals(eguna)) {
				  saioaOrdua = saioa.getOrdua();
				  
			  }
		  }
		  
		  return saioaOrdua;
		
	}
	 
	// Sarreren gehiketa edo kenketa egin.
	public static void GehiSarreraBalioa() {
		int balorea = Integer.parseInt(SaioaBista.textSarreraKop.getText());
		balorea++;
		SaioaBista.textSarreraKop.setText(String.valueOf(balorea));
	}

	public static void KenduSarreraBalioa() {
		int balorea = Integer.parseInt(SaioaBista.textSarreraKop.getText());
		if (balorea > 1) {
			balorea--;
			SaioaBista.textSarreraKop.setText(String.valueOf(balorea));
		}
	}

}
