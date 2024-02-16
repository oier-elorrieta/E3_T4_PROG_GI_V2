package modeloa.dao;

import modeloa.db.Konexioa;
import modeloa.db.Kontzultak;
import modeloa.objetuak.Bezeroa;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BezeroaDao {
	
	public BezeroaDao() {
	
	}

    public List<Bezeroa> lortuBezeroak() {
        List<Bezeroa> bezeroak = new ArrayList<>();

        Konexioa.konexioa(); // Asegúrate de tener esta llamada para establecer la conexión

        try (PreparedStatement preparedStatement = Konexioa.konektatua.prepareStatement(Kontzultak.bezeroa);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
            	String id = resultSet.getString("idBezero");
                String NAN = resultSet.getString("NAN");
                String izena = resultSet.getString("izena");
                String abizena = resultSet.getString("abizena");
                String erabiltzailea = resultSet.getString("erabiltzailea");
                String pasahitza = resultSet.getString("pasahitza");
                int txartela = resultSet.getInt("txartela");
                String sexua = resultSet.getString("sexua");

                Bezeroa bezeroa = new Bezeroa(id, NAN, izena, abizena, erabiltzailea, pasahitza, txartela, sexua);
                bezeroak.add(bezeroa);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            // Maneja la excepción según tus necesidades
        } finally {
            Konexioa.konexioaExit(); // Asegúrate de cerrar la conexión
        }

        return bezeroak;
    }

}
