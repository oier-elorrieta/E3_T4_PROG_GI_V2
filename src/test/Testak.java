package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import modeloa.objetuak.Aretoa;
import modeloa.objetuak.Bezeroa;
import modeloa.objetuak.Pelikula;
import modeloa.objetuak.Sarrera;
import modeloa.objetuak.Zinema;

public class Testak {

	private static Aretoa aretoFroga;
	private static Bezeroa bezeroFroga;
	private static Pelikula pelikulaFroga;
	private static Sarrera sarreraFroga;
	private static Zinema zinemaFroga;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		aretoFroga = new Aretoa(null);
		bezeroFroga = new Bezeroa(null, null, null, null, null, 0, null);
		pelikulaFroga = new Pelikula(0, null, null);
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

}
