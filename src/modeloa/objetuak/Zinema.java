package modeloa.objetuak;

import java.util.List;
import java.util.Objects;

public class Zinema {

	private String idZinema;
	private String izena;
	private String helbidea;
	private List<Aretoa> aretoList;
	private List<Saioa> saioList;

	// --------------------Konstruktorea--------------------//
	public Zinema(String idZinema, String izena, String helbidea, List<Aretoa> aretoList, List<Saioa> saioList) {
		this.idZinema = idZinema;
		this.izena = izena;
		this.helbidea = helbidea;
		this.aretoList = aretoList;
		this.saioList = saioList;
	}
	// --------------------Konstruktorea--------------------//

	// --------------------Set--------------------//
	public void setIdZinema(String idZinema) {
		this.idZinema = idZinema;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public void setHelbidea(String helbidea) {
		this.helbidea = helbidea;
	}

	public void setAretoList(List<Aretoa> aretoList) {
		this.aretoList = aretoList;
	}

	public void setSaioList(List<Saioa> saioList) {
		this.saioList = saioList;
	}
	// --------------------Set--------------------//

	// --------------------Get--------------------//
	public String getIdZinema() {
		return idZinema;
	}
	
	public String getIzena() {
		return izena;
	}

	public String getHelbidea() {
		return helbidea;
	}

	public List<Aretoa> getAretoList() {
		return aretoList;
	}

	public List<Saioa> getSaioList() {
		return saioList;
	}
	// --------------------Get--------------------//

	// --------------------toString--------------------//
	@Override
	public String toString() {
		return "Zinema [idZinema=" + idZinema + ", izena=" + izena + ", helbidea=" + helbidea + ", aretoList=" + aretoList
				+ ", saioList=" + saioList + "]";
	}
	// --------------------toString--------------------//

	
	// --------------------Equals--------------------//
	@Override
	public int hashCode() {
		return Objects.hash(aretoList, helbidea, idZinema, izena, saioList);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Zinema other = (Zinema) obj;
		return Objects.equals(aretoList, other.aretoList) && Objects.equals(helbidea, other.helbidea)
				&& Objects.equals(idZinema, other.idZinema) && Objects.equals(izena, other.izena)
				&& Objects.equals(saioList, other.saioList);
	}
	// --------------------Equals--------------------//
}