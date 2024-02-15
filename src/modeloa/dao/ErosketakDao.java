package modeloa.dao;

import modeloa.db.Konexioa;
import modeloa.db.Kontzultak;
import modeloa.objetuak.Bezeroa;
import modeloa.objetuak.Erosketak;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ErosketakDao {

    public static List<Erosketak> lortuErosketak() {
        List<Erosketak> erosketak = new ArrayList<>();

        try {
            Konexioa.konexioa(); // Asegúrate de que la conexión está abierta

            PreparedStatement preparedStatement = Konexioa.konektatua.prepareStatement(Kontzultak.erosketak);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int idErosketak = resultSet.getInt("idErosketak");
                int idBezero = resultSet.getInt("idBezero"); // Asumiendo que "idBezero" es la clave foránea que hace referencia a la tabla "BEZEROA"
                LocalDate data = resultSet.getDate("data").toLocalDate();
                int sarreraKant = resultSet.getInt("sarreraKant");
                double deskontua = resultSet.getDouble("deskontua");
                double dirutotala = resultSet.getDouble("dirutotala");
                String mota = resultSet.getString("mota");

                Bezeroa bezeroa = BezeroaDao.lortuBezeroa(idBezero); // Necesitarás implementar un método similar en la clase BezeroaDao

                Erosketak erosketa = new Erosketak(idErosketak, bezeroa, data);
                erosketa.setSarreraKant(sarreraKant);
                erosketa.setDeskontua(deskontua);
                erosketa.setDirutotala(dirutotala);
                erosketa.setMota(mota);

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
