package modeloa.dao;

import modeloa.db.Konexioa;
import modeloa.db.Kontzultak;
import modeloa.objetuak.Aretoa;
import modeloa.objetuak.Pelikula;
import modeloa.objetuak.Saioa;
import modeloa.objetuak.Zinema;

import java.sql.PreparedStatement; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import kontrolatzaile.funtzioak.Funtzioak;

public class SaioaDao {

	public List<Saioa> lortuSaioak(String ID) {
        List<Saioa> saioak = new ArrayList<>();
        Pelikula peli = null;
        Aretoa areto = null;
      //  AretoaDao aretoaDao = new AretoaDao();
        try {
            Konexioa.konexioa(); // Asegúrate de que la conexión está abierta

            String kontzulta = "SELECT idSaioa, Ordua, Eguna, idFilma, idZinema, idAretoa FROM SAIOA WHERE idZinema = '" + ID + "'";
            
            PreparedStatement preparedStatement = Konexioa.konektatua.prepareStatement(kontzulta);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int idSaioa = resultSet.getInt("idSaioa");
                LocalTime ordua = resultSet.getTime("ordua").toLocalTime();
                LocalDate eguna = resultSet.getDate("eguna").toLocalDate();
                int idPelikula = resultSet.getInt("idFilma");
                String idZinema = resultSet.getString("idZinema");
                String idAretoa = resultSet.getString("idAretoa");
                for (Pelikula pelikula : Funtzioak.pelikulakList) {
                    // Compara el atributo idFilma con el valor buscado
                    if (pelikula.getIdPelikula() == idPelikula) {
                        // Si coincide, guarda la película y sal del bucle
                        peli = pelikula;
                        break;
                    }
                }
                System.out.println("Tamaño de la lista: " + Funtzioak.areatoakList.size());
                for (Aretoa aretoa : Funtzioak.areatoakList) {
                    // Compara el atributo idFilma con el valor buscado
                	if (aretoa.getIdZinema().equals(idZinema) && aretoa.getIdAretoa().equals(idAretoa)) {
                        // Si coincide, guarda la película y sal del bucle
                		areto = aretoa;
                		System.out.println(areto);
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
