package modeloa.objetuak;

public class Zinema {
	private int identificador;
	private String izena;
	private String helbidea;
	private String NIF;

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
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


