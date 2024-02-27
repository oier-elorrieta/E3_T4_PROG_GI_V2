package test.DaoTest;

import static org.junit.Assert.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import kontrolatzaile.funtzioak.FuntzioErabilgarriak;
import modeloa.dao.PelikulaDao;
import modeloa.dao.SaioaDao;
import modeloa.db.Konexioa;
import modeloa.db.Kontsultak;
import modeloa.objetuak.Aretoa;
import modeloa.objetuak.Pelikula;
import modeloa.objetuak.Saioa;

public class SaioaDaoTest {
	
	private SaioaDao saioaDao;
	private List<Saioa> saioaTest;
	private List<Pelikula> pelikulaListTest;
	
	 public List<Saioa> lortuSaioakTEST(String ID, List<Aretoa> aretoList) {
		 	PelikulaDao pelikuladao = new PelikulaDao();
			pelikulaListTest = pelikuladao.lortuPelikulak();

	        saioaTest = new ArrayList<>();
	        Pelikula peli = null;
	        Aretoa areto = null;

	        try {
	            Konexioa.konexioa(); 
	            
	            PreparedStatement preparedStatement = Konexioa.konektatua.prepareStatement(Kontsultak.saioa);
	            preparedStatement.setString(1, ID); 

	            
	            ResultSet resultSet = preparedStatement.executeQuery();

	            while (resultSet.next()) {
	                int idSaioa = resultSet.getInt("idSaioa");
	                LocalTime ordua = resultSet.getTime("Ordua").toLocalTime(); 
	                LocalDate eguna = resultSet.getDate("Eguna").toLocalDate(); 
	                int idPelikula = resultSet.getInt("idFilma");
	                String idAretoa = resultSet.getString("idAretoa");
	 
	                
	                for (Pelikula pelikula : pelikulaListTest) {
	                    if (pelikula.getIdPelikula() == idPelikula) {
	                        peli = pelikula;
	                        break;
	                    }
	                }

	                
	                for (Aretoa aretoa : aretoList) {
	                    if (aretoa.getIdAretoa().equals(idAretoa)) {
	                        areto = aretoa;
	                        break;
	                    }
	                }

	                Saioa saioa = new Saioa(idSaioa, areto, ordua, eguna, peli);
	                saioaTest.add(saioa);
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            Konexioa.konexioaExit(); 
	        }

	        return saioaTest;
	    }
	
	@Before
	public void setUp() {
	    saioaDao = new SaioaDao();
	}


	
}
