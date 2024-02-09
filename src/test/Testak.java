package test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

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
	
	private static Bezeroa[] bezeroArray;
	private static ArrayList<Pelikula> pelikulaList;
	private static ArrayList<Saioa> saioList;
	private static Saioa[] saioArray;
	private static ArrayList<Aretoa> aretoList;
	private static ArrayList<Karteldegia> karteldegiList;
	private static Aretoa[] aretoArray;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {	
		data = LocalDate.of(2024, 1, 1);
		time = LocalTime.of(12, 0, 0);

		bezeroArray = new Bezeroa[0];
		bezeroArray[0] = bezero;
		
		pelikulaList = new ArrayList<>();
		pelikulaList.add(pelikula);
		
		saioList = new ArrayList<>();
		saioList.add(saio);
		
		saioArray = new Saioa[0];
		saioArray[0] = saio;
		
		aretoList = new ArrayList<>();
		aretoList.add(areto);
		
		karteldegiList = new ArrayList<>();
		karteldegiList.add(karteldegi);
		
		aretoArray = new Aretoa[0];
		aretoArray[0] = areto;
		
		
		bezero = new Bezeroa("123456789M", "Mikelon", "Rodriguez", "Mikelodeon", "Mikel123", 123456789, "Emakumea");
		pelikula = new Pelikula("Cars", "Aventura", 169);
		erosketa = new Erosketak(bezeroArray, data);
		karteldegi = new Karteldegia(pelikulaList);
		saio = new Saioa(time, data);
		areto = new Aretoa("Areto 1", saioList);
		sarrera = new Sarrera(saioArray, data, 20, "Aventura");
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
		erosketa.setBezeroa(bezeroArray);
		erosketa.setData(data);
		erosketa.setDeskontua(1);
		erosketa.setDirutotala(1);

		assertEquals(bezeroArray, erosketa.getBezeroa());
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
		saio.setAretoa(aretoArray);
		saio.setOrdua(time);
		saio.setEguna(data);
		
		assertEquals(karteldegiList, saio.getFilma());
		assertEquals(aretoArray, saio.getAretoa());
		assertEquals(time, saio.getOrdua());
		assertEquals(data, saio.getEguna());
	}

	@Test
	public void testSarreraKonstruktoreTesta() {
		sarrera.setData(data);
		sarrera.setMota("Gaztea");
		sarrera.setPrezioa(6.95);

		assertEquals(1, sarrera.getIdSarrera());
		assertEquals(data, sarrera.getData());
		assertEquals("Gaztea", sarrera.getMota());
		assertEquals(6.95, sarrera.getPrezioa(), 0.001);
	}

	@Test
	public void testZinemaKonstruktoreTesta() {	
	    zinema.setAretoList(kopuru);
	    zinema.setIzena("Elorrieta Zinema");
	    zinema.setHelbidea("Bilbao, Calle San Jose");
	    zinema.setNIF("122456");
	    
	    assertEquals(1, zinema.getIdZinema());
	    assertEquals(kopuru, zinema.getAretoList());
	    assertEquals("Elorrieta Zinema", zinema.getIzena());
	    assertEquals("Bilbao, Calle San Jose", zinema.getHelbidea());
	    assertEquals("122456", zinema.getNIF());
	}
	
	@Test
	public void testAretoaToString() {
		areto.setIzena("Talde4");
		areto.setIdAreto(1);
		
		assertEquals("Aretoa [idAreto=1, izena=Talde4]", areto.toString());
	}
	
	@Test
	public void testBezeroaToString() {
		bezero.setIdBezero(1);
		bezero.setNAN("NAN");
		bezero.setIzena("Izena");
		bezero.setAbizena("Abizena");
		bezero.setErabiltzailea("Erabiltzailea");
		bezero.setPasahitza("Pasahitza");
		bezero.setTxartela(1);
		bezero.setSexua("Sexua");
		assertEquals("Bezeroa [idBezero=1, NAN=NAN, izena=Izena, abizena=Abizena, erabiltzailea=Erabiltzailea, pasahitza=Pasahitza, txartela=1, sexua=Sexua]", bezero.toString());
	}
	
	@Test
	public void testErosketakToString() {
		LocalDate dataFroga = LocalDate.of(2024, 1, 1);
		
		erosketa.setIdErosketa(1);
		erosketa.setKant(1);
		erosketa.setData(dataFroga);
		erosketa.setDeskontua(1);
		erosketa.setDirutotala(1);
		assertEquals("Erosketak [idErosketa=1, kant=1, data=" + dataFroga +", deskontua=1.0, dirutotala=1.0]", erosketa.toString());
	}
	
	@Test
	public void testPelikulaToString() {
		pelikula.setIdPelikula(1);
		pelikula.setIraupena(1);
		pelikula.setIzenaFilma("Izena");
		pelikula.setGeneroa("Generoa");
		assertEquals("Pelikula [idPelikula=1, iraupena=1, izenaFilma=Izena, generoa=Generoa]", pelikula.toString());		
	}
	
	@Test
	public void testSaioaToString() {
		LocalDate dataFroga = LocalDate.of(2024, 1, 1);
		LocalTime orduFroga = LocalTime.of(15, 0, 0);
		
		saio.setIdSaioa(1);
		saio.setOrdua(orduFroga);
		saio.setEguna(dataFroga);
		
		assertEquals("Saioa [idSaioa=1, ordua=" + orduFroga + ", eguna=" + dataFroga + "]", saio.toString());		
	}
	
	@Test
	public void testSarreraToString() {
		LocalDate dataFroga = LocalDate.of(2024, 1, 1);
		
		sarrera.setIdSarrera(1);
		sarrera.setData(dataFroga);
		sarrera.setPrezioa(1);
		sarrera.setMota("Mota");
		
		assertEquals("Sarrera [idSarrera=1, data=" + dataFroga + ", prezioa=1.0, mota=Mota]", sarrera.toString());		
	}
	
	@Test
	public void testZinemaToString() {
		ArrayList<Integer> kopuru = new ArrayList<>(Arrays.asList(1));
		
		zinema.setIdZinema(1);
		zinema.setIzena("Izena");
		zinema.setHelbidea("Helbidea");
		zinema.setAretoList(kopuru);
		zinema.setNIF("nif");
		
		assertEquals("Zinema [idZinema=1, izena=Izena, helbidea=Helbidea, aretoList=[1], NIF=nif]", zinema.toString());		
	}

	@Test
    public void testHashCodeAretoa() {
        Aretoa aretoa1 = new Aretoa("Sala A");
        Aretoa aretoa2 = new Aretoa("Sala A");

        assertEquals(aretoa1.hashCode(), aretoa2.hashCode());
    }

    @Test
    public void testEqualsAretoa() {
        Aretoa aretoa1 = new Aretoa("Sala A");
        Aretoa aretoa2 = new Aretoa("Sala A");
        Aretoa aretoa3 = new Aretoa("Sala B");

        assertTrue(aretoa1.equals(aretoa2));
        assertFalse(aretoa1.equals(aretoa3));
    }
    
    @Test
    public void testHashCodeBezeroa() {
        Bezeroa bezeroa1 = new Bezeroa("12345678A", "Nombre", "Apellido", "usuario1", "password1",1234567890 ,"Masculino");
        Bezeroa bezeroa2 = new Bezeroa("12345678A", "Nombre", "Apellido", "usuario1", "password1",1234567890 ,"Masculino");

        assertEquals(bezeroa1.hashCode(), bezeroa2.hashCode());
    }

    @Test
    public void testEqualsBezeroa() {
        Bezeroa bezeroa1 = new Bezeroa("12345678A", "Nombre", "Apellido", "usuario1", "password1",1234567890 ,"Masculino");
        Bezeroa bezeroa2 = new Bezeroa("12345678A", "Nombre", "Apellido", "usuario1", "password1",1234567890 ,"Masculino");
        Bezeroa bezeroa3 = new Bezeroa("12345678A", "Nombre", "Apellido", "usuario2", "password1",1234567890 ,"Masculino");

        assertTrue(bezeroa1.equals(bezeroa2));
        assertFalse(bezeroa1.equals(bezeroa3));
    }
    
    @Test
    public void testHashCodeErosketa() {
    	LocalDate dataFroga = LocalDate.of(2024, 1, 1);
    	
        Erosketak erosketak1 = new Erosketak(2, dataFroga);
        Erosketak erosketak2 = new Erosketak(2, dataFroga);

        assertEquals(erosketak1.hashCode(), erosketak2.hashCode());
    }

    @Test
    public void testEqualsErosketa() {
    	LocalDate dataFroga = LocalDate.of(2024, 1, 1);
    	
        Erosketak erosketak1 = new Erosketak(2, dataFroga);
        Erosketak erosketak2 = new Erosketak(2, dataFroga);
        Erosketak erosketak3 = new Erosketak(1, dataFroga);

        assertTrue(erosketak1.equals(erosketak2));
        assertFalse(erosketak1.equals(erosketak3));
    }
    
    @Test
    public void testHashCodePelikula() {
        Pelikula pelikula1 = new Pelikula(120, "Accion", "Titanic");
        Pelikula pelikula2 = new Pelikula(120, "Accion", "Titanic");

        assertEquals(pelikula1.hashCode(), pelikula2.hashCode());
    }

    @Test
    public void testEqualsPelikula() {
        Pelikula pelikula1 = new Pelikula(120, "Accion", "Titanic");
        Pelikula pelikula2 = new Pelikula(120, "Accion", "Titanic");
        Pelikula pelikula3 = new Pelikula(90, "Comedia", "Avatar");

        assertTrue(pelikula1.equals(pelikula2));
        assertFalse(pelikula1.equals(pelikula3));
    }
    
    @Test
    public void testHashCodeSaioa() {
        Saioa saioa1 = new Saioa(LocalTime.of(10, 30), LocalDate.of(2024, 2, 20));
        Saioa saioa2 = new Saioa(LocalTime.of(10, 30), LocalDate.of(2024, 2, 20));

        assertEquals(saioa1.hashCode(), saioa2.hashCode());
    }

    @Test
    public void testEqualsSaioa() {
        Saioa saioa1 = new Saioa(LocalTime.of(10, 30), LocalDate.of(2024, 2, 20));
        Saioa saioa2 = new Saioa(LocalTime.of(10, 30), LocalDate.of(2024, 2, 20));
        Saioa saioa3 = new Saioa(LocalTime.of(12, 0), LocalDate.of(2024, 2, 20));

        assertTrue(saioa1.equals(saioa2));
        assertFalse(saioa1.equals(saioa3));
    }
    
    @Test
    public void testHashCodeSarrera() {
        Sarrera sarrera1 = new Sarrera(LocalDate.of(2024, 2, 20), 15.0, "Normal");
        Sarrera sarrera2 = new Sarrera(LocalDate.of(2024, 2, 20), 15.0, "Normal");

        assertEquals(sarrera1.hashCode(), sarrera2.hashCode());
    }

    @Test
    public void testEqualsSarrera() {
        Sarrera sarrera1 = new Sarrera(LocalDate.of(2024, 2, 20), 15.0, "Normal");
        Sarrera sarrera2 = new Sarrera(LocalDate.of(2024, 2, 20), 15.0, "Normal");
        Sarrera sarrera3 = new Sarrera(LocalDate.of(2024, 2, 21), 20.0, "Gaztea");

        assertTrue(sarrera1.equals(sarrera2));
        assertFalse(sarrera1.equals(sarrera3));
    }
    
    @Test
    public void testHashCodeZinema() {
        Zinema zinema1 = new Zinema("Cinesa", "Bilbao, Gran Via", new ArrayList<Integer>());
        Zinema zinema2 = new Zinema("Cinesa", "Bilbao, Gran Via", new ArrayList<Integer>());

        assertEquals(zinema1.hashCode(), zinema2.hashCode());
    }

    @Test
    public void testEqualsZinema() {
        Zinema zinema1 = new Zinema("Cinesa", "Bilbao, Gran Via", new ArrayList<Integer>());
        Zinema zinema2 = new Zinema("Cinesa", "Bilbao, Gran Via", new ArrayList<Integer>());
        Zinema zinema3 = new Zinema("Yelmo", "Madrid, Gran Via", new ArrayList<Integer>());

        assertTrue(zinema1.equals(zinema2));
        assertFalse(zinema1.equals(zinema3));
    }
}
