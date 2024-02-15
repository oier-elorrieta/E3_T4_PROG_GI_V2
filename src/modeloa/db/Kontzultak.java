package modeloa.db;

public interface Kontzultak {
	
	public static String login = "Select ";
	
	
	//Dao kontzultak
	public static String bezeroa = "SELECT idBezero, NAN, izena, abizena, erabiltzailea, pasahitza, txartela, tlf_zbk, sexua FROM BEZEROA";
	public static String filma = "SELECT idFilma, izena, generoa, iraupena FROM FILMA";
}
