package modeloa.dao;

import modeloa.db.Konexioa;
import modeloa.db.Kontzultak;
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

import kontrolatzaile.funtzioak.Funtzioak;

public class SaioaDao {

    public List<Saioa> lortuSaioak(String ID, List<Aretoa> aretoList) {
        List<Saioa> saioak = new ArrayList<>();
        Pelikula peli = null;
        Aretoa areto = null;

        try {
            Konexioa.konexioa(); // Asegúrate de que la conexión está abierta

            String kontzulta = "SELECT idSaioa, Ordua, Eguna, idFilma, idZinema, idAretoa FROM SAIOA WHERE idZinema = ? order by 2, 3 ";
            
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
}
