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

import modeloa.dao.ErosketakDao;
import modeloa.db.Konexioa;
import modeloa.db.Kontzultak;
import modeloa.objetuak.Erosketak;

public class ErosketaDaoTest {

	private ErosketakDao erosketaDao;
	private List<Erosketak> erosketakTest;
	
	 public List<Erosketak> lortuErosketakTEST() {
		 erosketakTest = new ArrayList<>();

	        try {
	            Konexioa.konexioa(); 

	            PreparedStatement preparedStatement = Konexioa.konektatua.prepareStatement(Kontzultak.erosketak);
	            ResultSet resultSet = preparedStatement.executeQuery();

	            while (resultSet.next()) {
	                int idErosketak = resultSet.getInt("idErosketak");
	                LocalDate data = resultSet.getDate("data").toLocalDate();
	                int sarreraKant = resultSet.getInt("sarreraKant");
	                double deskontua = resultSet.getDouble("deskontua");
	                double dirutotala = resultSet.getDouble("dirutotala");
	                String mota = resultSet.getString("mota");

	                Erosketak erosketa = new Erosketak(idErosketak, data);
	                erosketa.setSarreraKant(sarreraKant);
	                erosketa.setDeskontua(deskontua);
	                erosketa.setDirutotala(dirutotala);
	                erosketa.setMota(mota);

	                erosketakTest.add(erosketa);
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            Konexioa.konexioaExit(); 
	        }

	        return erosketakTest;
	    }
	 
	 @Before
		public void setUp() {
		 erosketaDao = new ErosketakDao();
		}

		@Test
		public void testLortuErosketak() {
		    List<Erosketak> erosketak = erosketaDao.lortuErosketak();
		    
		    List<Erosketak> erosketakTest = lortuErosketakTEST();
		    
		    assertNotNull(erosketak);
		    assertFalse(erosketak.isEmpty());

		    assertEquals(erosketakTest, erosketak);
		}

}
