package test.DaoTest;

import static org.junit.Assert.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import modeloa.dao.ZinemaAretoFilmaDAO;
import modeloa.db.Konexioa;
import modeloa.db.Kontzultak;
import modeloa.objetuak.Pelikula;

public class ZinemaAretoFilmaDaoTest {

	private ZinemaAretoFilmaDAO zinemaAretoFilma;
	private List<Pelikula> saioPelikulakTest;


	public List<Pelikula> lortuFilmakTEST() {
        saioPelikulakTest = new ArrayList<>();

        try {
            Konexioa.konexioa();

            PreparedStatement preparedStatement = Konexioa.konektatua.prepareStatement(Kontzultak.saioakArgitaratu);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int idFilma = resultSet.getInt("idFilma");
                String izena = resultSet.getString("izena");
                String generoa = resultSet.getString("generoa");
                int iraupena = resultSet.getInt("iraupena");

                Pelikula pelikula = new Pelikula(idFilma, izena, generoa, iraupena);
                saioPelikulakTest.add(pelikula);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Konexioa.konexioaExit(); 
        }

        return saioPelikulakTest;
    }


	@Before
	public void setUp() {
		zinemaAretoFilma = new ZinemaAretoFilmaDAO();
	}

	@Test
	public void testLortuPelikulak() {
	    List<Pelikula> zinemeAretoFilma = zinemaAretoFilma.lortuFilmak(); 
	    
	    List<Pelikula> zinemeAretoFilmaTest = lortuFilmakTEST();
	    
	    assertNotNull(zinemeAretoFilma);
	    assertFalse(zinemeAretoFilma.isEmpty());

	    assertEquals(zinemeAretoFilmaTest, zinemeAretoFilma);
	}

}
