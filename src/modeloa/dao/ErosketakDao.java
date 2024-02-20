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

    public List<Erosketak> lortuErosketak() {
        List<Erosketak> erosketak = new ArrayList<>();

        try {
            Konexioa.konexioa(); // Asegúrate de que la conexión está abierta

            PreparedStatement preparedStatement = Konexioa.konektatua.prepareStatement(Kontzultak.erosketak);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int idErosketak = resultSet.getInt("idErosketak");
                LocalDate data = resultSet.getDate("Eguna").toLocalDate();
                double deskontua = resultSet.getDouble("deskontua");
                double dirutotala = resultSet.getDouble("diru_totala");
                String mota = resultSet.getString("idMota");
                String idBezero = resultSet.getString("idBezero");
;
                Erosketak erosketa = new Erosketak(idErosketak, data);
                erosketa.setSarreraKant(2);
                erosketa.setDeskontua(deskontua);
                erosketa.setDirutotala(dirutotala);
                erosketa.setMota(mota);
<<<<<<< HEAD
                
//                Bezeroa bezeroa = new 
//                
//                erosketa.setBezeroa();

                erosketak.add(erosketa);
=======
//                
//                Bezeroa bezeroa = new 
//                
//                erosketa.setBezeroa();
//
//                erosketak.add(erosketa);
>>>>>>> 7bc05dadbccabb907850c6698d48040bbfa4f035
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Konexioa.konexioaExit(); // Asegúrate de cerrar la conexión después de usarla
        }

        return erosketak;
    }
    
    
}
