package modeloa.db;

public class Kontsultak {	
	
	//Dao kontzultak
	
	public static String aretoa = "SELECT idAretoa, idZinema, izena FROM ARETOA where idZinema = '" ;
	public static String bezeroa = "SELECT idBezero, NAN, izena, abizena, erabiltzailea, pasahitza, txartela, tlf_zbk, sexua FROM BEZEROA";
	public static String erosketak = "SELECT idErosketa, Eguna, deskontua, diru_totala, idMota, idBezero, jatorria FROM EROSKETA";
	public static String filma = "SELECT idFilma, izena, generoa, iraupena FROM FILMA";
	public static String saioa = "SELECT idSaioa, Ordua, Eguna, idFilma, idZinema, idAretoa FROM SAIOA WHERE idZinema = ? order by 2, 3 ";
	public static String sarrera = "SELECT * FROM SARRERA left join erosketa using (idErosketa) left join sarreramota using (idMota);";
	public static String zinema = "SELECT idZinema, izena, helbidea FROM ZINEMA";

}
