package test.ObjetuTest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import modeloa.objetuak.Pelikula;

public class PelikulaTest {

	private static Pelikula pelikula;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		pelikula = new Pelikula(1, "Cars", "Aventura", 169);
		
	}
	
	@Test
	public void testPelikulaKonstruktore() {
		
		pelikula.setIdPelikula(1);
		pelikula.setIzena("Cars");
		pelikula.setIraupena(60);
		pelikula.setGeneroa("Aventura");

		assertEquals(1, pelikula.getIdPelikula());
		assertEquals("Cars", pelikula.getIzena());
		assertEquals(60, pelikula.getIraupena());
		assertEquals("Aventura", pelikula.getGeneroa());
	}
	
	@Test
	public void testPelikulaToString() {
		
		pelikula.setIdPelikula(1);
		pelikula.setIzena("Cars");
		pelikula.setIraupena(1);
		pelikula.setGeneroa("Aventura");
		
		assertEquals("Pelikula [idPelikula=1, izena=Cars, generoa=Aventura, iraupena=1]", pelikula.toString());	
	}
	
	 @Test
	    public void testHashCodePelikula() {
	        Pelikula pelikula1 = new Pelikula(1, "Titanic", "Accion", 120);
	        Pelikula pelikula2 = new Pelikula(1, "Titanic", "Accion", 120);

	        assertEquals(pelikula1.hashCode(), pelikula2.hashCode());
	    }

	    @Test
	    public void test_PelikulaEquals() {
	        Pelikula pelikula = new Pelikula(1, "izena", "generoa", 120);
	        assertTrue(pelikula.equals(pelikula));
	    }

	    @Test
	    public void test_PelikulaBatzuk() {
	        Pelikula pelikula1 = new Pelikula(1, "izena", "generoa", 120);
	        Pelikula pelikula2 = new Pelikula(1, "izena", "generoa", 120);
	        Pelikula pelikula3 = new Pelikula(1, "izena", "generoa", 120);

	        assertTrue(pelikula1.equals(pelikula2) && pelikula2.equals(pelikula3) && pelikula1.equals(pelikula3));
	    }

	    @Test
	    public void test_PelikulaNuloa() {
	        Pelikula pelikula = new Pelikula(1, "izena", "generoa", 120); 
	        assertFalse(pelikula.equals(null));
	    }

	    @Test
	    public void test_PelikulaObjetua() {
	        Pelikula pelikula = new Pelikula(1, "izena", "generoa", 120);
	        assertFalse(pelikula.equals("Not a Pelikula object"));
	    }

	    @Test
	    public void test_PelikulaEzberdina() {
	        Pelikula pelikula1 = new Pelikula(1, "izena1", "generoa", 120);
	        Pelikula pelikula2 = new Pelikula(2, "izena2", "generoa", 120);
	        assertFalse(pelikula1.equals(pelikula2));
	    }
	
}
