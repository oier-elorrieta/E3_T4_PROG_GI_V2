package modeloa.db;

public interface Kontzultak {
	
	public static String login = "Select ";
	
	
	//Dao kontzultak
	public static String aretoa = "SELECT idAretoa, izena FROM ARETOA";
	public static String bezeroa = "SELECT idBezero, NAN, izena, abizena, erabiltzailea, pasahitza, txartela, tlf_zbk, sexua FROM BEZEROA";
	public static String erosketak = "SELECT idErosketak, idBezero, data, sarreraKant, deskontua, dirutotala, mota FROM EROSKETA";
	public static String filma = "SELECT idFilma, izena, generoa, iraupena FROM FILMA";
	public static String saioa = "SELECT idSaioa, Ordua, Eguna FROM SAIOA";
	public static String sarrera = "SELECT idSarrera FROM SARRERA";
	public static String zinema = "SELECT idZinema, izena, helbidea FROM ZINEMA";
}