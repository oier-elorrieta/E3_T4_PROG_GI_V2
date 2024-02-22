package test.ObjetuTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import modeloa.objetuak.Aretoa;
import modeloa.objetuak.Saioa;
import modeloa.objetuak.Zinema;

public class ZinemaTest {

	private static Saioa saio;

	private static Aretoa areto;
	private static Zinema zinema;

	private static ArrayList<Saioa> saioList;
	private static ArrayList<Aretoa> aretoList;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		saioList = new ArrayList<>();
		saioList.add(saio);
		
		aretoList = new ArrayList<>();
		aretoList.add(areto);
		
		zinema = new Zinema("Z01", "Elorrieta", "Agirre Lehendakari", aretoList, saioList);
	}
		@Test
		public void testZinemaKonstruktoreTesta() {		
		    zinema.setIzena("Elorrieta Zinema");
		    zinema.setHelbidea("Bilbao, Calle San Jose");
		    zinema.setAretoList(aretoList);
		    zinema.setSaioList(saioList);
		    
		    assertEquals("Elorrieta Zinema", zinema.getIzena());
		    assertEquals("Bilbao, Calle San Jose", zinema.getHelbidea());
		    assertEquals(aretoList, zinema.getAretoList());
		    assertEquals(saioList, zinema.getSaioList());
		}
		
		@Test
		public void testZinemaToString() {

			zinema.setIdZinema("Z01");
			zinema.setIzena("Izena");
			zinema.setHelbidea("Helbidea");
			zinema.setAretoList(aretoList);
			zinema.setSaioList(saioList);
			
			assertEquals("Zinema [idZinema=Z01, izena=Izena, helbidea=Helbidea, aretoList=" + aretoList.toString() + ", saioList=" + saioList.toString() + "]", zinema.toString());		
		}
		
		@Test
	    public void testHashCodeZinema() {
	        Zinema zinema1 = new Zinema("Z01", "Cinesa", "Bilbao, Gran Via", aretoList, saioList);
	        Zinema zinema2 = new Zinema("Z01", "Cinesa", "Bilbao, Gran Via", aretoList, saioList);

	        assertEquals(zinema1.hashCode(), zinema2.hashCode());
	    }
	    
	/////////////////////////////////////////////////ZINEMAREN HASHCODE TEXTAK////////////////////////////////////////    
	    
	/////////////////////////////////////////////////ZINEMAREN EQUALS TEXTAK////////////////////////////////////////

	    @Test
	    public void test_ZinemaEquals() {
	        Zinema zinema = new Zinema("Z01", "Cinesa", "Gran Via", aretoList, saioList);
	        assertTrue(zinema.equals(zinema));
	    }

	    @Test
	    public void test_ZinemaBatzuk() {
	        Zinema zinema1 = new Zinema("Z01", "Cinesa", "Gran Via", aretoList, saioList);
	        Zinema zinema2 = new Zinema("Z01", "Cinesa", "Gran Via", aretoList, saioList);

	        assertTrue(zinema1.equals(zinema2) && zinema2.equals(zinema1));
	    } 

	    @Test
	    public void test_ZinemaNuloa() {
	        Zinema zinema = new Zinema("Z01", "Cinesa", "Gran Via", aretoList, saioList);
	        assertFalse(zinema.equals(null));
	    }

	    @Test
	    public void test_ZinemaObjetua() {
	        Zinema zinema = new Zinema("Z01", "Cinesa", "Gran Via", aretoList, saioList);
	        assertFalse(zinema.equals("Not a Zinema object"));
	    }

	    @Test
	    public void test_ZinemaEzberdina() {
	        Zinema zinema1 = new Zinema("Z01", "Cinesa", "Gran via", aretoList, saioList);
	        Zinema zinema2 = new Zinema("Z02", "Yelmos", "Casco Viejo", aretoList, saioList);
	        assertFalse(zinema1.equals(zinema2));
	    }
		
}
