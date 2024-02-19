package kontrolatzaile.funtzioak;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
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

	public static void inicio() {

		objektuakHasieratu();
	}

	static List<Aretoa> areatoakList;
	static List<Bezeroa> bezeroakList;
	static List<Erosketak> erosketakList;
	static List<Pelikula> pelikulakList;
	public static List<Saioa> saioakList;
	static List<Sarrera> sarrerakList;
	static List<Zinema> zinemakList;
	static List<Pelikula> saioPelikulak;

	public static void objektuakHasieratu() {
		AretoaDao Aretoa = new AretoaDao();
		BezeroaDao Bezeroa = new BezeroaDao();
		ErosketakDao Erosketak = new ErosketakDao();
		PelikulaDao Pelikula = new PelikulaDao();
		SaioaDao Saioa = new SaioaDao();
		SarreraDao Sarrera = new SarreraDao();
		ZinemaDao Zinema = new ZinemaDao();

		areatoakList = new ArrayList<>();
		bezeroakList = new ArrayList<>();
		erosketakList = new ArrayList<>();
		pelikulakList = new ArrayList<>();
		saioakList = new ArrayList<>();
		sarrerakList = new ArrayList<>();
		zinemakList = new ArrayList<>();

		areatoakList = Aretoa.lortuAreatoak();
		bezeroakList = Bezeroa.lortuBezeroak();
		erosketakList = Erosketak.lortuErosketak();
		pelikulakList = Pelikula.lortuPelikulak();
		saioakList = Saioa.lortuSaioak();
		sarrerakList = Sarrera.lortuSarrerak();
		zinemakList = Zinema.lortuZinemak();

		System.out.println("\n\nAretoak:");
		for (int i = 0; i < areatoakList.size(); i++) {
			System.out.println(areatoakList.get(i));
		}
		System.out.println("\n\nBezeroak:");
		for (int i = 0; i < bezeroakList.size(); i++) {
			System.out.println(bezeroakList.get(i));
		}
		
		System.out.println("\n\nErosketa:");
		for (int i = 0; i < erosketakList.size(); i++) {
			System.out.println(erosketakList.get(i));
		}
		
		System.out.println("\n\nPelikula:");
		for (int i = 0; i < pelikulakList.size(); i++) {
			System.out.println(pelikulakList.get(i));
		}
		
//		System.out.println("\n\nSaioa:");
//		for(int i = 0 ; i < Aldagaiak.saioakListDao.size() ; i++) {
//			System.out.println(Aldagaiak.saioakListDao.get(i));
//		}
		
		System.out.println("\n\nSarrera:");
		for (int i = 0; i < sarrerakList.size(); i++) {
			System.out.println(sarrerakList.get(i));
		}
		
		System.out.println("\n\nZinema:");
		for (int i = 0; i < zinemakList.size(); i++) {
			System.out.println(zinemakList.get(i));
		}

				
		

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

	public static boolean login(String erabiltzailea, String pasahitza) {
		if (loginOK(erabiltzailea, pasahitza)) {
			try {
				ZinemaBista frame = new ZinemaBista();
				frame.setVisible(true);
			} catch (Exception a) {
				a.printStackTrace();
			}
			return true;
		}
		return false;
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

	public static void pelikulaBistaVisible() {
		try {
			PelikulaBista frame = new PelikulaBista();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void filmaDatuak() {
		Pelikula pelikula1 = new Pelikula(1, "CARS", "KOMEDIA", 120);
		Aldagaiak.izenaFilm = pelikula1.getIzena();
		Aldagaiak.generoFilm = pelikula1.getGeneroa();
		Aldagaiak.iraupenaFilm = pelikula1.getIraupena();
		Aldagaiak.urlFilmAux = Aldagaiak.urlFilm + Aldagaiak.izenaFilm + ".jpg";

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

		System.out.println(saioPelikulak);
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
