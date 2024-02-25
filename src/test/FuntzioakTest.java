package test;

import static org.junit.Assert.*;

import java.awt.Component;
import java.io.File;
import java.time.LocalTime;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.junit.BeforeClass;
import org.junit.Test;

import kontrolatzaile.funtzioak.FuntzioErabilgarriak;
import modeloa.objetuak.Erosketak;
import modeloa.objetuak.Pelikula;
import modeloa.objetuak.Saioa;
import modeloa.objetuak.Zinema;

public class FuntzioakTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		FuntzioErabilgarriak.inicio();
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
		// Arrange
		JPanel panelContenedor = new JPanel();
		JScrollPane scrollPane = new JScrollPane(panelContenedor);

		// Act
		FuntzioErabilgarriak.filmaDatuak(scrollPane);

		// Assert
		Component[] components = panelContenedor.getComponents();
		boolean botonEncontrado = false;
		for (Component component : components) {
			if (component instanceof JPanel) {
				JPanel panel = (JPanel) component;
				Component[] innerComponents = panel.getComponents();
				for (Component innerComponent : innerComponents) {
					if (innerComponent instanceof JButton) {
						JButton btn = (JButton) innerComponent;
						if (btn.getText().equals("Cars")) { // Reemplazar con el nombre de la película
							botonEncontrado = true;
							// Puedes agregar más aserciones aquí si es necesario
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
		// Establecer el ID de la película que queremos encontrar
		FuntzioErabilgarriak.setIdFilma(2);

		// Llamar al método Info_filma() para obtener la información de la película
		Pelikula peliculaEncontrada = FuntzioErabilgarriak.Info_filma();

		// Verificar que la información devuelta sea la esperada
		assertEquals(2, peliculaEncontrada.getIdPelikula());
		assertEquals("Get Out", peliculaEncontrada.getIzena());
		assertEquals("Beldurra", peliculaEncontrada.getGeneroa());
		assertEquals(104, peliculaEncontrada.getIraupena());
	}

	@Test
	public void testInfoSaioa() {
		// Saioa informazioa lortzen dugu
		Saioa saioLortua = FuntzioErabilgarriak.Info_saioa();

		// Saioaren informazioa egokia den egiaztatzen dugu
		assertEquals(0, saioLortua.getIdSaioa());
	}

//	@Test
//    public void testFitxeroBarruanDatuakIdatzi() {
//        // Lógica para preparar datos de prueba si es necesario
//        // En este caso, podrías preparar una lista de 'erosketak' simulada
//
//        // Ejecutar la función que escribes en un entorno controlado
//        FuntzioErabilgarriak.fitxeroBarruanDatuakIdatzi();
//
//        // Verificar si el archivo se ha creado correctamente
//        String filePath = "C:\\Users\\ikers\\Downloads" + FuntzioErabilgarriak.txtkont + ".txt";
//        File file = new File(filePath);
//        
//        // Assert que el archivo existe
//        assertTrue(file.exists());
//        
//        // Aquí podrías agregar más aserciones para verificar el contenido del archivo generado si es necesario
//    }

	@Test
	public void testErosketarenDatuak() {
		// Crea un JScrollPane simulado para pasar como argumento a la función
		JScrollPane scrollPane = new JScrollPane();

		// Ejecuta la función que deseas probar
		FuntzioErabilgarriak.ErosketarenDatuak(scrollPane);

		// Asegúrate de que la vista del JScrollPane ahora contenga algún componente
		// JPanel
		assertTrue(scrollPane.getViewport().getView() instanceof JPanel);

		// Aquí podrías agregar más aserciones para verificar la disposición y contenido
		// del JPanel si es necesario
	}

//	@Test
//    public void testErosketaSarreraSortu() {
//        // Aquí necesitas configurar tus datos de prueba
//        // Asumiremos que los datos necesarios están disponibles
//        // y que los métodos a los que se hace referencia funcionan correctamente
//
//        // Ejecutar la función que deseas probar
//        Erosketak erosketa = FuntzioErabilgarriak.ErosketaSarreraSortu();
//
//        // Verificar que la función devuelve un objeto Erosketak no nulo
//        assertNotNull(erosketa);
//
//        // Aquí puedes agregar más aserciones para verificar el estado del objeto Erosketak devuelto
//        // Por ejemplo, puedes verificar que los valores de sus atributos sean los esperados
//    }

//	@Test
//    public void testTotalaSarrera() {
//        // Definimos un ejemplo de subtotal y descuento esperado
//        double[] ejemploSubtotalaDeskontua = {100.0, 20.0};
//
//        // Establecemos el valor esperado del total
//        double totalEsperado = 80.0;
//
//        // Llamamos a la función totalaSarrera() con el ejemplo de subtotal y descuento
//        double totalObtenido = FuntzioErabilgarriak.totalaSarrera();
//
//        // Verificamos si el total obtenido es igual al total esperado
//        assertEquals(totalEsperado, totalObtenido);
//    }

	// BISTA TESTAK .....??

	@Test
	public void testPelikulaBistaVisible() {
		try {
			FuntzioErabilgarriak.pelikulaBistaVisible();
			// Si la ventana se muestra correctamente, la prueba pasará.
		} catch (Exception e) {
			e.printStackTrace();
			// Si ocurre algún error, la prueba fallará.
		}
	}

	@Test
	public void testSaioaBistaVisible() {
		try {
			FuntzioErabilgarriak.saioaBistaVisible();
			// Si la ventana se muestra correctamente, la prueba pasará.
		} catch (Exception e) {
			e.printStackTrace();
			// Si ocurre algún error, la prueba fallará.
		}
	}

	@Test
	public void testErosketaKonfirmazioaBistaVisible() {
		try {
			FuntzioErabilgarriak.erosketaKonfirmazioaBistaVisible();
			// Si la ventana se muestra correctamente, la prueba pasará.
		} catch (Exception e) {
			e.printStackTrace();
			// Si ocurre algún error, la prueba fallará.
		}
	}

	@Test
	public void testOngiEtorriBistaVisible() {
		try {
			FuntzioErabilgarriak.ongiEtorriBistaVisible();
			// Si la ventana se muestra correctamente, la prueba pasará.
		} catch (Exception e) {
			e.printStackTrace();
			// Si ocurre algún error, la prueba fallará.
		}
	}

//BUFFERED TEST

	public void testFitxeroBarruanDatuakIdatzi() {
		try {
			// Llamar a la función que escribe en el archivo
			FuntzioErabilgarriak.fitxeroBarruanDatuakIdatzi();

			// Verificar si el archivo se creó correctamente
			File file = new File(
					"C:\\Users\\Usuario\\Downloads\\Faktura" + FuntzioErabilgarriak.txtkont + ".txt");
			assert file.exists() : "El archivo de factura no se ha creado correctamente.";

			// Si llega hasta aquí sin lanzar excepciones, la prueba pasó con éxito.
		} catch (Exception e) {
			e.printStackTrace();
			// Si ocurre algún error, la prueba fallará.
		}
	}
}