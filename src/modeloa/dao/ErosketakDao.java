package modeloa.dao;

import modeloa.db.Konexioa;
import modeloa.db.Kontsultak;
import modeloa.objetuak.Bezeroa;
import modeloa.objetuak.Erosketak;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ErosketakDao {

    public List<Erosketak> lortuErosketak() {
        List<Erosketak> erosketak = new ArrayList<>();

        Konexioa.konexioa(); // Asegúrate de que la conexión está abierta

        
        try (PreparedStatement preparedStatement = Konexioa.konektatua.prepareStatement(Kontsultak.erosketak);
                ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                int idErosketak = resultSet.getInt("idErosketa");
                LocalDate data = resultSet.getDate("Eguna").toLocalDate();
               
				Erosketak erosketa = new Erosketak(idErosketak, data);
                erosketak.add(erosketa); 
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Konexioa.konexioaExit(); // Asegúrate de cerrar la conexión después de usarla
        }

        return erosketak;
    }
    
    
}
