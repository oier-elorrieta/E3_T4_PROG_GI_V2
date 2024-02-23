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

import kontrolatzaile.funtzioak.Funtzioak;
import modeloa.dao.PelikulaDao;
import modeloa.dao.SaioaDao;
import modeloa.db.Konexioa;
import modeloa.objetuak.Aretoa;
import modeloa.objetuak.Pelikula;
import modeloa.objetuak.Saioa;

public class SaioaDaoTest {
	
	private SaioaDao saioaDao;
	private List<Saioa> saioaTest;

	public List<Saioa> lortuSaioakTEST(String ID, List<Aretoa> aretoList) {
        List<Saioa> saioak = new ArrayList<>();
        Pelikula peli = null;
        Aretoa areto = null;

        try {
            Konexioa.konexioa(); // Asegúrate de que la conexión está abierta

            String kontzulta = "SELECT idSaioa, Ordua, Eguna, idFilma, idZinema, idAretoa FROM SAIOA WHERE idZinema = 'Z01'";
            PreparedStatement preparedStatement = Konexioa.konektatua.prepareStatement(kontzulta);
            preparedStatement.setString(1, ID); // Establece el ID del cine en la consulta

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int idSaioa = resultSet.getInt("idSaioa");
                LocalTime ordua = resultSet.getTime("Ordua").toLocalTime(); // Corregido el nombre de la columna
                LocalDate eguna = resultSet.getDate("Eguna").toLocalDate(); // Corregido el nombre de la columna
                int idPelikula = resultSet.getInt("idFilma");
                String idAretoa = resultSet.getString("idAretoa");

                // Busca la película en la lista de películas
                for (Pelikula pelikula : Funtzioak.pelikulakList) {
                    if (pelikula.getIdPelikula() == idPelikula) {
                        peli = pelikula;
                        break;
                    }
                }

                // Busca el aretoa en la lista de aretoak que se pasa como argumento
                for (Aretoa aretoa : aretoList) {
                    if (aretoa.getIdAretoa().equals(idAretoa)) {
                        areto = aretoa;
                        break;
                    }
                }

                Saioa saioa = new Saioa(idSaioa, areto, ordua, eguna, peli);
                saioak.add(saioa);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Konexioa.konexioaExit(); // Asegúrate de cerrar la conexión después de usarla
        }

        return saioak;
    }
	
	@Before
	public void setUp() {
	    saioaDao = new SaioaDao();
	}

	@Test
	public void testLortuSaioak() {
	    List<Saioa> saioak = saioaDao.lortuSaioak("Z01", Funtzioak.areatoakList); 
	    
	    List<Saioa> SaioaTest = lortuSaioakTEST("Z01", Funtzioak.areatoakList);
	    
	    assertNotNull(saioak);
	    assertFalse(saioak.isEmpty());

	    assertEquals(saioaTest, saioak);
	}
	
}
