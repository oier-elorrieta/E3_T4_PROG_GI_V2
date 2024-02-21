package kontrolatzaile.funtzioak;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.invoke.StringConcatFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
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
import modeloa.dao.ZinemaAretoFilmaDAO;
import modeloa.dao.ZinemaDao;
import modeloa.db.Konexioa;
import modeloa.db.Kontzultak;
import modeloa.objetuak.Aretoa;
import modeloa.objetuak.Bezeroa;
import modeloa.objetuak.Erosketak;
import modeloa.objetuak.Pelikula;
import modeloa.objetuak.Saioa;
import modeloa.objetuak.Sarrera;
import modeloa.objetuak.Zinema;

public class Funtzioak {
	
	private static int idZinema;
	

	public static int getIdZinema() {
		return idZinema;
	}

	public static void setIdZinema(int idZinema) {
		Funtzioak.idZinema = idZinema;
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

//		System.out.println("\n\nBezeroak:");
//		for (int i = 0; i < bezeroakList.size(); i++) {
//			System.out.println(bezeroakList.get(i));
//		}
//		
////		System.out.println("\n\nErosketa:");
////		for (int i = 0; i < erosketakList.size(); i++) {
////			System.out.println(erosketakList.get(i));
////		}
//		
//		System.out.println("\n\nPelikula:");
//		for (int i = 0; i < pelikulakList.size(); i++) {
//			System.out.println(pelikulakList.get(i));
//		}

//		System.out.println("\n\nSarrera:");
//		for (int i = 0; i < sarrerakList.size(); i++) {
//			System.out.println(sarrerakList.get(i));
//		}

//		System.out.println("\n\nZinema:");
//		for (int i = 0; i < zinemakList.size(); i++) {
//			//System.out.println(zinemakList.get(i).getIzena());
//			System.out.println(zinemakList.get(i).getAretoList());
//
//			System.out.println(zinemakList.get(i).getSaioList());
//		}
//
		System.out.println("\n\nZinema:");

		System.out.println(zinemakList.get(1).getIzena());
		System.out.println(zinemakList.get(1).getAretoList());
		System.out.println(zinemakList.get(1).getSaioList());
		System.out.println(zinemakList.get(1).getSaioList().get(1).getPelikula());

//	System.out.println("\n\nElorrietaFilmak:");for(
//
//	int i = 0;i<elorrietaPelikulak.size();i++)
//	{
//		System.out.println(elorrietaPelikulak.get(i));
//	}
//
//	System.out.println("\n\nErandioFilmak:");for(
//	int i = 0;i<erandioPelikulak.size();i++)
//	{
//		System.out.println(erandioPelikulak.get(i));
//	}
//
//	System.out.println("\n\nBasauriFilmak:");for(
//	int i = 0;i<basauriPelikulak.size();i++)
//	{
//		System.out.println(basauriPelikulak.get(i));
//	}
//
//	System.out.println("\n\nSantutxuFilmak:");for(
//	int i = 0;i<santutxuPelikulak.size();i++)
//	{
//		System.out.println(santutxuPelikulak.get(i));
//	}
//
//	System.out.println("\n\nBarakaldoFilmak:");for(
//	int i = 0;i<barakaldoPelikulak.size();i++)
//	{
//		System.out.println(barakaldoPelikulak.get(i));
//	}

	}

//	public static void objektuakExarri() {
//		saioa
//		zinema
//		sarrera
//		erosketa
//	}

	public static boolean login(String erabiltzailea, String pasahitza) {
		if (loginOK(erabiltzailea, pasahitza)) {
			zinemaBistaVisible();
			return true;
		}
		return false;
	}

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

	public static boolean loginOK(String erabiltzailea, String pasahitza) {
		boolean login = false;

		for (int i = 0; i < bezeroakList.size(); i++) {

			if (bezeroakList.get(i).getErabiltzailea().equals(erabiltzailea)
					&& bezeroakList.get(i).getPasahitza().equals(pasahitza)) {
				// Bezeroa encontrado
				login = true;
				break; // Puedes salir del bucle una vez que encuentras el bezeroa
			}
		}

		// Verificar si se encontró el bezeroa
		if (login) {
			System.out.println("Bezeroa encontrado.");
		} else {
			System.out.println("Bezeroa no encontrado.");
		}
		return login;
	}
	public static void getAretoZinema() {
		for(int i = 0; i < zinemakList.size(); i++) {
					zinemakList.get(i).getSaioList();
		}
		
		
	}

//		public static void filmaDatuak() {
//
//			for (int i = 0; i < pelikulakList.size(); i++) {
//			String izenaFilm = pelikulakList.get(i).getIzena();
//			System.out.println(izenaFilm);
//			String generoFilm = pelikulakList.get(i).getGeneroa();
//			System.out.println(generoFilm);
//			int iraupenaFilm = pelikulakList.get(i).getIraupena();
//			System.out.println(iraupenaFilm);
//			String urlFilmAux ="/modeloa/img/karteldegia/cars.jpg";
//			System.out.println("/modeloa/img/karteldegia/Alien, el octavo pasajero.jpg");
//			System.out.println(urlFilmAux);
//			JPanel panel = new JPanel();
//			panel.setBorder(UIManager.getBorder("ToolTip.border"));
//			JButton btnNewButton = new JButton("");
//			btnNewButton.setBounds(60, 0, 400, 630);
//			btnNewButton.setIcon(new ImageIcon(PelikulaBista.class.getResource(urlFilmAux)));
//			// JButton btnNewButton = new JButton("New button");
//			btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//			});
//			panel.setLayout(null);
//			panel.add(btnNewButton);
//
//			JPanel panel_1 = new JPanel();
//			panel_1.setBounds(654, 108, 487, 363);
//			panel.add(panel_1);
//			panel_1.setLayout(null);
//
//			JLabel lblTtituloa = new JLabel();
//			lblTtituloa.setFont(new Font("Tahoma", Font.PLAIN, 23));
//			lblTtituloa.setBounds(32, 11, 95, 77);
//			lblTtituloa.setText("Tituloa");
//			panel_1.add(lblTtituloa);
//
//			JLabel lblIraupena = new JLabel("Iraupena");
//			lblIraupena.setFont(new Font("Tahoma", Font.PLAIN, 23));
//			lblIraupena.setBounds(32, 136, 95, 57);
//			panel_1.add(lblIraupena);
//
//			JLabel lblGeneroa = new JLabel("Generoa");
//			lblGeneroa.setFont(new Font("Tahoma", Font.PLAIN, 23));
//			lblGeneroa.setBounds(32, 250, 95, 57);
//			panel_1.add(lblGeneroa);
//
//			JLabel lblTituloaejemplo = new JLabel();
//			lblTituloaejemplo.setText(izenaFilm);
//			lblTituloaejemplo.setFont(new Font("Tahoma", Font.PLAIN, 23));
//			lblTituloaejemplo.setBounds(158, 11, 319, 77);
//			panel_1.add(lblTituloaejemplo);
//
//			JLabel lblIraupenaejemplo = new JLabel("" + iraupenaFilm);
//			lblIraupenaejemplo.setFont(new Font("Tahoma", Font.PLAIN, 23));
//			lblIraupenaejemplo.setBounds(158, 136, 319, 57);
//			panel_1.add(lblIraupenaejemplo);
//
//			JLabel lblGeneroaejemplo = new JLabel(generoFilm);
//			lblGeneroaejemplo.setFont(new Font("Tahoma", Font.PLAIN, 23));
//			lblGeneroaejemplo.setBounds(158, 250, 319, 57);
//			panel_1.add(lblGeneroaejemplo);
//
//			}
//
//			
//
//	}
	

