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
		aretoa = new Aretoa("A01", "Areto 1");
		pelikula = new Pelikula(1, "Cars", "Aventura", 169);
	}
	
	@Test
	public void testSarreraKonstruktore() {
		
		sarrera.setIdSarrera(1);
		sarrera.setSaioa(saioa);
		sarrera.setSarreraKant(1);
		sarrera.setPrezioa(6.95);
		sarrera.setMota("Gaztea");	

		assertEquals(1, sarrera.getIdSarrera());
		assertEquals(saioa, sarrera.getSaioa());
		assertEquals(1, sarrera.getSarreraKant());
		assertEquals(6.95, sarrera.getPrezioa(), 0.001);
		assertEquals("Gaztea", sarrera.getMota());
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
	public void testAretoaKonstruktore() {	
		
		aretoa.setIdAretoa("A01");
		aretoa.setIzena("Areto 1");
		
		assertEquals("A01", aretoa.getIdAretoa());
		assertEquals("Areto 1", aretoa.getIzena());
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

}
