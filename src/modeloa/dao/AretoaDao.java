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

    public List<Aretoa> lortuAreatoak() {
        List<Aretoa> areatoak = new ArrayList<>();

        try {
            Konexioa.konexioa(); // Asegúrate de que la conexión está abierta

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
            Konexioa.konexioaExit(); // Asegúrate de cerrar la conexión después de usarla
        }

        return areatoak;
    }

}

