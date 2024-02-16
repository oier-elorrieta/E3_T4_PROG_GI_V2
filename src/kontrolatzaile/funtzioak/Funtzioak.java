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
		
		Aldagaiak.areatoakList = new ArrayList<>();
		Aldagaiak.bezeroakList = new ArrayList<>();
		Aldagaiak.erosketakList = new ArrayList<>();
		Aldagaiak.pelikulakList = new ArrayList<>();
		Aldagaiak.saioakList = new ArrayList<>();
		Aldagaiak.sarrerakList = new ArrayList<>();
		Aldagaiak.zinemakList = new ArrayList<>();
		Aldagaiak.elorrietaPelikulak = new ArrayList<>();
		Aldagaiak.erandioPelikulak = new ArrayList<>();
		Aldagaiak.barakaldoPelikulak = new ArrayList<>();
		Aldagaiak.santutxuPelikulak = new ArrayList<>();
		Aldagaiak.basauriPelikulak = new ArrayList<>();

		Aldagaiak.areatoakList = Aretoa.lortuAreatoak();
		Aldagaiak.bezeroakList = Bezeroa.lortuBezeroak();
		Aldagaiak.erosketakList = Erosketak.lortuErosketak();
		Aldagaiak.pelikulakList = Pelikula.lortuPelikulak();
		Aldagaiak.saioakList = Saioa.lortuSaioak();
		Aldagaiak.sarrerakList = Sarrera.lortuSarrerak();
		Aldagaiak.zinemakList = Zinema.lortuZinemak();
		Aldagaiak.elorrietaPelikulak = ZinemaAretoFilma.lortuElorrietaFilmak();
		Aldagaiak.erandioPelikulak =  ZinemaAretoFilma.lortuErandioFilmak();
		Aldagaiak.barakaldoPelikulak =  ZinemaAretoFilma.lortuBarakaldoFilmak();
		Aldagaiak.santutxuPelikulak =   ZinemaAretoFilma.lortuSantutxuFilmak();
		Aldagaiak.basauriPelikulak =  ZinemaAretoFilma.lortuBasauriFilmak();
		
		
		
		System.out.println("\n\nAretoak:");
		for(int i = 0 ; i < Aldagaiak.areatoakList.size() ; i++) {
			System.out.println(Aldagaiak.areatoakList.get(i));
		}
		System.out.println("\n\nBezeroak:");
		for(int i = 0 ; i < Aldagaiak.bezeroakList.size() ; i++) {
			System.out.println(Aldagaiak.bezeroakList.get(i));
		}
		System.out.println("\n\nErosketa:");
		for(int i = 0 ; i < Aldagaiak.erosketakList.size() ; i++) {
			System.out.println(Aldagaiak.erosketakList.get(i));
		}
		System.out.println("\n\nPelikula:");
		for(int i = 0 ; i < Aldagaiak.pelikulakList.size() ; i++) {
			System.out.println(Aldagaiak.pelikulakList.get(i));
		}
//		System.out.println("\n\nSaioa:");
//		for(int i = 0 ; i < Aldagaiak.saioakListDao.size() ; i++) {
//			System.out.println(Aldagaiak.saioakListDao.get(i));
//		}
		System.out.println("\n\nSarrera:");
		for(int i = 0 ; i < Aldagaiak.sarrerakList.size() ; i++) {
			System.out.println(Aldagaiak.sarrerakList.get(i));
		}
		System.out.println("\n\nZinema:");
		for(int i = 0 ; i < Aldagaiak.zinemakList.size() ; i++) {
			System.out.println(Aldagaiak.zinemakList.get(i));
		}
		
		//  
		
		System.out.println("\n\nElorrietaFilmak:");
		for(int i = 0 ; i < Aldagaiak.elorrietaPelikulak.size() ; i++) {
			System.out.println(Aldagaiak.elorrietaPelikulak.get(i));
		}
		System.out.println("\n\nErandioFilmak:");
		for(int i = 0 ; i < Aldagaiak.erandioPelikulak.size() ; i++) {
			System.out.println(Aldagaiak.erandioPelikulak.get(i));
		}
		System.out.println("\n\nBasauriFilmak:");
		for(int i = 0 ; i < Aldagaiak.basauriPelikulak.size() ; i++) {
			System.out.println(Aldagaiak.basauriPelikulak.get(i));
		}
		System.out.println("\n\nSantutxuFilmak:");
		for(int i = 0 ; i < Aldagaiak.santutxuPelikulak.size() ; i++) {
			System.out.println(Aldagaiak.santutxuPelikulak.get(i));
		}
		System.out.println("\n\nBarakaldoFilmak:");
		for(int i = 0 ; i < Aldagaiak.barakaldoPelikulak.size() ; i++) {
			System.out.println(Aldagaiak.barakaldoPelikulak.get(i));
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
		for (int i = 0; i < Aldagaiak.bezeroakList.size() ; i++) {

            if (Aldagaiak.bezeroakList.get(i).getErabiltzailea().equals(erabiltzailea) && Aldagaiak.bezeroakList.get(i).getPasahitza().equals(pasahitza)) {
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
