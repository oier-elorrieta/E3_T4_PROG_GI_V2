package test.ObjetuTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import modeloa.objetuak.Bezeroa;

public class BezeroTest {

	private static Bezeroa bezeroa;
	private static ArrayList<Bezeroa> bezeroaList;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {	
		bezeroaList = new ArrayList<>();
		bezeroaList.add(bezeroa);
		
		bezeroa = new Bezeroa("B01", "123456789M", "Mikelon", "Rodriguez", "Mikelodeon", "Mikel123", 123456789, "Emakumea");
		
	}
	
	@Test
	public void testBezeroaKonstruktore() {
		bezeroa.setIdBezeroa("B01");
		bezeroa.setNAN("123456789A");
		bezeroa.setIzena("Maria");
		bezeroa.setAbizena("Almoran");
		bezeroa.setErabiltzailea("MariaAlmo");
		bezeroa.setPasahitza("12345");
		bezeroa.setSexua("Emakumea");
		bezeroa.setTxartela(112233);

		assertEquals("B01", bezeroa.getIdBezeroa());
		assertEquals("123456789A", bezeroa.getNAN());
		assertEquals("Maria", bezeroa.getIzena());
		assertEquals("Almoran", bezeroa.getAbizena());
		assertEquals("MariaAlmo", bezeroa.getErabiltzailea());
		assertEquals("12345", bezeroa.getPasahitza());
		assertEquals("Emakumea", bezeroa.getSexua());
		assertEquals(112233, bezeroa.getTxartela());
	}
	
	@Test
	public void testBezeroaToString() {
		
		bezeroa.setIdBezeroa("B01");
		bezeroa.setNAN("NAN");
		bezeroa.setIzena("Izena");
		bezeroa.setAbizena("Abizena");
		bezeroa.setErabiltzailea("Erabiltzailea");
		bezeroa.setPasahitza("Pasahitza");
		bezeroa.setTxartela(1);
		bezeroa.setSexua("Sexua");
		
		assertEquals("Bezeroa [idBezeroa=B01, NAN=NAN, izena=Izena, abizena=Abizena, "
				+ "erabiltzailea=Erabiltzailea, pasahitza=Pasahitza, txartela=1, sexua=Sexua]", bezeroa.toString());
	}
	
    @Test
    public void testHashCodeBezeroa() {
        Bezeroa bezeroa1 = new Bezeroa("B01", "12345678A", "Nombre", "Apellido", "usuario1", "password1", 1234567890, "Masculino");
        Bezeroa bezeroa2 = new Bezeroa("B01", "12345678A", "Nombre", "Apellido", "usuario1", "password1", 1234567890, "Masculino");

        assertEquals(bezeroa1.hashCode(), bezeroa2.hashCode()); 
    }
    
    @Test
    public void test_BezeroEquals() {
        Bezeroa bezeroa = new Bezeroa("B01", "12345678A", "izena", "abizena", "erabiltzailea", "pasahitza", 0, "sexua");
        assertTrue(bezeroa.equals(bezeroa));
    }
 
    @Test
    public void test_BezeroBatzuk() {
        Bezeroa bezeroa1 = new Bezeroa("B01", "12345678A", "izena", "abizena", "erabiltzailea", "pasahitza", 0, "sexua");
        Bezeroa bezeroa2 = new Bezeroa("B01", "12345678A", "izena", "abizena", "erabiltzailea", "pasahitza", 0, "sexua");
        Bezeroa bezeroa3 = new Bezeroa("B01", "12345678A", "izena", "abizena", "erabiltzailea", "pasahitza", 0, "sexua");

        assertTrue(bezeroa1.equals(bezeroa2) && bezeroa2.equals(bezeroa3) && bezeroa1.equals(bezeroa3));
    }

    @Test
    public void test_BezeroNuloa() {
        Bezeroa bezeroa = new Bezeroa("B01", "12345678A", "izena", "abizena", "erabiltzailea", "pasahitza", 0, "sexua");
        assertFalse(bezeroa.equals(null));
    }

    @Test
    public void test_BezeroaObjetua() {
        Bezeroa bezeroa = new Bezeroa("B01", "12345678A", "izena", "abizena", "erabiltzailea", "pasahitza", 0, "sexua");
        assertFalse(bezeroa.equals("Not a Bezeroa object"));
    }

    @Test
    public void test_BezeroaEzberdina() {
        Bezeroa bezeroa1 = new Bezeroa("B01", "12345678A", "izena", "abizena", "erabiltzailea", "pasahitza", 0, "sexua");
        Bezeroa bezeroa2 = new Bezeroa("B02", "12345678A", "paco", "perez", "pacper", "1234", 0, "sexua");
        assertFalse(bezeroa1.equals(bezeroa2));
    }

}
