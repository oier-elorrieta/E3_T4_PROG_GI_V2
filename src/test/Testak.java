package test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import modeloa.objetuak.Aretoa;
import modeloa.objetuak.Bezeroa;
import modeloa.objetuak.Erosketak;
import modeloa.objetuak.Karteldegia;
import modeloa.objetuak.Pelikula;
import modeloa.objetuak.Saioa;
import modeloa.objetuak.Sarrera;
import modeloa.objetuak.Zinema;

public class Testak {
	
	private static Aretoa areto;
	private static Bezeroa bezero;
	private static Erosketak erosketa;
	private static Karteldegia karteldegi;
	private static Pelikula pelikula;
	private static Saioa saio;
	private static Sarrera sarrera;
	private static Zinema zinema;
	
	private static LocalDate data;
	private static LocalTime time;
	
	private static ArrayList<Bezeroa> bezeroaList;
	private static ArrayList<Pelikula> pelikulaList;
	private static ArrayList<Saioa> saioList;
	private static ArrayList<Aretoa> aretoList;
	private static ArrayList<Karteldegia> karteldegiList;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {	
		bezeroaList = new ArrayList<>();
		bezeroaList.add(bezero);
		
		pelikulaList = new ArrayList<>();
		pelikulaList.add(pelikula);
		
		saioList = new ArrayList<>();
		saioList.add(saio);
		
		aretoList = new ArrayList<>();
		aretoList.add(areto);
		
		karteldegiList = new ArrayList<>();
		karteldegiList.add(karteldegi);
		 
		bezero = new Bezeroa("123456789M", "Mikelon", "Rodriguez", "Mikelodeon", "Mikel123", 123456789, "Emakumea");
		pelikula = new Pelikula("Cars", "Aventura", 169);
		erosketa = new Erosketak(bezeroaList, data);
		karteldegi = new Karteldegia(pelikulaList);
		saio = new Saioa(time, data);
		areto = new Aretoa("Areto 1", saioList);
		sarrera = new Sarrera(saio, data, 20, "Normala");
		zinema = new Zinema("Elorrieta", "Agirre Lehendakari", aretoList, saioList);
	}

	@Test
	public void testAretoaKonstruktoreTesta() {	
		areto.setIzena("Areto 1");
		areto.setSaioList(saioList);
		
		assertEquals("Areto 1", areto.getIzena());
		assertEquals(saioList, areto.getSaioList());
	}

	@Test
	public void testBezeroaKonstruktoreTesta() {
		bezero.setNAN("123456789A");
		bezero.setIzena("Maria");
		bezero.setAbizena("Almoran");
		bezero.setErabiltzailea("MariaAlmo");
		bezero.setPasahitza("12345");
		bezero.setSexua("Emakumea");
		bezero.setTxartela(112233);

		assertEquals("123456789A", bezero.getNAN());
		assertEquals("Maria", bezero.getIzena());
		assertEquals("Almoran", bezero.getAbizena());
		assertEquals("MariaAlmo", bezero.getErabiltzailea());
		assertEquals("12345", bezero.getPasahitza());
		assertEquals("Emakumea", bezero.getSexua());
		assertEquals(112233, bezero.getTxartela());
	}
	
	@Test
	public void testErosketakKonstruktoreTesta() {
        erosketa.setBezeroa(bezeroaList);
		erosketa.setData(data);
		erosketa.setDeskontua(1);
		erosketa.setDirutotala(1);

		assertEquals(bezeroaList, erosketa.getBezeroa());
		assertEquals(data, erosketa.getData());
		assertEquals(1.0, erosketa.getDeskontua(), 0.001);
		assertEquals(1.0, erosketa.getDirutotala(), 0.001);
	}

