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
	
	
	//Egunean argitaratu egingo diren filmak, zinema bakoitzean, eguneratuta.
	
	public static String elorrietaFilmSaioak = "SELECT ordua, eguna, idaretoa, idFilma "
			+ "FROM saioa s LEFT JOIN ZINEMA z USING (idZinema) LEFT JOIN FILMA f USING (idFilma)"
			+ " WHERE z.idzinema = 'Z01' AND Eguna >= CURDATE() AND Ordua >= CURTIME() "
			+ "ORDER by s.Eguna, s.Ordua;";

	public static String erandioFilmSaioak = "SELECT ordua, eguna, idaretoa, idFilma "
			+ "FROM saioa s LEFT JOIN ZINEMA z USING (idZinema) LEFT JOIN FILMA f USING (idFilma)"
			+ " WHERE z.idzinema = 'Z02' AND Eguna >= CURDATE() AND Ordua >= CURTIME() "
			+ "ORDER by s.Eguna, s.Ordua;";

	public static String barakaldoFilmSaioak = "SELECT ordua, eguna, idaretoa, idFilma "
			+ "FROM saioa s LEFT JOIN ZINEMA z USING (idZinema) LEFT JOIN FILMA f USING (idFilma)"
			+ " WHERE z.idzinema = 'Z03' AND Eguna >= CURDATE() AND Ordua >= CURTIME() "
			+ "ORDER by s.Eguna, s.Ordua;";
	
	public static String santutxuFilmSaioak = "SELECT ordua, eguna, idaretoa, idFilma "
			+ "FROM saioa s LEFT JOIN ZINEMA z USING (idZinema) LEFT JOIN FILMA f USING (idFilma)"
			+ " WHERE z.idzinema = 'Z04' AND Eguna >= CURDATE() AND Ordua >= CURTIME() "
			+ "ORDER by s.Eguna, s.Ordua;";
	
	public static String basauriFilmSaioak = "SELECT ordua, eguna, idaretoa, idFilma "
			+ "FROM saioa s LEFT JOIN ZINEMA z USING (idZinema) LEFT JOIN FILMA f USING (idFilma)"
			+ " WHERE z.idzinema = 'Z05' AND Eguna >= CURDATE() AND Ordua >= CURTIME() "
			+ "ORDER by s.Eguna, s.Ordua;";
	
	//Egunean argitaratu egingo diren filmak, zinema bakoitzean, eguneratuta.

}
