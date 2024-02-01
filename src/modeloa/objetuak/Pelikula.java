package modeloa.objetuak;

public class Pelikula {
	private int idPelikula;
	private int iraupena;
	private String izenaFilma;
	private String generoa;
	
	@Override
	public String toString() {
		return "Pelikula [idPelikula=" + idPelikula + ", iraupena=" + iraupena + ", izenaFilma=" + izenaFilma
				+ ", generoa=" + generoa + "]";
	}

	public Pelikula(int iraupena, String generoa, String izenaFilma) {
		this.izenaFilma = izenaFilma;
		this.iraupena = iraupena;
		this.generoa = generoa;
	}

	public int getIdPelikula() {
		return idPelikula;
	}

	public void setIdPelikula(int idPelikula) {
		this.idPelikula = idPelikula;
	}

	public String getIzenaFilma() {
		return izenaFilma;
	}

	public void setIzenaFilma(String izenaFilma) {
		this.izenaFilma = izenaFilma;
	}

	public int getIraupena() {
		return iraupena;
	}

	public void setIraupena(int iraupena) {
		this.iraupena = iraupena;
	}

	public String getGeneroa() {
		return generoa;
	}

	public void setGeneroa(String generoa) {
		this.generoa = generoa;
	}

}