	@Test
	public void testPelikulaKonstruktoreTesta() {
		pelikula.setIzena("CARS");
		pelikula.setIraupena(60);
		pelikula.setGeneroa("Komedia");

		assertEquals("CARS", pelikula.getIzena());
		assertEquals(60, pelikula.getIraupena());
		assertEquals("Komedia", pelikula.getGeneroa());
	}
	
	@Test
	public void testSaioaKonstruktoreTesta() {
		saio.setFilma(karteldegiList);
		saio.setAretoa(areto);
		saio.setOrdua(time);
		saio.setEguna(data);
		
		assertEquals(karteldegiList, saio.getFilma());
		assertEquals(areto, saio.getAretoa());
		assertEquals(time, saio.getOrdua());
		assertEquals(data, saio.getEguna());
	}

	@Test
	public void testSarreraKonstruktoreTesta() {
		LocalDate dataFroga = LocalDate.of(2024, 1, 1);
		
		sarrera.setSaioa(saio);
		sarrera.setData(dataFroga);
		sarrera.setPrezioa(6.95);
		sarrera.setMota("Gaztea");	

		assertEquals(saio, sarrera.getSaioa());
		assertEquals(dataFroga, sarrera.getData());
		assertEquals(6.95, sarrera.getPrezioa(), 0.001);
		assertEquals("Gaztea", sarrera.getMota());
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
	public void testKarteleraKonstruktoreTesta() {		
	    karteldegi.setFilmList(pelikulaList);
	    
	    assertEquals(pelikulaList, karteldegi.getFilmList());
	}
	
	@Test
	// "Aretoa [izena=" + izena + ", saioList=" + saioList + "]"
	public void testAretoaToString() {
        areto.setIzena("Talde4");
        areto.setSaioList(saioList);
		
        assertEquals("Aretoa [izena=Talde4, saioList=" + saioList.toString() + "]", areto.toString());
	}
	
	@Test
	public void testBezeroaToString() {
		bezero.setNAN("NAN");
		bezero.setIzena("Izena");
		bezero.setAbizena("Abizena");
		bezero.setErabiltzailea("Erabiltzailea");
		bezero.setPasahitza("Pasahitza");
		bezero.setTxartela(1);
		bezero.setSexua("Sexua");
		
		assertEquals("Bezeroa [NAN=NAN, izena=Izena, abizena=Abizena, erabiltzailea=Erabiltzailea, pasahitza=Pasahitza, txartela=1, sexua=Sexua]", bezero.toString());
	}
	
	@Test
	// Erosketak [bezeroa=" + bezeroa + ", data=" + data + ", deskontua=" + deskontua + ", dirutotala=" + dirutotala + "]
	public void testErosketakToString() {
		LocalDate dataFroga = LocalDate.of(2024, 1, 1); 
		
		erosketa.setBezeroa(bezeroaList);
		erosketa.setData(dataFroga);
		erosketa.setDeskontua(1);
		erosketa.setDirutotala(1);
		assertEquals("Erosketak [bezeroa=" + bezeroaList.toString() + ", data=" + dataFroga +", deskontua=1.0, dirutotala=1.0]", erosketa.toString());
	}
	
	@Test
	// Pelikula [izena=" + izena + ", generoa=" + generoa + ", iraupena=" + iraupena + "]
	public void testPelikulaToString() {
		
		pelikula.setIzena("Cars");
		pelikula.setIraupena(1);
		pelikula.setGeneroa("Aventura");
		
		assertEquals("Pelikula [izena=Cars, generoa=Aventura, iraupena=1]", pelikula.toString());	
	}
	
	@Test
	//"Saioa [filma=" + filma + ", aretoa=" + aretoa + ", ordua=" + ordua + ", eguna=" + eguna + "]"
	public void testSaioaToString() {
		LocalDate dataFroga = LocalDate.of(2024, 1, 1);
		LocalTime orduFroga = LocalTime.of(15, 0, 0);
		
		saio.setAretoa(areto);
		saio.setFilma(karteldegiList);
		saio.setOrdua(orduFroga);
		saio.setEguna(dataFroga);
		
		assertEquals("Saioa [filma=" + karteldegiList.toString() + ", aretoa=" + areto.toString() + ", ordua=" + orduFroga + ", eguna=" + dataFroga + "]", saio.toString());		
	}
	
	@Test
	public void testSarreraToString() {
		LocalDate dataFroga = LocalDate.of(2024, 1, 1);
		
		sarrera.setSaioa(saio);
		sarrera.setData(dataFroga);
		sarrera.setPrezioa(1);
		sarrera.setMota("Normala");
		
		assertEquals("Sarrera [saioa=" + saio.toString() + ", data=" + dataFroga + ", prezioa=1.0, mota=Normala]", sarrera.toString());		
	}
	
	@Test
	// "Zinema [izena=" + izena + ", helbidea=" + helbidea + ", aretoList=" + aretoList + ", saioList=" + saioList + "]"
	public void testZinemaToString() {

		zinema.setIzena("Izena");
		zinema.setHelbidea("Helbidea");
		zinema.setAretoList(aretoList);
		zinema.setSaioList(saioList);
		
		assertEquals("Zinema [izena=Izena, helbidea=Helbidea, aretoList=" + aretoList.toString() + ", saioList=" + saioList.toString() + "]", zinema.toString());		
	}
	
	@Test
	// Karteldegia [filmList=" + filmList + "]"
	public void testKarteldegiToString() {

		karteldegi.setFilmList(pelikulaList);
		
		assertEquals("Karteldegia [filmList=" + pelikulaList.toString() + "]", karteldegi.toString());		
	}
	

/////////////////////////////////////////////////ARETOKO HASHCODE TEXTAK////////////////////////////////////////

	@Test
    public void testHashCodeAretoa() {
        Aretoa aretoa1 = new Aretoa("Sala A", saioList);
        Aretoa aretoa2 = new Aretoa("Sala A", saioList);

        assertEquals(aretoa1.hashCode(), aretoa2.hashCode());
    }

/////////////////////////////////////////////////ARETOKO HASHCODE TEXTAK////////////////////////////////////////

/////////////////////////////////////////////////ARETOKO EQUALS TEXTAK////////////////////////////////////////

    @Test
    public void test_AretoEquals() {
    	ArrayList<Saioa> saioList1 = new ArrayList<>();
    	
        Aretoa aretoa = new Aretoa("izena", saioList1);
        assertTrue(aretoa.equals(aretoa));
    }

    @Test
    public void test_AretoBatzuk() {
        Aretoa aretoa1 = new Aretoa("izena", saioList);
        Aretoa aretoa2 = new Aretoa("izena", saioList);

        assertTrue(aretoa1.equals(aretoa2) && aretoa2.equals(aretoa1));
    } 

    @Test
    public void test_AretoNuloa() {
        Aretoa aretoa = new Aretoa("izena", saioList);
        assertFalse(aretoa.equals(null));
    }

    @Test
    public void test_AretoObjetua() {
        Aretoa aretoa = new Aretoa("izena", saioList);
        assertFalse(aretoa.equals("Not an Aretoa object"));
    }

    @Test
    public void test_AretoEzberdina() {
    	ArrayList<Saioa> saioList2 = new ArrayList<>();
    	
        Aretoa aretoa1 = new Aretoa("izena1", saioList);
        Aretoa aretoa2 = new Aretoa("izena2", saioList2);
        assertFalse(aretoa1.equals(aretoa2));
    }
    
/////////////////////////////////////////////////ARETOKO EQUALS TEXTAK////////////////////////////////////////
 
/////////////////////////////////////////////////BEZEROAREN HASHCODE TEXTAK////////////////////////////////////////

    @Test
    public void testHashCodeBezeroa() {
        Bezeroa bezeroa1 = new Bezeroa("12345678A", "Nombre", "Apellido", "usuario1", "password1", 1234567890, "Masculino");
        Bezeroa bezeroa2 = new Bezeroa("12345678A", "Nombre", "Apellido", "usuario1", "password1", 1234567890, "Masculino");

        assertEquals(bezeroa1.hashCode(), bezeroa2.hashCode()); 
    }
    
/////////////////////////////////////////////////BEZEROAREN HASHCODE TEXTAK////////////////////////////////////////

/////////////////////////////////////////////////BEZEROAREN EQUALS TEXTAK////////////////////////////////////////
    
    @Test
    public void test_BezeroEquals() {
        Bezeroa bezeroa = new Bezeroa("12345678A", "izena", "abizena", "erabiltzailea", "pasahitza", 0, "sexua");
        assertTrue(bezeroa.equals(bezeroa));
    }

    @Test
    public void test_BezeroBatzuk() {
        Bezeroa bezeroa1 = new Bezeroa("12345678A", "izena", "abizena", "erabiltzailea", "pasahitza", 0, "sexua");
        Bezeroa bezeroa2 = new Bezeroa("12345678A", "izena", "abizena", "erabiltzailea", "pasahitza", 0, "sexua");
        Bezeroa bezeroa3 = new Bezeroa("12345678A", "izena", "abizena", "erabiltzailea", "pasahitza", 0, "sexua");

        assertTrue(bezeroa1.equals(bezeroa2) && bezeroa2.equals(bezeroa3) && bezeroa1.equals(bezeroa3));
    }

    @Test
    public void test_BezeroNuloa() {
        Bezeroa bezeroa = new Bezeroa("12345678A", "izena", "abizena", "erabiltzailea", "pasahitza", 0, "sexua");
        assertFalse(bezeroa.equals(null));
    }

    @Test
    public void test_BezeroaObjetua() {
        Bezeroa bezeroa = new Bezeroa("12345678A", "izena", "abizena", "erabiltzailea", "pasahitza", 0, "sexua");
        assertFalse(bezeroa.equals("Not a Bezeroa object"));
    }

    @Test
    public void test_BezeroaEzberdina() {
        Bezeroa bezeroa1 = new Bezeroa("12345678A", "izena", "abizena", "erabiltzailea", "pasahitza", 0, "sexua");
        Bezeroa bezeroa2 = new Bezeroa("12345678A", "paco", "perez", "pacper", "1234", 0, "sexua");
        assertFalse(bezeroa1.equals(bezeroa2));
    }

/////////////////////////////////////////////////BEZEROAREN EQUALS TEXTAK////////////////////////////////////////
    
/////////////////////////////////////////////////EROSKETAREN HASHCODE TEXTAK////////////////////////////////////////

    @Test
    public void testHashCodeErosketa() {
    	LocalDate dataFroga = LocalDate.of(2024, 1, 1);
    	
        Erosketak erosketak1 = new Erosketak(bezeroaList, dataFroga);
        Erosketak erosketak2 = new Erosketak(bezeroaList, dataFroga);

        assertEquals(erosketak1.hashCode(), erosketak2.hashCode());
    }

/////////////////////////////////////////////////EROSKETAREN HASHCODE TEXTAK////////////////////////////////////////
    
/////////////////////////////////////////////////EROSKETAREN EQUALS TEXTAK////////////////////////////////////////

    @Test
    public void test_ErosketaEquals() {
    	LocalDate dataFroga = LocalDate.of(2024, 1, 1);	
    
        Erosketak erosketak = new Erosketak(bezeroaList, dataFroga);
        assertTrue(erosketak.equals(erosketak));
    }

    @Test
    public void test_ErosketakBatzuk() {
    	LocalDate dataFroga = LocalDate.of(2024, 1, 1);	
    	
        Erosketak erosketak1 = new Erosketak(bezeroaList, dataFroga);
        Erosketak erosketak2 = new Erosketak(bezeroaList, dataFroga);
        Erosketak erosketak3 = new Erosketak(bezeroaList, dataFroga);

        assertTrue(erosketak1.equals(erosketak2) && erosketak2.equals(erosketak3) && erosketak1.equals(erosketak3));
    }

    @Test
    public void test_ErosketaNuloa() {
    	LocalDate dataFroga = LocalDate.of(2024, 1, 1);	
    	
        Erosketak erosketak = new Erosketak(bezeroaList, dataFroga);
        assertFalse(erosketak.equals(null));
    }

    @Test
    public void test_ErosketaObjetua() {
    	LocalDate dataFroga = LocalDate.of(2024, 1, 1);	
    	
        Erosketak erosketak = new Erosketak(bezeroaList, dataFroga);
        assertFalse(erosketak.equals("Not an Erosketak object"));
    }

    @Test
    public void test_ErosketaEzberdina() {
    	LocalDate dataFroga = LocalDate.of(2024, 1, 1);	
    	LocalDate dataFrogaBI = LocalDate.of(2023, 5, 23);	
    	
        Erosketak erosketak1 = new Erosketak(bezeroaList, dataFroga);
        Erosketak erosketak2 = new Erosketak(bezeroaList, dataFrogaBI);
        assertFalse(erosketak1.equals(erosketak2));
    }
 
/////////////////////////////////////////////////EROSKETAREN EQUALS TEXTAK////////////////////////////////////////

/////////////////////////////////////////////////PELIKULA HASHCODE TEXTAK////////////////////////////////////////
    
    @Test
    public void testHashCodePelikula() {
        Pelikula pelikula1 = new Pelikula("Titanic", "Accion", 120);
        Pelikula pelikula2 = new Pelikula("Titanic", "Accion", 120);

        assertEquals(pelikula1.hashCode(), pelikula2.hashCode());
    }
    
/////////////////////////////////////////////////PELIKULA HASHCODE TEXTAK////////////////////////////////////////
    
/////////////////////////////////////////////////PELIKULAREN EQUALS TEXTAK////////////////////////////////////////

    @Test
    public void test_PelikulaEquals() {
        Pelikula pelikula = new Pelikula("izena", "generoa", 120);
        assertTrue(pelikula.equals(pelikula));
    }

    @Test
    public void test_PelikulaBatzuk() {
        Pelikula pelikula1 = new Pelikula("izena", "generoa", 120);
        Pelikula pelikula2 = new Pelikula("izena", "generoa", 120);
        Pelikula pelikula3 = new Pelikula("izena", "generoa", 120);

        assertTrue(pelikula1.equals(pelikula2) && pelikula2.equals(pelikula3) && pelikula1.equals(pelikula3));
    }

    @Test
    public void test_PelikulaNuloa() {
        Pelikula pelikula = new Pelikula("izena", "generoa", 120); 
        assertFalse(pelikula.equals(null));
    }

    @Test
    public void test_PelikulaObjetua() {
        Pelikula pelikula = new Pelikula("izena", "generoa", 120);
        assertFalse(pelikula.equals("Not a Pelikula object"));
    }

    @Test
    public void test_PelikulaEzberdina() {
        Pelikula pelikula1 = new Pelikula("izena1", "generoa", 120);
        Pelikula pelikula2 = new Pelikula("izena2", "generoa", 120);
        assertFalse(pelikula1.equals(pelikula2));
    }
    
/////////////////////////////////////////////////PELIKULAREN EQUALS TEXTAK////////////////////////////////////////
    
/////////////////////////////////////////////////SAIOAREN HASHCODE TEXTAK////////////////////////////////////////
    
    @Test
    public void testHashCodeSaioa() {
        Saioa saioa1 = new Saioa(LocalTime.of(10, 30), LocalDate.of(2024, 2, 20));
        Saioa saioa2 = new Saioa(LocalTime.of(10, 30), LocalDate.of(2024, 2, 20));

        assertEquals(saioa1.hashCode(), saioa2.hashCode());
    }
    
/////////////////////////////////////////////////SAIOAREN HASHCODE TEXTAK////////////////////////////////////////

/////////////////////////////////////////////////SAIOAREN EQUALS TEXTAK////////////////////////////////////////

    @Test
    public void test_SaioaEquals() {
        Saioa saioa = new Saioa(LocalTime.of(10, 30), LocalDate.of(2024, 2, 20));
        assertTrue(saioa.equals(saioa));
    }

    @Test
    public void test_SaioaBatzuk() {
        Saioa saioa1 = new Saioa(LocalTime.of(10, 30), LocalDate.of(2024, 2, 20));
        Saioa saioa2 = new Saioa(LocalTime.of(10, 30), LocalDate.of(2024, 2, 20));
        Saioa saioa3 = new Saioa(LocalTime.of(10, 30), LocalDate.of(2024, 2, 20));

        assertTrue(saioa1.equals(saioa2) && saioa2.equals(saioa3) && saioa1.equals(saioa3));
    }

    @Test
    public void test_SaioaNuloa() {
        Saioa saioa = new Saioa(LocalTime.of(10, 30), LocalDate.of(2024, 2, 20));
        assertFalse(saioa.equals(null));
    }

    @Test
    public void test_SaioaObjetua() {
        Saioa saioa = new Saioa(LocalTime.of(10, 30), LocalDate.of(2024, 2, 20));
        assertFalse(saioa.equals("Not a Saioa object"));
    }

    @Test
    public void test_SaioaEzberdina() {
        Saioa saioa1 = new Saioa(LocalTime.of(10, 30), LocalDate.of(2024, 2, 20));
        Saioa saioa2 = new Saioa(LocalTime.of(20, 40), LocalDate.of(2024, 7, 25));
        assertFalse(saioa1.equals(saioa2));
    }
    
    
/////////////////////////////////////////////////SAIOAREN EQUALS TEXTAK////////////////////////////////////////
    
/////////////////////////////////////////////////SARREREN HASHCODE TEXTAK////////////////////////////////////////
    
    @Test
    public void testHashCodeSarrera() {
    	LocalDate dataFroga = LocalDate.of(2024, 1, 1);
    	
        Sarrera sarrera1 = new Sarrera(saio, dataFroga, 15.0, "Normal");
        Sarrera sarrera2 = new Sarrera(saio, dataFroga, 15.0, "Normal");

        assertEquals(sarrera1.hashCode(), sarrera2.hashCode());
    }
    
/////////////////////////////////////////////////SARREREN HASHCODE TEXTAK////////////////////////////////////////

/////////////////////////////////////////////////SARREREN EQUALS TEXTAK////////////////////////////////////////
    
    @Test
    public void test_SarreraEquals() {
    	LocalDate dataFroga = LocalDate.of(2024, 1, 1);
    	
        Sarrera sarrera = new Sarrera(saio, dataFroga, 10.0, "mota");
        assertTrue(sarrera.equals(sarrera));
    }

    @Test
    public void test_SarreraBatzuk() {
    	LocalDate dataFroga = LocalDate.of(2024, 1, 1);

        Sarrera sarrera1 = new Sarrera(saio, dataFroga, 10.0, "mota");
        Sarrera sarrera2 = new Sarrera(saio, dataFroga, 10.0, "mota");
        Sarrera sarrera3 = new Sarrera(saio, dataFroga, 10.0, "mota");

        assertTrue(sarrera1.equals(sarrera2) && sarrera2.equals(sarrera3) && sarrera1.equals(sarrera3));
    }

    @Test
    public void test_SarreraNuloa() {
    	LocalDate dataFroga = LocalDate.of(2024, 1, 1);

        Sarrera sarrera = new Sarrera(saio, dataFroga, 10.0, "mota");
        assertFalse(sarrera.equals(null));
    }

    @Test
    public void test_SarreraObjetua() {
    	LocalDate dataFroga = LocalDate.of(2024, 1, 1);

        Sarrera sarrera = new Sarrera(saio, dataFroga, 10.0, "mota");
        assertFalse(sarrera.equals("Not a Sarrera object"));
    }

    @Test
    public void test_SarreraEzberdina() {
    	LocalDate dataFroga = LocalDate.of(2024, 1, 1);

        Sarrera sarrera1 = new Sarrera(saio, dataFroga, 10.0, "mota");
        Sarrera sarrera2 = new Sarrera(saio, dataFroga, 11.0, "mota");
        assertFalse(sarrera1.equals(sarrera2));
    }
    
/////////////////////////////////////////////////SARREREN EQUALS TEXTAK////////////////////////////////////////
    
/////////////////////////////////////////////////ZINEMAREN HASHCODE TEXTAK////////////////////////////////////////
    
    @Test
    public void testHashCodeZinema() {
        Zinema zinema1 = new Zinema("Cinesa", "Bilbao, Gran Via", aretoList, saioList);
        Zinema zinema2 = new Zinema("Cinesa", "Bilbao, Gran Via", aretoList, saioList);

        assertEquals(zinema1.hashCode(), zinema2.hashCode());
    }
    
/////////////////////////////////////////////////ZINEMAREN HASHCODE TEXTAK////////////////////////////////////////    
    
/////////////////////////////////////////////////ZINEMAREN EQUALS TEXTAK////////////////////////////////////////

    @Test
    public void test_ZinemaEquals() {
        Zinema zinema = new Zinema("Cinesa", "Gran Via", aretoList, saioList);
        assertTrue(zinema.equals(zinema));
    }

    @Test
    public void test_ZinemaBatzuk() {
        Zinema zinema1 = new Zinema("Cinesa", "Gran Via", aretoList, saioList);
        Zinema zinema2 = new Zinema("Cinesa", "Gran Via", aretoList, saioList);

        assertTrue(zinema1.equals(zinema2) && zinema2.equals(zinema1));
    } 

    @Test
    public void test_ZinemaNuloa() {
        Zinema zinema = new Zinema("Cinesa", "Gran Via", aretoList, saioList);
        assertFalse(zinema.equals(null));
    }

    @Test
    public void test_ZinemaObjetua() {
        Zinema zinema = new Zinema("Cinesa", "Gran Via", aretoList, saioList);
        assertFalse(zinema.equals("Not a Zinema object"));
    }

    @Test
    public void test_ZinemaEzberdina() {
        Zinema zinema1 = new Zinema("Cinesa", "Gran via", aretoList, saioList);
        Zinema zinema2 = new Zinema("Yelmos", "Casco Viejo", aretoList, saioList);
        assertFalse(zinema1.equals(zinema2));
    }
    
/////////////////////////////////////////////////ZINEMAREN EQUALS TEXTAK////////////////////////////////////////
    
/////////////////////////////////////////////////KARTELDEGUIAREN HASHCODE TEXTAK////////////////////////////////////////
    
@Test
public void testHashCodeKarteldegi() {
Karteldegia karteldegui1 = new Karteldegia(pelikulaList);
Karteldegia karteldegui2 = new Karteldegia(pelikulaList);

assertEquals(karteldegui1.hashCode(), karteldegui2.hashCode());
}

/////////////////////////////////////////////////KARTELDEGUIAREN HASHCODE TEXTAK////////////////////////////////////////  


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

@Test
public void test_KarteldegiEzberdina() {
	ArrayList<Pelikula> filmList2 = new ArrayList<>();
    filmList2.add(new Pelikula("CARS", "AVENTURA", 120));

    Karteldegia karteldegia1 = new Karteldegia(pelikulaList);
    Karteldegia karteldegia2 = new Karteldegia(filmList2);

    assertFalse(karteldegia1.equals(karteldegia2));
}

}
