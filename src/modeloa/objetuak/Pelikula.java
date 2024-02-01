package modeloa.objetuak;

import java.util.Objects;

public class Pelikula {
	private int idPelikula;
	private int iraupena;
	private String izenaFilma;
	private String generoa;
	
	@Override
	public int hashCode() {
		return Objects.hash(generoa, idPelikula, iraupena, izenaFilma);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelikula other = (Pelikula) obj;
		return Objects.equals(generoa, other.generoa) && idPelikula == other.idPelikula && iraupena == other.iraupena
				&& Objects.equals(izenaFilma, other.izenaFilma);
	}

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
