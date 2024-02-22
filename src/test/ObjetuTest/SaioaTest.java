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

public class SaioaTest {
	
	private static Pelikula pelikula;
	private static Aretoa aretoa;

	private static Saioa saioa;
	private static ArrayList<Saioa> saioaList;
	
	private static LocalDate data;
	private static LocalTime time;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		saioaList = new ArrayList<>();
		saioaList.add(saioa);
		
		saioa = new Saioa(1, aretoa, time, data, pelikula);
		aretoa = new Aretoa("A01", "Z01", "Areto 1");
		pelikula = new Pelikula(1, "Cars", "Aventura", 169);

	}
	
	@Test
	public void testSaioaKonstruktore() {
		saioa.setIdSaioa(1);
		saioa.setPelikula(pelikula);
		saioa.setAretoa(aretoa);
		saioa.setOrdua(time);
		saioa.setEguna(data);
		
		assertEquals(1, saioa.getIdSaioa());
		assertEquals(pelikula, saioa.getPelikula());
		assertEquals(aretoa, saioa.getAretoa());
		assertEquals(time, saioa.getOrdua());
		assertEquals(data, saioa.getEguna());
	}
	
	@Test
	public void testSaioaToString() {
		LocalDate dataFroga = LocalDate.of(2024, 1, 1);
		LocalTime orduFroga = LocalTime.of(15, 0, 0);

		saioa.setIdSaioa(1);
		saioa.setAretoa(aretoa);
		saioa.setOrdua(orduFroga);
		saioa.setEguna(dataFroga);
		saioa.setPelikula(pelikula);
		
		assertEquals("Saioa [idSaioa=1, aretoa=" + aretoa.toString() + ", ordua=" + orduFroga + ", eguna=" + dataFroga + ", pelikula=" + pelikula.toString() +  "]", saioa.toString());		
	}
	
    @Test
    public void testHashCodeSaioa() {
        Saioa saioa1 = new Saioa(1, aretoa, LocalTime.of(10, 30), LocalDate.of(2024, 2, 20), pelikula);
        Saioa saioa2 = new Saioa(1, aretoa, LocalTime.of(10, 30), LocalDate.of(2024, 2, 20), pelikula);

        assertEquals(saioa1.hashCode(), saioa2.hashCode());
    }
    
    @Test
    public void test_SaioaEquals() {
        Saioa saioa = new Saioa(1, aretoa, LocalTime.of(10, 30), LocalDate.of(2024, 2, 20), pelikula);
        assertTrue(saioa.equals(saioa));
    }

    @Test
    public void test_SaioaBatzuk() {
        Saioa saioa1 = new Saioa(1, aretoa, LocalTime.of(10, 30), LocalDate.of(2024, 2, 20), pelikula);
        Saioa saioa2 = new Saioa(1, aretoa, LocalTime.of(10, 30), LocalDate.of(2024, 2, 20), pelikula);
        Saioa saioa3 = new Saioa(1, aretoa, LocalTime.of(10, 30), LocalDate.of(2024, 2, 20), pelikula);

        assertTrue(saioa1.equals(saioa2) && saioa2.equals(saioa3) && saioa1.equals(saioa3));
    }

    @Test
    public void test_SaioaNuloa() {
        Saioa saioa = new Saioa(1, aretoa, LocalTime.of(10, 30), LocalDate.of(2024, 2, 20), pelikula);
        assertFalse(saioa.equals(null));
    }

    @Test
    public void test_SaioaObjetua() {
        Saioa saioa = new Saioa(1, aretoa, LocalTime.of(10, 30), LocalDate.of(2024, 2, 20), pelikula);
        assertFalse(saioa.equals("Not a Saioa object"));
    }

    @Test
    public void test_SaioaEzberdina() {
        Saioa saioa1 = new Saioa(1, aretoa, LocalTime.of(10, 30), LocalDate.of(2024, 2, 20), pelikula);
        Saioa saioa2 = new Saioa(6, aretoa, LocalTime.of(10, 30), LocalDate.of(2024, 2, 20), pelikula);
        assertFalse(saioa1.equals(saioa2));
    }

}
