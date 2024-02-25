package test.DaoTest;

import static org.junit.Assert.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import modeloa.dao.BezeroaDao;
import modeloa.db.Konexioa;
import modeloa.db.Kontsultak;
import modeloa.objetuak.Bezeroa;

public class BezeroDaoTest {
	
	private BezeroaDao bezeroaDao;
	private List<Bezeroa> bezeroaTest;
	
	 public List<Bezeroa> lortuBezeroakTEST() {
		   bezeroaTest = new ArrayList<>();

	        Konexioa.konexioa(); // Asegúrate de tener esta llamada para establecer la conexión

	        try (PreparedStatement preparedStatement = Konexioa.konektatua.prepareStatement(Kontsultak.bezeroa);
	             ResultSet resultSet = preparedStatement.executeQuery()) {

	            while (resultSet.next()) {
	            	String idBezeroa = resultSet.getString("idBezero");
	                String NAN = resultSet.getString("NAN");
	                String izena = resultSet.getString("izena");
	                String abizena = resultSet.getString("abizena");
	                String erabiltzailea = resultSet.getString("erabiltzailea");
	                String pasahitza = resultSet.getString("pasahitza");
	                int txartela = resultSet.getInt("txartela");
	                String sexua = resultSet.getString("sexua");

	                Bezeroa bezeroa = new Bezeroa(idBezeroa, NAN, izena, abizena, erabiltzailea, pasahitza, txartela, sexua);
	                bezeroaTest.add(bezeroa);
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	            // Maneja la excepción según tus necesidades
	        } finally {
	            Konexioa.konexioaExit(); // Asegúrate de cerrar la conexión
	        }
			return bezeroaTest;
	        
	    }
	 
	 @Before
		public void setUp() {
		    // Prestatzen da proba bakoitzea exekutatzeko, klasearen instantzia sortzen da.
		    bezeroaDao = new BezeroaDao();
		}

		@Test
		public void testLortuAreatoak() {
		    List<Bezeroa> bezeroa = bezeroaDao.lortuBezeroak();
		    
		    List<Bezeroa> bezeroaTest = lortuBezeroakTEST();
		    
		    assertNotNull(bezeroa);
		    assertFalse(bezeroa.isEmpty());

		    assertEquals(bezeroaTest, bezeroa);
		}

}
