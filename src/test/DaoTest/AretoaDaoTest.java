package test.DaoTest;

import static org.junit.Assert.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import modeloa.dao.AretoaDao;
import modeloa.db.Konexioa;
import modeloa.objetuak.Aretoa;

public class AretoaDaoTest {

	// DAO ALDAGAIAK
	private AretoaDao aretoaDao;
	private List<Aretoa> aretoakTest;

	public List<Aretoa> lortuAretoakTEST() {
	    aretoakTest = new ArrayList<>();

	    try {
	        Konexioa.konexioa(); 
	        PreparedStatement preparedStatement = Konexioa.konektatua.prepareStatement("SELECT idAretoa, idZinema, izena FROM ARETOA where idZinema = 'Z01'");
	        ResultSet resultSet = preparedStatement.executeQuery();

	        while (resultSet.next()) {
	            String idAretoa = resultSet.getString("idAretoa");
	            String idZinema = resultSet.getString("idZinema");
	            String izena = resultSet.getString("izena");

	            Aretoa aretoa = new Aretoa(idAretoa, idZinema, izena);
	            aretoakTest.add(aretoa);
	            
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        Konexioa.konexioaExit();
	    }

	    return aretoakTest; 
	}


	@Before
	public void setUp() {
	    // Prestatzen da proba bakoitzea exekutatzeko, klasearen instantzia sortzen da.
	    aretoaDao = new AretoaDao();
	}

	@Test
	public void testLortuAreatoak() {
	    // AretoaDao klasearen bidez Areatoak lortzen dira eta listan gorde.
	    List<Aretoa> aretoak = aretoaDao.lortuAretoak("Z01");
	    
	    // lortuAreatoakTEST() metodoa deitu eta Areatoak lortzen dira eta listan gorde.
	    List<Aretoa> aretoakTest = lortuAretoakTEST();
	    
	    // Areatoak ez direla nuluek eta hutsik ez daudela egiaztatu.
	    assertNotNull(aretoak);
	    assertFalse(aretoak.isEmpty());

	    // lortuAreatoakTEST() metodoaren emaitzak eta aretoaDao-rena berdina direla egiaztatu.
	    assertEquals(aretoakTest, aretoak);
	}

}
