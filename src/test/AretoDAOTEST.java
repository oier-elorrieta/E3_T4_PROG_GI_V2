package test;

import static org.junit.Assert.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import modeloa.dao.AretoaDao;
import modeloa.db.Konexioa;
import modeloa.db.Kontzultak;
import modeloa.objetuak.Aretoa;

public class AretoDAOTEST {
	
	private static ArrayList<Aretoa> aretoak = new ArrayList<>();

	 public static void lortuAreatoak() {
	        try {
	            Konexioa.konexioa();

	            PreparedStatement preparedStatement = Konexioa.konektatua.prepareStatement(Kontzultak.aretoa);
	            ResultSet resultSet = preparedStatement.executeQuery();

	            while (resultSet.next()) {
	                String idAretoa = resultSet.getString("idAretoa");
	                String izena = resultSet.getString("izena");

	                Aretoa aretoa = new Aretoa(idAretoa, izena);
	                aretoak.add(aretoa);
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            Konexioa.konexioaExit();
	        }

	    }
	
	 @Test
		public void test() {
			assertEquals(aretoak, AretoaDao.aretoak);
	 	}
	
}
