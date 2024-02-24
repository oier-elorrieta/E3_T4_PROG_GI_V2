//package modeloa.dao;
//
//import modeloa.db.Konexioa;
//import modeloa.db.Kontsultak;
//import modeloa.objetuak.Sarrera;
//
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Date; // Añade la importación para java.sql.Date
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
//public class SarreraDao {
//
//    public List<Sarrera> lortuSarrerak() {
//        List<Sarrera> sarrerak = new ArrayList<>();
//
//        try {
//            Konexioa.konexioa(); // Asegúrate de que la conexión está abierta
//
//            PreparedStatement preparedStatement = Konexioa.konektatua.prepareStatement(Kontsultak.sarrera);
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            while (resultSet.next()) {
//                int idSarrera = resultSet.getInt("idSarrera");
//                int sarreraKant = resultSet.getInt("sarreraKant");
//                
//                
//                // Corrección para obtener la fecha como LocalDate
//                Date date = resultSet.getDate("Eguna");
//                LocalDate data = date.toLocalDate();
//                
//                double prezioa = resultSet.getDouble("kostua");
//                int mota = resultSet.getInt("idMota");
//
//                Sarrera sarrera = new Sarrera(idSarrera , null , data, prezioa, mota); // Utiliza 'data' en lugar de LocalDate.now()
//                sarrera.setSarreraKant(sarreraKant);
//                sarrerak.add(sarrera);
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            Konexioa.konexioaExit(); // Asegúrate de cerrar la conexión después de usarla
//        }
//
//        return sarrerak;
//    }
//}
