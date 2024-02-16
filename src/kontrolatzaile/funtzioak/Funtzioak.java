package kontrolatzaile.funtzioak;

import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;
import java.util.List;

import bista.Zinema;
import modeloa.Aldagaiak;
import modeloa.dao.AretoaDao;
import modeloa.dao.BezeroaDao;
import modeloa.dao.ErosketakDao;
import modeloa.dao.PelikulaDao;
import modeloa.dao.SaioaDao;
import modeloa.dao.SarreraDao;
import modeloa.dao.ZinemaAretoFilmaDAO;
import modeloa.dao.ZinemaDao;
import modeloa.objetuak.Bezeroa;
import modeloa.objetuak.Pelikula;

public class Funtzioak {
	
	public static void inicio() {
		objektuakHasieratu();
	}
	
	public static void objektuakHasieratu() {
		AretoaDao Aretoa = new AretoaDao();
		BezeroaDao Bezeroa = new BezeroaDao();
		ErosketakDao Erosketak = new ErosketakDao();
		PelikulaDao Pelikula = new PelikulaDao();
		SaioaDao Saioa = new SaioaDao();
		SarreraDao Sarrera = new SarreraDao();
		ZinemaDao Zinema = new ZinemaDao();
		ZinemaAretoFilmaDAO ZinemaAretoFilma = new ZinemaAretoFilmaDAO();
		
		Aldagaiak.areatoakListDao = new ArrayList<>();
		Aldagaiak.bezeroakListDao = new ArrayList<>();
		Aldagaiak.erosketakListDao = new ArrayList<>();
		Aldagaiak.pelikulakListDao = new ArrayList<>();
		Aldagaiak.saioakListDao = new ArrayList<>();
		Aldagaiak.sarrerakListDao = new ArrayList<>();
		Aldagaiak.zinemakListDao = new ArrayList<>();
		Aldagaiak.elorrietaPelikulak = new ArrayList<>();
		
		Aldagaiak.areatoakListDao = Aretoa.lortuAreatoak();
		Aldagaiak.bezeroakListDao = Bezeroa.lortuBezeroak();
		Aldagaiak.erosketakListDao = Erosketak.lortuErosketak();
		Aldagaiak.pelikulakListDao = Pelikula.lortuPelikulak();
		Aldagaiak.saioakListDao = Saioa.lortuSaioak();
		Aldagaiak.sarrerakListDao = Sarrera.lortuSarrerak();
		Aldagaiak.zinemakListDao = Zinema.lortuZinemak();
		Aldagaiak.elorrietaPelikulak = ZinemaAretoFilma.lortuElorrietaFilmak();
		
		
		
		
		System.out.println("\n\nAretoak:");
		for(int i = 0 ; i < Aldagaiak.areatoakListDao.size() ; i++) {
			System.out.println(Aldagaiak.areatoakListDao.get(i));
		}
		System.out.println("\n\nBezeroak:");
		for(int i = 0 ; i < Aldagaiak.bezeroakListDao.size() ; i++) {
			System.out.println(Aldagaiak.bezeroakListDao.get(i));
		}
		System.out.println("\n\nErosketa:");
		for(int i = 0 ; i < Aldagaiak.erosketakListDao.size() ; i++) {
			System.out.println(Aldagaiak.erosketakListDao.get(i));
		}
		System.out.println("\n\nPelikula:");
		for(int i = 0 ; i < Aldagaiak.pelikulakListDao.size() ; i++) {
			System.out.println(Aldagaiak.pelikulakListDao.get(i));
		}
//		System.out.println("\n\nSaioa:");
//		for(int i = 0 ; i < Aldagaiak.saioakListDao.size() ; i++) {
//			System.out.println(Aldagaiak.saioakListDao.get(i));
//		}
		System.out.println("\n\nSarrera:");
		for(int i = 0 ; i < Aldagaiak.sarrerakListDao.size() ; i++) {
			System.out.println(Aldagaiak.sarrerakListDao.get(i));
		}
		System.out.println("\n\nZinema:");
		for(int i = 0 ; i < Aldagaiak.zinemakListDao.size() ; i++) {
			System.out.println(Aldagaiak.zinemakListDao.get(i));
		}
		System.out.println("\n\nElorrietaFilmak:");
		for(int i = 0 ; i < Aldagaiak.elorrietaPelikulak.size() ; i++) {
			System.out.println(Aldagaiak.elorrietaPelikulak.get(i));
		}
	}
	
	public static void login(String erabiltzailea, String pasahitza) {
		if (loginOK(erabiltzailea, pasahitza)) {
			try {
				Zinema frame = new Zinema();
				frame.setVisible(true);
			} catch (Exception a) {
				a.printStackTrace();
			}
		}
	}
	
	public static boolean loginOK(String erabiltzailea, String pasahitza) {
		boolean login = false;
//		
//		for (Bezeroa bezeroa : bezeroakListDao) {
//            if (bezeroa.getErabiltzailea().equals(erabiltzailea) && bezeroa.getPasahitza().equals(pasahitza)) {
//                // Bezeroa encontrado
//                login = true;
//                break; // Puedes salir del bucle una vez que encuentras el bezeroa
//            }
//        }
//		
		for (int i = 0; i < Aldagaiak.bezeroakListDao.size() ; i++) {

            if (Aldagaiak.bezeroakListDao.get(i).getErabiltzailea().equals(erabiltzailea) && Aldagaiak.bezeroakListDao.get(i).getPasahitza().equals(pasahitza)) {
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
	
	public static void filmaDatuak() {
		Pelikula pelikula1 = new Pelikula(1,"CARS","KOMEDIA",120);
		Aldagaiak.izenaFilm = pelikula1.getIzena();
		Aldagaiak.generoFilm = pelikula1.getGeneroa();
		Aldagaiak.iraupenaFilm = pelikula1.getIraupena();
		Aldagaiak.urlFilmAux = Aldagaiak.urlFilm + Aldagaiak.izenaFilm + ".jpg";
		
	}
}
