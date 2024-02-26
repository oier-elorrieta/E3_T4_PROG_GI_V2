package test;

import static org.junit.Assert.*;

import java.awt.Component;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import kontrolatzaile.funtzioak.FuntzioErabilgarriak;
import modeloa.objetuak.Pelikula;
import modeloa.objetuak.Saioa;
import modeloa.objetuak.Zinema;

public class FuntzioakTest {
	
    private static List<Zinema> zinemakList;
    private static FuntzioErabilgarriak funtzioErabilgarriak;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		FuntzioErabilgarriak.inicio();
	}
	
    @Before
    public void setUp() {
        zinemakList = new ArrayList<>();

        funtzioErabilgarriak = new FuntzioErabilgarriak();
    }

	@Test
	public void loginOKTestT() {

		assertTrue(FuntzioErabilgarriak.loginOK("admin", "admin"));
	}

	@Test
	public void loginOKTestF() {

		assertFalse(FuntzioErabilgarriak.loginOK("admin", "si"));
	}

	@Test
	public void loginTestT() {

		assertTrue(FuntzioErabilgarriak.login("admin", "admin"));
	}

	@Test
	public void loginTestF() {

		assertFalse(FuntzioErabilgarriak.login("admin", "si"));
	}

	@Test
	public void testFilmaDatuak() {
		JPanel panelContenedor = new JPanel();
		JScrollPane scrollPane = new JScrollPane(panelContenedor);

		FuntzioErabilgarriak.filmaDatuak(scrollPane);

		Component[] components = panelContenedor.getComponents();
		boolean botonEncontrado = false;
		for (Component component : components) {
			if (component instanceof JPanel) {
				JPanel panel = (JPanel) component;
				Component[] innerComponents = panel.getComponents();
				for (Component innerComponent : innerComponents) {
					if (innerComponent instanceof JButton) {
						JButton btn = (JButton) innerComponent;
						if (btn.getText().equals("Cars")) { 
							botonEncontrado = true;
							break;
						}
					}
				}
			}
		}
		assertFalse(botonEncontrado);
	}

	@Test
	public void Info_filmaTest() {
		FuntzioErabilgarriak.setIdFilma(2);

		Pelikula peliculaEncontrada = FuntzioErabilgarriak.Info_filma();

		assertEquals(2, peliculaEncontrada.getIdPelikula());
		assertEquals("Get Out", peliculaEncontrada.getIzena());
		assertEquals("Beldurra", peliculaEncontrada.getGeneroa());
		assertEquals(104, peliculaEncontrada.getIraupena());
	}

	@Test
	public void testErosketarenDatuak() {
		JScrollPane scrollPane = new JScrollPane();

		FuntzioErabilgarriak.ErosketarenDatuak(scrollPane);

		assertTrue(scrollPane.getViewport().getView() instanceof JPanel);

	}

	// BISTA TESTAK .....??

	@Test
	public void testPelikulaBistaVisible() {
		try {
			FuntzioErabilgarriak.pelikulaBistaVisible();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testSaioaBistaVisible() {
		try {
			FuntzioErabilgarriak.saioaBistaVisible();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testErosketaKonfirmazioaBistaVisible() {
		try {
			FuntzioErabilgarriak.erosketaKonfirmazioaBistaVisible();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testOngiEtorriBistaVisible() {
		try {
			FuntzioErabilgarriak.ongiEtorriBistaVisible();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//BUFFERED TEST

	public void testFitxeroBarruanDatuakIdatzi() {
		try {
			FuntzioErabilgarriak.fitxeroBarruanDatuakIdatzi();

			File file = new File(
					"C:\\Users\\in1dm3-d\\Faktura" + FuntzioErabilgarriak.txtkont + ".txt");
			assert file.exists() : "El archivo de factura no se ha creado correctamente.";

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

    public static Saioa Info_saioa() {
    	
        Saioa s1 = new Saioa();
        String eguna = FuntzioErabilgarriak.getEguna();
        
        for (Saioa saioa : zinemakList.get(FuntzioErabilgarriak.getIdZinema()).getSaioList()) {
            String getEgunaString = "" + saioa.getEguna();
            if (saioa.getPelikula().getIdPelikula() == FuntzioErabilgarriak.Info_filma().getIdPelikula() && getEgunaString.equals(eguna)) {
                
                s1.setIdSaioa(saioa.getIdSaioa());
                s1.setAretoa(saioa.getAretoa());
                s1.setOrdua(saioa.getOrdua());
                s1.setPelikula(saioa.getPelikula());
                s1.setEguna(LocalDate.parse(FuntzioErabilgarriak.getEguna()));
                
                break;
            }
        }
        return s1;
    }
	
	
}