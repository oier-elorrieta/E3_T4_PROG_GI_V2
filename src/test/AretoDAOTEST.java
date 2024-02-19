package test;

import static org.junit.Assert.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import modeloa.db.Konexioa;
import modeloa.db.Kontzultak;
import modeloa.objetuak.Aretoa;

public class AretoDAOTEST {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	 public ArrayList<Aretoa> lortuAreatoak() {
	    	ArrayList<Aretoa> areatoak = new ArrayList<>();

	        try {
	            Konexioa.konexioa();

	            PreparedStatement preparedStatement = Konexioa.konektatua.prepareStatement(Kontzultak.aretoa);
	            ResultSet resultSet = preparedStatement.executeQuery();

	            while (resultSet.next()) {
	                String idAretoa = resultSet.getString("idAretoa");
	                String izena = resultSet.getString("izena");

	                Aretoa aretoa = new Aretoa(idAretoa, izena);
	                areatoak.add(aretoa);
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            Konexioa.konexioaExit();
	        }

	        return areatoak;
	    }
	
	
}
