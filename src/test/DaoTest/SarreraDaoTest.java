package test.DaoTest;

import static org.junit.Assert.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import modeloa.dao.SarreraDao;
import modeloa.db.Konexioa;
import modeloa.db.Kontsultak;
import modeloa.objetuak.Sarrera;

public class SarreraDaoTest {

	private SarreraDao sarreraDao;
	private  List<Sarrera> sarrerakTest;


	public List<Sarrera> lortuSarrerakTEST() {
        sarrerakTest = new ArrayList<>();

        try {
            Konexioa.konexioa(); 

            PreparedStatement preparedStatement = Konexioa.konektatua.prepareStatement(Kontsultak.sarrera);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int idSarrera = resultSet.getInt("idSarrera");
                int sarreraKant = resultSet.getInt("sarrera_kant");
                double prezioa = resultSet.getDouble("prezioa");
                String mota = resultSet.getString("mota");

                Sarrera sarrera = new Sarrera(idSarrera, null, LocalDate.now(), prezioa, mota);
                sarrera.setSarreraKant(sarreraKant);
                sarrerakTest.add(sarrera);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Konexioa.konexioaExit(); 
        }

        return sarrerakTest;
    }


	@Before
	public void setUp() {
		sarreraDao = new SarreraDao();
	}

	@Test
	public void testLortuPelikulak() {
	    List<Sarrera> sarrerak = sarreraDao.lortuSarrerak(); 
	    
	    List<Sarrera> sarrerakTest = lortuSarrerakTEST();
	    
	    assertNotNull(sarrerak);
	    assertFalse(sarrerak.isEmpty());

	    assertEquals(sarrerakTest, sarrerak);
	}

}
