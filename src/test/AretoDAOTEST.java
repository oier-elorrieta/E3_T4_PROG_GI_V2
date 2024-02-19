package test;

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
import modeloa.db.Kontzultak;
import modeloa.objetuak.Aretoa;

public class AretoDAOTEST {
	
	
	private static ArrayList<Aretoa> aretoakTest = new ArrayList<>();

	public class AretoDAOTest {
	    private AretoaDao aretoaDao;

	    @Before
	    public void setUp() {
	        aretoaDao = new AretoaDao();
	    }

	    @Test
	    public void testLortuAreatoak() {
	        List<Aretoa> aretoak = aretoaDao.lortuAreatoak();
	        
	        assertNotNull(aretoak);
	        assertFalse(aretoak.isEmpty());

	        
	        assertEquals(aretoak, AretoaDao.aretoak);
	    }
	}
	
}
