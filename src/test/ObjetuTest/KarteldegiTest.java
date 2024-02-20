package test.ObjetuTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import modeloa.objetuak.Karteldegia;
import modeloa.objetuak.Pelikula;

public class KarteldegiTest {

	private static Karteldegia karteldegia;
	private static Pelikula pelikula;
	private static ArrayList<Pelikula> pelikulaList;
	private static ArrayList<Karteldegia> karteldegiList;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		pelikulaList = new ArrayList<>();
		pelikulaList.add(pelikula);
		
		karteldegiList = new ArrayList<>();
		karteldegiList.add(karteldegia);
		
		karteldegia = new Karteldegia(pelikulaList);		
		
	}
	
	@Test
	public void testKarteldegiKonstruktore() {		
	    karteldegia.setFilmList(pelikulaList);
	    
	    assertEquals(pelikulaList, karteldegia.getFilmList());
	}

	@Test
	public void testKarteldegiToString() {
		karteldegia.setFilmList(pelikulaList);
		
		assertEquals("Karteldegia [filmList=" + pelikulaList.toString() + "]", karteldegia.toString());		
	}
	
	@Test
	public void testHashCodeKarteldegi() {
	Karteldegia karteldegui1 = new Karteldegia(pelikulaList);
	Karteldegia karteldegui2 = new Karteldegia(pelikulaList);

	assertEquals(karteldegui1.hashCode(), karteldegui2.hashCode());
	}
	
	@Test
	public void test_KarteldegiEquals() {
	    Karteldegia karteldegia = new Karteldegia(pelikulaList);
	    assertTrue(karteldegia.equals(karteldegia));
	}

	@Test
	public void test_KarteldegiBatzuk() {

	    Karteldegia karteldegia1 = new Karteldegia(pelikulaList);
	    Karteldegia karteldegia2 = new Karteldegia(pelikulaList);

	    assertTrue(karteldegia1.equals(karteldegia2) && karteldegia2.equals(karteldegia1));
	}

	@Test
	public void test_KarteldegiNuloa() {
	    Karteldegia karteldegia = new Karteldegia(pelikulaList);
	    assertFalse(karteldegia.equals(null));
	}

	@Test
	public void test_KarteldegiObjetua() {
	    Karteldegia karteldegia = new Karteldegia(pelikulaList);
	    assertFalse(karteldegia.equals("Not a Karteldegia object"));
	}

}
