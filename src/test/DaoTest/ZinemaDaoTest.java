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
import modeloa.dao.BezeroaDao;
import modeloa.dao.SaioaDao;
import modeloa.dao.ZinemaDao;
import modeloa.db.Konexioa;
import modeloa.db.Kontsultak;
import modeloa.objetuak.Aretoa;
import modeloa.objetuak.Bezeroa;
import modeloa.objetuak.Saioa;
import modeloa.objetuak.Zinema;

public class ZinemaDaoTest {
	
	private ZinemaDao zinemaDao;
	private List<Zinema> zinemaTest;

public List<Zinema> lortuZinemakTEST() {
        zinemaTest = new ArrayList();
        
    	AretoaDao aretoaDao = new AretoaDao();
    	SaioaDao saioaDao = new SaioaDao();
    	
    	List<Zinema> zinemak = new ArrayList<>();
    	List<Aretoa> aretoList = new ArrayList<>();


        try {
            Konexioa.konexioa(); 

            PreparedStatement preparedStatement = Konexioa.konektatua.prepareStatement(Kontsultak.zinema);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String idZinema = resultSet.getString("idZinema");
                String izena = resultSet.getString("izena");
                String helbidea = resultSet.getString("helbidea");
                
                aretoList = aretoaDao.lortuAretoak(idZinema);
                List<Saioa> saioaList = saioaDao.lortuSaioak(idZinema,aretoList);
                
                Zinema zinema = new Zinema(idZinema, izena, helbidea, aretoList, saioaList);
                zinemak.add(zinema); 
           
            }
           
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Konexioa.konexioaExit(); 
        }

        return zinemak;
    }

	@Before
	public void setUp() {
		zinemaDao = new ZinemaDao();
	}

	@Test
	public void testLortuAreatoak() {
	    List<Zinema> zinema = zinemaDao.lortuZinemak();
	    
	    List<Zinema> zinemaTest = lortuZinemakTEST();
	    
	    assertNotNull(zinema);
	    assertFalse(zinemaTest.isEmpty());

	    assertEquals(zinemaTest, zinema);
	}
}
