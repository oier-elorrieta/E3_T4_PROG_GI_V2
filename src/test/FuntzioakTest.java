package test;

import static org.junit.Assert.*;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.junit.BeforeClass;
import org.junit.Test;

import bista.PelikulaBista;
import kontrolatzaile.funtzioak.FuntzioErabilgarriak;
import modeloa.dao.BezeroaDao;
import modeloa.objetuak.Aretoa;
import modeloa.objetuak.Bezeroa;

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


}