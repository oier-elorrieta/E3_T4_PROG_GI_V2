package test;

import static org.junit.Assert.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import modeloa.dao.PelikulaDao;
import modeloa.db.Konexioa;
import modeloa.db.Kontzultak;
import modeloa.objetuak.Pelikula;

public class PelikulaDAOTEST {

	private PelikulaDao pelikulaDao;
	private  List<Pelikula> pelikulakTest;


	 public List<Pelikula> lortuPelikulakTEST() {
	        pelikulakTest = new ArrayList<>();

	        try {
	            Konexioa.konexioa(); 

	            PreparedStatement preparedStatement = Konexioa.konektatua.prepareStatement(Kontzultak.filma);
	            ResultSet resultSet = preparedStatement.executeQuery();

	            while (resultSet.next()) {
	                int idFilma = resultSet.getInt("idFilma");
	                String izena = resultSet.getString("izena");
	                String generoa = resultSet.getString("generoa");
	                int iraupena = resultSet.getInt("iraupena");

	                Pelikula pelikula = new Pelikula(idFilma, izena, generoa, iraupena);
	                pelikulakTest.add(pelikula);
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            Konexioa.konexioaExit(); 
	        }

	        return pelikulakTest;
	    }


	@Before
	public void setUp() {
	    pelikulaDao = new PelikulaDao();
	}

	@Test
	public void testLortuPelikulak() {
	    List<Pelikula> pelikulak = pelikulaDao.lortuPelikulak(); 
	    
	    List<Pelikula> pelikulaTest = lortuPelikulakTEST();
	    
	    assertNotNull(pelikulak);
	    assertFalse(pelikulak.isEmpty());

	    assertEquals(pelikulaTest, pelikulak);
	}

}
