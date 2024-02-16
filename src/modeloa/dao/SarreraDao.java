package modeloa.dao;

import modeloa.db.Konexioa;
import modeloa.db.Kontzultak;
import modeloa.objetuak.Sarrera;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SarreraDao {

    public List<Sarrera> lortuSarrerak() {
        List<Sarrera> sarrerak = new ArrayList<>();

        try {
            Konexioa.konexioa(); // Asegúrate de que la conexión está abierta

            PreparedStatement preparedStatement = Konexioa.konektatua.prepareStatement(Kontzultak.sarrera);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int idSarrera = resultSet.getInt("idSarrera");
                int sarreraKant = resultSet.getInt("sarrera_kant");
                double prezioa = resultSet.getDouble("prezioa");
                String mota = resultSet.getString("mota");

                Sarrera sarrera = new Sarrera(idSarrera, LocalDate.now(), prezioa, mota);
                sarrera.setSarreraKant(sarreraKant);
                sarrerak.add(sarrera);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Konexioa.konexioaExit(); // Asegúrate de cerrar la conexión después de usarla
        }

        return sarrerak;
    }
}
