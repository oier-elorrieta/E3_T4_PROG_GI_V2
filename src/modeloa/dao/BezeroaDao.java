package modeloa.dao;

import modeloa.db.Konexioa;
import modeloa.db.Kontsultak;
import modeloa.objetuak.Bezeroa;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BezeroaDao {

    public List<Bezeroa> lortuBezeroak() {
        List<Bezeroa> bezeroak = new ArrayList<>();

        Konexioa.konexioa(); 

        try (PreparedStatement preparedStatement = Konexioa.konektatua.prepareStatement(Kontsultak.bezeroa);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
            	String idBezeroa = resultSet.getString("idBezero");
                String NAN = resultSet.getString("NAN");
                String izena = resultSet.getString("izena");
                String abizena = resultSet.getString("abizena");
                String erabiltzailea = resultSet.getString("erabiltzailea");
                String pasahitza = resultSet.getString("pasahitza");
                int txartela = resultSet.getInt("txartela");
                String sexua = resultSet.getString("sexua");

                Bezeroa bezeroa = new Bezeroa(idBezeroa, NAN, izena, abizena, erabiltzailea, pasahitza, txartela, sexua);
                bezeroak.add(bezeroa);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Konexioa.konexioaExit(); 
        }

        return bezeroak;
    }

}
