package test.ObjetuTest;

import static org.junit.Assert.*;

//////////////////////////////////idfilma///////////////////

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import modeloa.objetuak.Aretoa;

public class AretoaTest {
	
	private static Aretoa aretoa;
	
	private static ArrayList<Aretoa> aretoaList;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		aretoaList = new ArrayList<>();
		aretoaList.add(aretoa);
		
		aretoa = new Aretoa("A01", "Areto 1");
		
	}
	
	@Test
	public void testAretoaKonstruktore() {	
		
		aretoa.setIdAretoa("A01");
		aretoa.setIzena("Areto 1");
		
		assertEquals("A01", aretoa.getIdAretoa());
		assertEquals("Areto 1", aretoa.getIzena());
	}
	
	@Test
	public void testAretoaToString() {
		aretoa.setIdAretoa("A01");
        aretoa.setIzena("Talde4");

		
        assertEquals("Aretoa [idAretoa=A01, izena=Talde4]", aretoa.toString());
	}
	
	@Test
    public void testHashCodeAretoa() {
        Aretoa aretoa1 = new Aretoa("A01", "Sala A");
        Aretoa aretoa2 = new Aretoa("A01", "Sala A");

        assertEquals(aretoa1.hashCode(), aretoa2.hashCode());
    }

    @Test
    public void test_AretoEquals() {	
        Aretoa aretoa = new Aretoa("A01", "izena");
        assertTrue(aretoa.equals(aretoa));
    }

    @Test
    public void test_AretoBatzuk() {
        Aretoa aretoa1 = new Aretoa("A01", "izena");
        Aretoa aretoa2 = new Aretoa("A01", "izena");

        assertTrue(aretoa1.equals(aretoa2) && aretoa2.equals(aretoa1));
    } 

    @Test
    public void test_AretoNuloa() {
        Aretoa aretoa = new Aretoa("A01", "izena");
        assertFalse(aretoa.equals(null));
    }

    @Test
    public void test_AretoObjetua() {
        Aretoa aretoa = new Aretoa("A01", "izena");
        assertFalse(aretoa.equals("Not an Aretoa object"));
    }

    @Test
    public void test_AretoEzberdina() {
    	
    	
        Aretoa aretoa1 = new Aretoa("A01", "izena1");
        Aretoa aretoa2 = new Aretoa("A02", "izena2");
        assertFalse(aretoa1.equals(aretoa2));
    }

}
