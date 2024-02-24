package test.DaoTest;

import static org.junit.Assert.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import modeloa.dao.AretoaDao;
import modeloa.dao.SaioaDao;
import modeloa.dao.ZinemaDao;
import modeloa.db.Konexioa;
import modeloa.db.Kontsultak;
import modeloa.objetuak.Aretoa;
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
            Konexioa.konexioa(); // Asegúrate de que la conexión está abierta

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
                System.out.println(aretoList.size());
           
            }
           
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Konexioa.konexioaExit(); // Asegúrate de cerrar la conexión después de usarla
        }

        return zinemak;
    }
}