	    public static void filmaDatuak(JScrollPane scrollPane) {
	        JPanel panelContenedor = new JPanel(); // Panel que contendrá todos los paneles individuales
	        panelContenedor.setLayout(new BoxLayout(panelContenedor, BoxLayout.Y_AXIS)); // Layout para verticalmente los paneles

	        Set<String> nombresPeliculas = new HashSet<>(); // Conjunto para mantener los nombres de las películas
	        
	        for (int i = 0; i < zinemakList.get(Funtzioak.getIdZinema()).getSaioList().size(); i++) {
	        	String nombrePelicula = zinemakList.get(Funtzioak.getIdZinema()).getSaioList().get(i).getPelikula().getIzena().toString();
	        	
	        	 if (!nombresPeliculas.contains(nombrePelicula)) {
	        	
	            JPanel panel = new JPanel();
	            panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS)); // Layout para organizar horizontalmente los componentes

	            // Configurar el panel según tus necesidades
	            // Por ejemplo:
	            
	            //System.out.println(Funtzioak.getIdZinema());
	            
	            JLabel lblTitulo = new JLabel(zinemakList.get(Funtzioak.getIdZinema()).getSaioList().get(i).getPelikula().getIzena().toString());
	            panel.add(lblTitulo);

	            JLabel lblGenero = new JLabel(zinemakList.get(Funtzioak.getIdZinema()).getSaioList().get(i).getPelikula().getGeneroa().toString());
	            panel.add(lblGenero);

	            JLabel lblIraupena = new JLabel(Integer.toString(zinemakList.get(Funtzioak.getIdZinema()).getSaioList().get(i).getPelikula().getIraupena()));
	            panel.add(lblIraupena);

	            JButton btn = new JButton(zinemakList.get(Funtzioak.getIdZinema()).getSaioList().get(i).getPelikula().getIzena().toString() + "Aukeratu filma"); // Agrega un botón
	            panel.add(btn);

	            panel.add(Box.createHorizontalGlue());

	            panel.add(Box.createRigidArea(new Dimension(0, 10)));

	            panelContenedor.add(panel); 
	            nombresPeliculas.add(nombrePelicula);
	        	 }
	        }

	        scrollPane.setViewportView(panelContenedor); 
	    }


	public static void saioaZinema(String idZinema) {

		Kontzultak.saioakArgitaratu = "SELECT ordua, eguna, idaretoa, idFilma "
				+ "FROM saioa s LEFT JOIN ZINEMA z USING (idZinema) LEFT JOIN FILMA f USING (idFilma)"
				+ " WHERE z.idzinema = '" + idZinema + "' AND Eguna >= CURDATE() AND Ordua >= CURTIME() "
				+ "ORDER by s.Eguna, s.Ordua;";

	}

	public static void filmPanelak() {

		Konexioa.konexioa();

		ZinemaAretoFilmaDAO ZinemaAretoFilma = new ZinemaAretoFilmaDAO();

		saioPelikulak = new ArrayList<>();

		saioPelikulak = ZinemaAretoFilma.lortuFilmak();
		System.out.println("------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------");

		// System.out.println(saioPelikulak);
		System.out.println("------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------");

		Konexioa.konexioaExit();

	}

	public static void GehiSarreraBalioa() {
		int balorea = Integer.parseInt(SaioaBista.textSarreraKop.getText());
		balorea++;
		SaioaBista.textSarreraKop.setText(String.valueOf(balorea));
	}

	public static void KenduSarreraBalioa() {
		int balorea = Integer.parseInt(SaioaBista.textSarreraKop.getText());
		if (balorea > 0) {
			balorea--;
			SaioaBista.textSarreraKop.setText(String.valueOf(balorea));
		}
	}

}
