package test.ObjetuTest;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import modeloa.objetuak.Aretoa;
import modeloa.objetuak.Pelikula;
import modeloa.objetuak.Saioa;
import modeloa.objetuak.Sarrera;

public class SarreraTest {

	private static Sarrera sarrera;
	private static Saioa saioa;
	private static Aretoa aretoa;
	private static Pelikula pelikula;
	
	private static LocalDate data;
	private static LocalTime time;
	
	private static ArrayList<Saioa> saioaList;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		saioaList = new ArrayList<>();
		saioaList.add(saioa);
		
		sarrera = new Sarrera(1, saioa, data, 20, "Normala");
		saioa = new Saioa(1, aretoa, time, data, pelikula);
		aretoa = new Aretoa("A01", "Z01", "Areto 1");
		pelikula = new Pelikula(1, "Cars", "Aventura", 169);
	}
	
	@Test
	public void testSarreraKonstruktoreTesta() {
		
		sarrera.setSaioa(saioa);
		sarrera.setSarreraKant(1);
		sarrera.setPrezioa(6.95);
		sarrera.setMota("Gaztea");	

		assertEquals(saioa, sarrera.getSaioa());
		assertEquals(1, sarrera.getSarreraKant());
		assertEquals(6.95, sarrera.getPrezioa(), 0.001);
		assertEquals("Gaztea", sarrera.getMota());
	}
	
	@Test
	public void testSarreraToString() {
		
		sarrera.setIdSarrera(1);
		sarrera.setSaioa(saioa);
		sarrera.setData(data);
		sarrera.setSarreraKant(1);
		sarrera.setPrezioa(1);
		sarrera.setMota("Normala");
		
		assertEquals("Sarrera [idSarrera=1, saioa=" + saioa.toString() + ", sarreraKant=1, prezioa=1.0, mota=Normala, data=" + data + "]", sarrera.toString());		
	}
	
	 @Test
	    public void testHashCodeSarrera() {
	    	LocalDate dataFroga = LocalDate.of(2024, 1, 1);
	    	
	        Sarrera sarrera1 = new Sarrera(1, saioa, dataFroga, 15.0, "Normal");
	        Sarrera sarrera2 = new Sarrera(1, saioa, dataFroga, 15.0, "Normal");

	        assertEquals(sarrera1.hashCode(), sarrera2.hashCode());
	    }
	    
	/////////////////////////////////////////////////SARREREN HASHCODE TEXTAK////////////////////////////////////////

	/////////////////////////////////////////////////SARREREN EQUALS TEXTAK////////////////////////////////////////
	    
	    @Test
	    public void test_SarreraEquals() {
	    	LocalDate dataFroga = LocalDate.of(2024, 1, 1);
	    	
	        Sarrera sarrera = new Sarrera(1, saioa, dataFroga, 10.0, "mota");
	        assertTrue(sarrera.equals(sarrera));
	    }

	    @Test
	    public void test_SarreraBatzuk() {
	    	LocalDate dataFroga = LocalDate.of(2024, 1, 1);

	        Sarrera sarrera1 = new Sarrera(1, saioa, dataFroga, 10.0, "mota");
	        Sarrera sarrera2 = new Sarrera(1, saioa, dataFroga, 10.0, "mota");
	        Sarrera sarrera3 = new Sarrera(1, saioa, dataFroga, 10.0, "mota");

	        assertTrue(sarrera1.equals(sarrera2) && sarrera2.equals(sarrera3) && sarrera1.equals(sarrera3));
	    }

	    @Test
	    public void test_SarreraNuloa() {
	    	LocalDate dataFroga = LocalDate.of(2024, 1, 1);

	        Sarrera sarrera = new Sarrera(1, saioa, dataFroga, 10.0, "mota");
	        assertFalse(sarrera.equals(null));
	    }

	    @Test
	    public void test_SarreraObjetua() {
	    	LocalDate dataFroga = LocalDate.of(2024, 1, 1);

	        Sarrera sarrera = new Sarrera(1, saioa, dataFroga, 10.0, "mota");
	        assertFalse(sarrera.equals("Not a Sarrera object"));
	    }

	    @Test
	    public void test_SarreraEzberdina() {
	    	LocalDate dataFroga = LocalDate.of(2024, 1, 1);

	        Sarrera sarrera1 = new Sarrera(1, saioa, dataFroga, 10.0, "mota");
	        Sarrera sarrera2 = new Sarrera(2, saioa, dataFroga, 11.0, "mota");
	        assertFalse(sarrera1.equals(sarrera2));
	    }
	
}
