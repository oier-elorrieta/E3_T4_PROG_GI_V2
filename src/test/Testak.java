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

	private static Aretoa aretoFroga;
	private static Bezeroa bezeroFroga;
	private static Erosketak erosketaFroga;
	private static Karteldegia karteldegiFroga;
	private static Pelikula pelikulaFroga;
	private static Saioa saioFroga;
	private static Sarrera sarreraFroga;
	private static Zinema zinemaFroga;
	
	private static Aretoa areto;
	private static Bezeroa bezero;
	private static Erosketak erosketa;
	private static Karteldegia karteldegi;
	private static Pelikula pelikula;
	private static Saioa saio;
	private static Sarrera sarrera;
	private static Zinema zinema;

	//--------------------Objektuak--------------------//
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//----------SET/GET egiteko objetuak----------//
		ArrayList<Integer> arrayList = null;
		int[] array = null;
		
		aretoFroga = new Aretoa(null, arrayList);
		bezeroFroga = new Bezeroa(null, null, null, null, null, 0, null);
		erosketaFroga = new Erosketak(array, null);
		karteldegiFroga = new Karteldegia(arrayList);
		pelikulaFroga = new Pelikula(null, null, 0);
		saioFroga = new Saioa(arrayList, array, null, null);
		sarreraFroga = new Sarrera(array, null, 0, null);
		zinemaFroga = new Zinema(null, null, arrayList, arrayList);
		//----------SET/GET egiteko objetuak----------//
		
		
		//----------Objektu predefinituta----------//
		LocalDate data = LocalDate.of(2024, 1, 1);
		LocalTime time = LocalTime.of(12, 0, 0);

		Bezeroa[] bezeroArray = new Bezeroa[0];
		bezeroArray[0] = bezero;
		ArrayList<Pelikula> pelikulaList = new ArrayList<>();
		pelikulaList.add(pelikula);
		ArrayList<Saioa> saioList = new ArrayList<>();
		saioList.add(saio);
		Saioa[] saioArray = new Saioa[0];
		saioArray[0] = saio;
		ArrayList<Aretoa> aretoList = new ArrayList<>();
		aretoList.add(areto);
		
		bezero = new Bezeroa("123456789M", "Mikelon", "Rodriguez", "Mikelodeon", "Mikel123", 123456789, "Emakumea");
		pelikula = new Pelikula("Cars", "Aventura", 169);
		erosketa = new Erosketak(bezeroArray, data);
		karteldegi = new Karteldegia(pelikulaList);
		saio = new Saioa(time, data);
		areto = new Aretoa("Areto 1", saioList);
		sarrera = new Sarrera(saioArray, data, 20, "Aventura");
		zinema = new Zinema("Elorrieta", "Agirre Lehendakari", aretoList, saioList);
		
		//----------Objektu predefinituta----------//
	}
	//--------------------Objektuak--------------------//
	
	
	//--------------------Set/Get--------------------//
	@Test
	public void aretoKonstruktoreTesta_ONDO() {
		ArrayList<Saioa> arrayList = new ArrayList<>();
		Saioa saio1 = new Saioa();
		arrayList.add("Saioa");
		
		aretoFroga.setIzena("Areto 1");
		aretoFroga.setSaioList(arrayList);
		
		assertEquals("Areto 1", aretoFroga.getIzena());
		;
	}

	@Test
	public void BezeroKonstruktoreTesta_ONDO() {
		bezeroFroga.setIdBezero(1);
		bezeroFroga.setNAN("123456789A");
		bezeroFroga.setIzena("Maria");
		bezeroFroga.setAbizena("Almoran");
		bezeroFroga.setErabiltzailea("MariaAlmo");
		bezeroFroga.setPasahitza("12345");
		bezeroFroga.setSexua("Emakumea");
		bezeroFroga.setTxartela(112233);

		assertEquals(1, bezeroFroga.getIdBezero());
		assertEquals("123456789A", bezeroFroga.getNAN());
		assertEquals("Maria", bezeroFroga.getIzena());
		assertEquals("Almoran", bezeroFroga.getAbizena());
		assertEquals("MariaAlmo", bezeroFroga.getErabiltzailea());
		assertEquals("12345", bezeroFroga.getPasahitza());
		assertEquals("Emakumea", bezeroFroga.getSexua());
		assertEquals(112233, bezeroFroga.getTxartela());
	}
	
	@Test
	public void ErosketakKonstruktoreTesta_ONDO() {
		LocalDate dataFroga = LocalDate.of(2024, 1, 1);
		
		erosketaFroga.setIdErosketa(1);
		erosketaFroga.setKant(1);
		erosketaFroga.setData(dataFroga);
		erosketaFroga.setDeskontua(1);
		erosketaFroga.setDirutotala(1);

		assertEquals(erosketaFroga.getIdErosketa(),1);
		assertEquals(erosketaFroga.getKant(),1);
		assertEquals(erosketaFroga.getData(),dataFroga);
		assertEquals(erosketaFroga.getDeskontua(),1.0,1);
		assertEquals(erosketaFroga.getDirutotala(),1.0,1);
	}

	@Test
	public void pelikulaKonstruktoreTesta_ONDO() {
		pelikulaFroga.setIdPelikula(1);
		pelikulaFroga.setIzenaFilma("CARS");
		pelikulaFroga.setIraupena(60);
		pelikulaFroga.setGeneroa("Komedia");

		assertEquals(1, pelikulaFroga.getIdPelikula());
		assertEquals("CARS", pelikulaFroga.getIzenaFilma());
		assertEquals(60, pelikulaFroga.getIraupena());
		assertEquals("Komedia", pelikulaFroga.getGeneroa());
	}
	
	@Test
	public void saioaKonstruktoreTesta_ONDO() {
		LocalDate dataFroga = LocalDate.of(2024, 1, 1);
		LocalTime orduFroga = LocalTime.of(15, 0, 0);
		
		saioFroga.setIdSaioa(1);
		saioFroga.setOrdua(orduFroga);
		saioFroga.setEguna(dataFroga);
		
		assertEquals(saioFroga.getIdSaioa(),1);
		assertEquals(saioFroga.getOrdua(),orduFroga);
		assertEquals(saioFroga.getEguna(),dataFroga);
	}

	@Test
	public void sarreraKonstruktoreTesta_ONDO() {
		LocalDate dataFroga = LocalDate.of(2024, 1, 1);
		
		sarreraFroga.setIdSarrera(1);
		sarreraFroga.setData(dataFroga);
		sarreraFroga.setMota("Gaztea");
		sarreraFroga.setPrezioa(6.95);

		assertEquals(1, sarreraFroga.getIdSarrera());
		assertEquals(dataFroga, sarreraFroga.getData());
		assertEquals("Gaztea", sarreraFroga.getMota());
		assertEquals(6.95, sarreraFroga.getPrezioa(), 0.001);
	}

	@Test
	public void zinemaKonstruktoreTesta_ONDO() {
		ArrayList<Integer> kopuru = new ArrayList<>(Arrays.asList(1, 2, 3));
		
		zinemaFroga.setIdZinema(1);
	    zinemaFroga.setAretoList(kopuru);
	    zinemaFroga.setIzena("Elorrieta Zinema");
	    zinemaFroga.setHelbidea("Bilbao, Calle San Jose");
	    zinemaFroga.setNIF("122456");
	    
	    assertEquals(1, zinemaFroga.getIdZinema());
	    assertEquals(kopuru, zinemaFroga.getAretoList());
	    assertEquals("Elorrieta Zinema", zinemaFroga.getIzena());
	    assertEquals("Bilbao, Calle San Jose", zinemaFroga.getHelbidea());
	    assertEquals("122456", zinemaFroga.getNIF());
	    
	}
	//--------------------Set/Get--------------------//
	
	
	//--------------------toString--------------------//
	@Test
	public void aretoaToStringTest() {
		aretoFroga.setIzena("Talde4");
		aretoFroga.setIdAreto(1);
		
		assertEquals(aretoFroga.toString(), "Aretoa [idAreto=1, izena=Talde4]");
	}
	
	@Test
	public void bezeroaToStringTest() {
		bezeroFroga.setIdBezero(1);
		bezeroFroga.setNAN("NAN");
		bezeroFroga.setIzena("Izena");
		bezeroFroga.setAbizena("Abizena");
		bezeroFroga.setErabiltzailea("Erabiltzailea");
		bezeroFroga.setPasahitza("Pasahitza");
		bezeroFroga.setTxartela(1);
		bezeroFroga.setSexua("Sexua");
		assertEquals(bezeroFroga.toString(), "Bezeroa [idBezero=1, NAN=NAN, izena=Izena, abizena=Abizena, erabiltzailea=Erabiltzailea, pasahitza=Pasahitza, txartela=1, sexua=Sexua]");
	}
	
	@Test
	public void erosketakToStringTest() {
		LocalDate dataFroga = LocalDate.of(2024, 1, 1);
		
		erosketaFroga.setIdErosketa(1);
		erosketaFroga.setKant(1);
		erosketaFroga.setData(dataFroga);
		erosketaFroga.setDeskontua(1);
		erosketaFroga.setDirutotala(1);
		assertEquals(erosketaFroga.toString(), "Erosketak [idErosketa=1, kant=1, data=" + dataFroga +", deskontua=1.0, dirutotala=1.0]");
	}
	
	@Test
	public void pelikulaToStringTest() {
		pelikulaFroga.setIdPelikula(1);
		pelikulaFroga.setIraupena(1);
		pelikulaFroga.setIzenaFilma("Izena");
		pelikulaFroga.setGeneroa("Generoa");
		assertEquals(pelikulaFroga.toString(), "Pelikula [idPelikula=1, iraupena=1, izenaFilma=Izena, generoa=Generoa]");		
	}
	
	@Test
	public void saioaToStringTest() {
		LocalDate dataFroga = LocalDate.of(2024, 1, 1);
		LocalTime orduFroga = LocalTime.of(15, 0, 0);
		
		saioFroga.setIdSaioa(1);
		saioFroga.setOrdua(orduFroga);
		saioFroga.setEguna(dataFroga);
		
		assertEquals(saioFroga.toString(), "Saioa [idSaioa=1, ordua=" + orduFroga + ", eguna=" + dataFroga + "]");		
	}
	
	@Test
	public void sarreraToStringTest() {
		LocalDate dataFroga = LocalDate.of(2024, 1, 1);
		
		sarreraFroga.setIdSarrera(1);
		sarreraFroga.setData(dataFroga);
		sarreraFroga.setPrezioa(1);
		sarreraFroga.setMota("Mota");
		
		assertEquals(sarreraFroga.toString(), "Sarrera [idSarrera=1, data=" + dataFroga + ", prezioa=1.0, mota=Mota]");		
	}
	
	@Test
	public void zinemaToStringTest() {
		ArrayList<Integer> kopuru = new ArrayList<>(Arrays.asList(1));
		
		zinemaFroga.setIdZinema(1);
		zinemaFroga.setIzena("Izena");
		zinemaFroga.setHelbidea("Helbidea");
		zinemaFroga.setAretoList(kopuru);
		zinemaFroga.setNIF("nif");
		
		assertEquals(zinemaFroga.toString(), "Zinema [idZinema=1, izena=Izena, helbidea=Helbidea, aretoKop=[1], NIF=nif]");		
	}
	//--------------------toString--------------------//
	
	
	//--------------------Equals--------------------//
	@Test
    public void testHashCodeAreto() {
        Aretoa aretoa1 = new Aretoa("Sala A");
        Aretoa aretoa2 = new Aretoa("Sala A");

        assertEquals(aretoa1.hashCode(), aretoa2.hashCode());
    }

    @Test
    public void testEqualsAreto() {
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
        Sarrera sarrera3 = new Sarrera(LocalDate.of(2024, 2, 21), 20.0, "VIP");

        assertTrue(sarrera1.equals(sarrera2));
        assertFalse(sarrera1.equals(sarrera3));
    }
    
    @Test
    public void testHashCode() {
        Zinema zinema1 = new Zinema("Zinema A", "Calle A, 123", "12345678A");
        Zinema zinema2 = new Zinema("Zinema A", "Calle A, 123", "12345678A");

        assertEquals(zinema1.hashCode(), zinema2.hashCode());
    }

    @Test
    public void testEquals() {
        Zinema zinema1 = new Zinema("Zinema A", "Calle A, 123", "12345678A");
        Zinema zinema2 = new Zinema("Zinema A", "Calle A, 123", "12345678A");
        Zinema zinema3 = new Zinema("Zinema B", "Calle B, 456", "87654321B");

        assertTrue(zinema1.equals(zinema2));
        assertFalse(zinema1.equals(zinema3));
    }
    //--------------------Equals--------------------//
	
}
