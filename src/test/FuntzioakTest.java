package test;

import static org.junit.Assert.*;

import java.awt.Component;
import java.time.LocalTime;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.junit.BeforeClass;
import org.junit.Test;

import kontrolatzaile.funtzioak.FuntzioErabilgarriak;
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
        assertEquals(2, saioLortua.getIdSaioa());
    }
	

	
}