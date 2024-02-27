package modeloa.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import kontrolatzaile.funtzioak.FuntzioErabilgarriak;
import modeloa.db.Konexioa;
import modeloa.db.Kontsultak;
import modeloa.objetuak.Erosketak;
import modeloa.objetuak.Sarrera;

public class InsertDao {
    
    public static List<Sarrera> sarrerak = FuntzioErabilgarriak.sarrerakList;
    public static List<Erosketak> erosketak = FuntzioErabilgarriak.erosketakList;
    
    public String insertakEgin() {    	
        String mezua = "";
        
        try {
            Konexioa.konexioa(); 
            
            for (Erosketak erosketa : erosketak) {
                if (erosketa.getSarreraList() != null && !erosketa.getSarreraList().isEmpty()) {
                    PreparedStatement preparedStatement = Konexioa.konektatua.prepareStatement(Kontsultak.erosketaInsert, Statement.RETURN_GENERATED_KEYS);
                    preparedStatement.setString(1, erosketa.getData() + "");
                    preparedStatement.setDouble(2, erosketa.getDeskontua());
                    preparedStatement.setDouble(3, erosketa.getDirutotala());
                    preparedStatement.setInt(4, erosketa.getMota());
                    preparedStatement.setString(5, erosketa.getBezeroa().getIdBezeroa());

                    int filasInsertadas = preparedStatement.executeUpdate();
                    
                    if (filasInsertadas > 0) {
                        mezua = "Ondo erregistratu da Erosketa";
                        
                        ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
                        int idErosketa = -1;
                        if (generatedKeys.next()) {
                            idErosketa = generatedKeys.getInt(1);
                        }
                        
                        for (Sarrera sarrera : erosketa.getSarreraList()) {
                            PreparedStatement preparedStatementSarrera = Konexioa.konektatua.prepareStatement(Kontsultak.sarreraInsert);
                            preparedStatementSarrera.setInt(1, idErosketa);
                            preparedStatementSarrera.setInt(2, sarrera.getSaioa().getIdSaioa());
                            preparedStatementSarrera.setInt(3, sarrera.getSarreraKant());

                            int filasInsertadasSarrera = preparedStatementSarrera.executeUpdate();

                            if (filasInsertadasSarrera > 0) {
                                mezua = "Ondo erregistratu dira datuak";
                            } else {
                                mezua = "Ez dira ondo egin Sarrerak";
                                break; 
                            }
                        }
                    } else {
                        mezua = "Ez da ondo erregistratu Erosketa";
                    }
                }
            }
                       
        } catch (SQLException e) {
            e.printStackTrace();
            mezua = "Errorea: " + e.getMessage();
        } finally {
            Konexioa.konexioaExit();
        }
        return mezua;
    }
}

