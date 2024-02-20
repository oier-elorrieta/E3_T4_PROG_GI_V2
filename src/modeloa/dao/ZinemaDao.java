package modeloa.dao;

import modeloa.db.Konexioa;
import modeloa.db.Kontzultak;
import modeloa.objetuak.Aretoa;
import modeloa.objetuak.Saioa;
import modeloa.objetuak.Zinema;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ZinemaDao {

    public List<Zinema> lortuZinemak() {
        
    	AretoaDao aretoaDao = new AretoaDao();
    	SaioaDao saioaDao = new SaioaDao();
    	
    	List<Zinema> zinemak = new ArrayList<>();

        try {
            Konexioa.konexioa(); // Asegúrate de que la conexión está abierta

            PreparedStatement preparedStatement = Konexioa.konektatua.prepareStatement(Kontzultak.zinema);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String idZinema = resultSet.getString("idZinema");
                String izena = resultSet.getString("izena");
                String helbidea = resultSet.getString("helbidea");
                
                List<Aretoa> aretoList = aretoaDao.lortuAreatoak(idZinema);
                List<Saioa> saioaList = saioaDao.lortuSaioak(idZinema);
                
                Zinema zinema = new Zinema(idZinema, izena, helbidea, aretoList, saioaList);
                zinemak.add(zinema);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Konexioa.konexioaExit(); // Asegúrate de cerrar la conexión después de usarla
        }

        return zinemak;
    }
}
