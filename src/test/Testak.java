package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import modeloa.objetuak.Aretoa;
import modeloa.objetuak.Bezeroa;
import modeloa.objetuak.Erosketak;
import modeloa.objetuak.Pelikula;
import modeloa.objetuak.Saioa;
import modeloa.objetuak.Sarrera;
import modeloa.objetuak.Zinema;

public class Testak {

	private static Aretoa aretoFroga;
	private static Bezeroa bezeroFroga;
	private static Erosketak erosketaFroga;
	private static Pelikula pelikulaFroga;
	private static Saioa saioFroga;
	private static Sarrera sarreraFroga;
	private static Zinema zinemaFroga;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		aretoFroga = new Aretoa(null);
		bezeroFroga = new Bezeroa(null, null, null, null, null, 0, null);
		erosketaFroga = new Erosketak(0, null);
		pelikulaFroga = new Pelikula(0, null, null);
		saioFroga = new Saioa(0,0);
		sarreraFroga = new Sarrera(null, 0, null);
		zinemaFroga = new Zinema(null, null, null);
	}

	@Test
	public void aretoKonstruktoreTesta_ONDO() {
		aretoFroga.setIdAreto(1);
		aretoFroga.setIzena("Areto 1");

		assertEquals(1, aretoFroga.getIdAreto());
		assertEquals("Areto 1", aretoFroga.getIzena());
		;
	}

	@Test
	public void BezeroKonstruktoreTesta_ONDO() {
		bezeroFroga.setIdBezero(1);
		bezeroFroga.setNAN("123456789A");
		bezeroFroga.setIzena("Maria");
		bezeroFroga.setAbizena("Almoran");
		bezeroFroga.setErabiltzailea("MariaAlmo");
		bezeroFroga.setPasahitza("12345");
		bezeroFroga.setSexua("Emakumea");
		bezeroFroga.setTxartela(112233);

		assertEquals(1, bezeroFroga.getIdBezero());
		assertEquals("123456789A", bezeroFroga.getNAN());
		assertEquals("Maria", bezeroFroga.getIzena());
		assertEquals("Almoran", bezeroFroga.getAbizena());
		assertEquals("MariaAlmo", bezeroFroga.getErabiltzailea());
		assertEquals("12345", bezeroFroga.getPasahitza());
		assertEquals("Emakumea", bezeroFroga.getSexua());
		assertEquals(112233, bezeroFroga.getTxartela());
	}
	
	@Test
	public void ErosketakKonstruktoreTesta_ONDO() {
		erosketaFroga.setIdErosketa(1);
		erosketaFroga.setKant(1);
		erosketaFroga.setData("Data");
		erosketaFroga.setDeskontua(1);
		erosketaFroga.setDirutotala(1);

		assertEquals(erosketaFroga.getIdErosketa(),1);
		assertEquals(erosketaFroga.getKant(),1);
		assertEquals(erosketaFroga.getData(),"Data");
		assertEquals(erosketaFroga.getDeskontua(),1.0,1);
		assertEquals(erosketaFroga.getDirutotala(),1.0,1);
	}

	@Test
	public void pelikulaKonstruktoreTesta_ONDO() {
		pelikulaFroga.setIdPelikula(1);
		pelikulaFroga.setIzenaFilma("CARS");
		pelikulaFroga.setIraupena(60);
		pelikulaFroga.setGeneroa("Komedia");

		assertEquals(1, pelikulaFroga.getIdPelikula());
		assertEquals("CARS", pelikulaFroga.getIzenaFilma());
		assertEquals(60, pelikulaFroga.getIraupena());
		assertEquals("Komedia", pelikulaFroga.getGeneroa());
	}
	
	@Test
	public void saioaKonstruktoreTesta_ONDO() {
		saioFroga.setIdSaioa(1);
		saioFroga.setIdPelikula(1);
		saioFroga.setIdAreto(1);
		saioFroga.setOrdua(1);
		saioFroga.setEguna(1);
		
		assertEquals(saioFroga.getIdSaioa(),1);
		assertEquals(saioFroga.getIdPelikula(),1);
		assertEquals(saioFroga.getIdAreto(),1);
		assertEquals(saioFroga.getOrdua(),1,1);
		assertEquals(saioFroga.getEguna(),1);
	}

	@Test
	public void sarreraKonstruktoreTesta_ONDO() {
		sarreraFroga.setIdSarrera(1);
		sarreraFroga.setIdAretoa(1);
		sarreraFroga.setData("2/2/2024");
		sarreraFroga.setIdFilma(20);
		sarreraFroga.setIdZinema(2);
		sarreraFroga.setMota("Gaztea");
		sarreraFroga.setPrezioa(6.95);

		assertEquals(1, sarreraFroga.getIdSarrera());
		assertEquals(1, sarreraFroga.getIdAretoa());
		assertEquals("2/2/2024", sarreraFroga.getData());
		assertEquals(20, sarreraFroga.getIdFilma());
		assertEquals(2, sarreraFroga.getIdZinema());
		assertEquals("Gaztea", sarreraFroga.getMota());
		assertEquals(6.95, sarreraFroga.getPrezioa(), 0.001);
	}

	@Test
	public void zinemaKonstruktoreTesta_ONDO() {
		ArrayList<Integer> kopuru = new ArrayList<>(Arrays.asList(1, 2, 3));
		
		zinemaFroga.setIdZinema(1);
	    zinemaFroga.setAretoKop(kopuru);
	    zinemaFroga.setIzena("Elorrieta Zinema");
	    zinemaFroga.setHelbidea("Bilbao, Calle San Jose");
	    zinemaFroga.setNIF("122456");
	    
	    assertEquals(1, zinemaFroga.getIdZinema());
	    assertEquals(kopuru, zinemaFroga.getAretoKop());
	    assertEquals("Elorrieta Zinema", zinemaFroga.getIzena());
	    assertEquals("Bilbao, Calle San Jose", zinemaFroga.getHelbidea());
	    assertEquals("122456", zinemaFroga.getNIF());
	    
	}
	
	@Test
	public void aretoaToStringTest() {
		aretoFroga.setIzena("Talde4");
		aretoFroga.setIdAreto(1);
		assertEquals(aretoFroga.toString(), "Aretoa [idAreto=1, izena=Talde4]");
	}
	
	@Test
	public void bezeroaToStringTest() {
		bezeroFroga.setIdBezero(1);
		bezeroFroga.setNAN("NAN");
		bezeroFroga.setIzena("Izena");
		bezeroFroga.setAbizena("Abizena");
		bezeroFroga.setErabiltzailea("Erabiltzailea");
		bezeroFroga.setPasahitza("Pasahitza");
		bezeroFroga.setTxartela(1);
		bezeroFroga.setSexua("Sexua");
		assertEquals(bezeroFroga.toString(), "Bezeroa [idBezero=1, NAN=NAN, izena=Izena, abizena=Abizena, erabiltzailea=Erabiltzailea, pasahitza=Pasahitza, txartela=1, sexua=Sexua]");
	}
	
	@Test
	public void erosketakToStringTest() {
		erosketaFroga.setIdErosketa(1);
		erosketaFroga.setKant(1);
		erosketaFroga.setData("Data");
		erosketaFroga.setDeskontua(1);
		erosketaFroga.setDirutotala(1);
		assertEquals(erosketaFroga.toString(), "Erosketak [idErosketa=1, kant=1, data=Data, deskontua=1.0, dirutotala=1.0]");
	}
	
	@Test
	public void pelikulaToStringTest() {
		pelikulaFroga.setIdPelikula(1);
		pelikulaFroga.setIraupena(1);
		pelikulaFroga.setIzenaFilma("Izena");
		pelikulaFroga.setGeneroa("Generoa");
		assertEquals(pelikulaFroga.toString(), "Pelikula [idPelikula=1, iraupena=1, izenaFilma=Izena, generoa=Generoa]");		
	}
	
	@Test
	public void saioaToStringTest() {
		saioFroga.setIdSaioa(1);
		saioFroga.setIdPelikula(1);
		saioFroga.setIdAreto(1);
		saioFroga.setOrdua(1);
		saioFroga.setEguna(1);
		assertEquals(saioFroga.toString(), "Saioa [idSaioa=1, idPelikula=1, idAreto=1, ordua=1.0, eguna=1]");		
	}
	
	@Test
	public void sarreraToStringTest() {
		sarreraFroga.setIdSarrera(1);
		sarreraFroga.setIdAretoa(1);
		sarreraFroga.setIdZinema(1);
		sarreraFroga.setIdFilma(1);
		sarreraFroga.setData("Data");
		sarreraFroga.setPrezioa(1);
		sarreraFroga.setMota("Mota");
		assertEquals(sarreraFroga.toString(), "Sarrera [idSarrera=1, idAretoa=1, idZinema=1, idFilma=1, data=Data, prezioa=1.0, mota=Mota]");		
	}
	
	@Test
	public void zinemaToStringTest() {
		ArrayList<Integer> kopuru = new ArrayList<>(Arrays.asList(1));
		zinemaFroga.setIdZinema(1);
		zinemaFroga.setIzena("Izena");
		zinemaFroga.setHelbidea("Helbidea");
		zinemaFroga.setAretoKop(kopuru);
		zinemaFroga.setNIF("nif");
		assertEquals(zinemaFroga.toString(), "Zinema [idZinema=1, izena=Izena, helbidea=Helbidea, aretoKop=[1], NIF=nif]");		
	}

}
