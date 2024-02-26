package modeloa.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import kontrolatzaile.funtzioak.FuntzioErabilgarriak;
import modeloa.db.Konexioa;
import modeloa.db.Kontsultak;
import modeloa.objetuak.Erosketak;
import modeloa.objetuak.Sarrera;

public class InsertDao {
    
    public static List<Sarrera> sarrerak = FuntzioErabilgarriak.sarrerakList;
    public static List<Erosketak> erosketak = FuntzioErabilgarriak.erosketakList;
    public static int idErosketa = FuntzioErabilgarriak.erosketaIdLortu();
    
    public String insertakEgin() {    	
        String mezua = "";
        
        try {
            Konexioa.konexioa(); 
            PreparedStatement preparedStatement = Konexioa.konektatua.prepareStatement(Kontsultak.erosketaInsert);
            
            for (Erosketak erosketa : erosketak) {            	
            	
                if (erosketa.getSarreraList() != null ) {
                	
                	
                    preparedStatement.setString(1, erosketa.getData() + "");
                    preparedStatement.setDouble(2, erosketa.getDeskontua());
                    preparedStatement.setDouble(3, erosketa.getDirutotala());
                    preparedStatement.setInt(4, erosketa.getMota());
                    preparedStatement.setString(5, erosketa.getBezeroa().getIdBezeroa());

                    int filasInsertadas = preparedStatement.executeUpdate();
                    if (filasInsertadas > 0) {
                    	mezua = "Ondo erregistratu dira Erosketa";
                    	
                    	for (Sarrera sarrera : erosketa.getSarreraList()) {
                           	PreparedStatement preparedStatementSarrera = Konexioa.konektatua.prepareStatement(Kontsultak.sarreraInsert);
                        	preparedStatementSarrera.setInt(1, idErosketa);
                        	preparedStatementSarrera.setInt(2, sarrera.getSaioa().getIdSaioa());
                        	preparedStatementSarrera.setInt(3, sarrera.getSarreraKant());
                        	
                        	int filasInsertadasSarrera = preparedStatementSarrera.executeUpdate();
                        	
                        	if (filasInsertadasSarrera > 0) {
                        		mezua = "Ondo erregistratu dira Sarrera";
                        	}else {
                        		mezua = "Ez dira ondo egin Sarrera";
                        	}
                        	
                        	break;
                    	}
                    	
                    } else {
                    	mezua = "Ez dira ondo egin Erosketa";
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

