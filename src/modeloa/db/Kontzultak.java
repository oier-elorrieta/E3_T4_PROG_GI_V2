package modeloa.db;

public class Kontzultak {
	
	public static String login = "Select ";
	
	
	//Dao kontzultak
	
	public static String prueba = "";
	public static String aretoa = "SELECT idAretoa, izena FROM ARETOA";
	public static String bezeroa = "SELECT idBezero, NAN, izena, abizena, erabiltzailea, pasahitza, txartela, tlf_zbk, sexua FROM BEZEROA";
	public static String erosketak = "SELECT idErosketa, Eguna, deskontua, diru_totala, idMota, idBezero, jatorria FROM EROSKETA";
	public static String filma = "SELECT idFilma, izena, generoa, iraupena FROM FILMA";
	public static String saioa = "SELECT idSaioa, Ordua, Eguna, idFilma FROM SAIOA WHERE idZinema = '" ;
	public static String sarrera = "SELECT * FROM SARRERA left join erosketa using (idErosketa) left join sarreramota using (idMota);";
	public static String zinema = "SELECT idZinema, izena, helbidea FROM ZINEMA";
	
	
	//Egunean argitaratu egingo diren filmak, zinema bakoitzean, eguneratuta.
	
	public static String saioakArgitaratu = "";

	
	
	//Egunean argitaratu egingo diren filmak, zinema bakoitzean, eguneratuta.

}
