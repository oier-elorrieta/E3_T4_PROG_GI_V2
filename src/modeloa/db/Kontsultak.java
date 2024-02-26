package modeloa.db;

public class Kontsultak {	
	
	//Dao kontzultak
	
	public final static String aretoa = "SELECT idAretoa, idZinema, izena FROM ARETOA where idZinema = '" ;
	public final static String bezeroa = "SELECT idBezero, NAN, izena, abizena, erabiltzailea, pasahitza, txartela, tlf_zbk, sexua FROM BEZEROA";
	public final static String erosketak = "SELECT idErosketa, Eguna, deskontua, diru_totala, idMota, idBezero, jatorria FROM EROSKETA";
	public final static String filma = "SELECT idFilma, izena, generoa, iraupena FROM FILMA";
	public final static String saioa = "SELECT idSaioa, Ordua, Eguna, idFilma, idZinema, idAretoa FROM SAIOA WHERE idZinema = ? order by 2, 3 ";
	public final static String sarrera = "SELECT * FROM SARRERA left join erosketa using (idErosketa) left join sarreramota using (idMota);";
	public final static String zinema = "SELECT idZinema, izena, helbidea FROM ZINEMA";
	
	
	public final static String erosketaInsert = "INSERT INTO EROSKETA (eguna, deskontua, diru_totala, idMota, idBezero, jatorria) VALUES (?, ?, ?, ?, ?, 'Fisikoa')";
	public final static String sarreraInsert = "INSERT INTO SARRERA (idErosketa, idSaioa, sarreraKant) VALUES (?, ?, ?)";
	

}
