package kontrolatzaile.funtzioak;

import java.util.ArrayList;

import bista.Zinema;
import modeloa.Aldagaiak;
import modeloa.dao.AretoaDao;
import modeloa.dao.BezeroaDao;
import modeloa.dao.ErosketakDao;
import modeloa.dao.PelikulaDao;
import modeloa.dao.SaioaDao;
import modeloa.dao.SarreraDao;
import modeloa.dao.ZinemaDao;

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
		
		Aldagaiak.areatoakListDao = new ArrayList<>();
		Aldagaiak.bezeroakListDao = new ArrayList<>();
		Aldagaiak.erosketakListDao = new ArrayList<>();
		Aldagaiak.pelikulakListDao = new ArrayList<>();
		Aldagaiak.saioakListDao = new ArrayList<>();
		Aldagaiak.sarrerakListDao = new ArrayList<>();
		Aldagaiak.zinemakListDao = new ArrayList<>();
		
		Aldagaiak.areatoakListDao = Aretoa.lortuAreatoak();
		Aldagaiak.bezeroakListDao = Bezeroa.lortuBezeroak();
		Aldagaiak.erosketakListDao = Erosketak.lortuErosketak();
		Aldagaiak.pelikulakListDao = Pelikula.lortuPelikulak();
		Aldagaiak.saioakListDao = Saioa.lortuSaioak();
		Aldagaiak.sarrerakListDao = Sarrera.lortuSarrerak();
		Aldagaiak.zinemakListDao = Zinema.lortuZinemak();
		
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
		System.out.println("\n\nSaioa:");
		for(int i = 0 ; i < Aldagaiak.saioakListDao.size() ; i++) {
			System.out.println(Aldagaiak.saioakListDao.get(i));
		}
		System.out.println("\n\nSarrera:");
		for(int i = 0 ; i < Aldagaiak.sarrerakListDao.size() ; i++) {
			System.out.println(Aldagaiak.sarrerakListDao.get(i));
		}
		System.out.println("\n\nZinema:");
		for(int i = 0 ; i < Aldagaiak.zinemakListDao.size() ; i++) {
			System.out.println(Aldagaiak.zinemakListDao.get(i));
		}
	}
	
	public static void login() {
		if (loginOK()) {
			try {
				Zinema frame = new Zinema();
				frame.setVisible(true);
			} catch (Exception a) {
				a.printStackTrace();
			}
		}
	}
	
	public static boolean loginOK() {
		boolean login = true;
		//codigo
		return login;
	}
	
}
