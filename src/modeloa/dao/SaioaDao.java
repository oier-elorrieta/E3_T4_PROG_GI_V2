package modeloa.dao;

import modeloa.db.Konexioa;
import modeloa.db.Kontzultak;
import modeloa.objetuak.Saioa;
import modeloa.objetuak.Aretoa;
import modeloa.objetuak.Pelikula;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class SaioaDao {

    public static List<Saioa> lortuSaioak() {
        List<Saioa> saioak = new ArrayList<>();

        try {
            Konexioa.konexioa(); // Asegúrate de que la conexión está abierta

            PreparedStatement preparedStatement = Konexioa.konektatua.prepareStatement(Kontzultak.saioa);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int idSaioa = resultSet.getInt("idSaioa");
                String idAretoa = resultSet.getString("aretoa_id");
                LocalTime ordua = resultSet.getTime("ordua").toLocalTime();
                LocalDate eguna = resultSet.getDate("eguna").toLocalDate();
                int idPelikula = resultSet.getInt("pelikula_id");

                Saioa saioa = new Saioa(idSaioa, ordua, eguna);
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
