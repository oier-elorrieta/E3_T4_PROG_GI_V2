package modeloa.objetuak;

public class Zinema {
	private int idZinema;
	private String izena;
	private String helbidea;
	private String NIF;

	public Zinema(String izena, String helbidea, String NIF) {
		this.izena = izena;
		this.helbidea = helbidea;
		this.NIF = NIF;
	}
	
	public int getIdentificador() {
		return idZinema;
	}

<<<<<<< HEAD
	public void setIdentificador(int idZinema) {
		this.idZinema = idZinema;
=======
	public void setIdentificador(int identificador) {
		this.idZinema = identificador;
>>>>>>> 8b0586e8378cc45e4b5660024a932b0075fd9207
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}

	public int getAretoKop() {
		return aretoKop;
	}

	public void setAretoKop(int aretoKop) {
		this.aretoKop = aretoKop;
	}

	private int aretoKop;

	public String getHelbidea() {
		return helbidea;
	}

	public void setHelbidea(String helbidea) {
		this.helbidea = helbidea;
	}
	
}


