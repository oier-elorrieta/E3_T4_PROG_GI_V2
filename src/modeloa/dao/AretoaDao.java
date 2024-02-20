package modeloa.dao;

import modeloa.db.Konexioa;
import modeloa.db.Kontzultak;
import modeloa.objetuak.Aretoa;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AretoaDao {
    
    
    public List<Aretoa> lortuAreatoak(String ID) {
    	
        List<Aretoa> aretoak = new ArrayList<>();

        String kontzulta = "SELECT idAretoa, idZinema, izena FROM ARETOA where idZinema = '" + ID + "'";
        
        try {
            Konexioa.konexioa(); 
            PreparedStatement preparedStatement = Konexioa.konektatua.prepareStatement(kontzulta);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String idAretoa = resultSet.getString("idAretoa");
                String idZinema = resultSet.getString("idZinema");
                String izena = resultSet.getString("izena");

                Aretoa aretoa = new Aretoa(idAretoa, idZinema, izena);
                aretoak.add(aretoa);
                
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Konexioa.konexioaExit();
        }
        
        return aretoak; 
    }
    
    

}