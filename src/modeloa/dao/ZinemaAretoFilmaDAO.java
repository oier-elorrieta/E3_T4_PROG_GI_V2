package modeloa.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modeloa.db.Konexioa;
import modeloa.db.Kontzultak;
import modeloa.objetuak.Pelikula;

public class ZinemaAretoFilmaDAO {


    public List<Pelikula> lortuElorrietaFilmak() {
        List<Pelikula> elorrietaPelikulak = new ArrayList<>();

        try {
            Konexioa.konexioa(); // Asegúrate de que la conexión está abierta

            PreparedStatement preparedStatement = Konexioa.konektatua.prepareStatement(Kontzultak.elorrietaFilmSaioak);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int idFilma = resultSet.getInt("idFilma");
                String izena = resultSet.getString("izena");
                String generoa = resultSet.getString("generoa");
                int iraupena = resultSet.getInt("iraupena");

                Pelikula pelikula = new Pelikula(idFilma, izena, generoa, iraupena);
                elorrietaPelikulak.add(pelikula);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Konexioa.konexioaExit(); // Asegúrate de cerrar la conexión después de usarla
        }

        return elorrietaPelikulak;
    }
    
	

}
