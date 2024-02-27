package modeloa.dao;

import modeloa.db.Konexioa;
import modeloa.db.Kontsultak;
import modeloa.objetuak.Aretoa;
import modeloa.objetuak.Pelikula;
import modeloa.objetuak.Saioa;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import kontrolatzaile.funtzioak.FuntzioErabilgarriak;

public class SaioaDao {

    public List<Saioa> lortuSaioak(String ID, List<Aretoa> aretoList) {
        List<Saioa> saioak = new ArrayList<>();
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
 
                for (Pelikula pelikula : FuntzioErabilgarriak.pelikulakList) {
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
                saioak.add(saioa);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Konexioa.konexioaExit();
        }

        return saioak;
    }
}
