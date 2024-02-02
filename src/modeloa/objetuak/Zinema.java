package modeloa.objetuak;

import java.util.ArrayList;
import java.util.Objects;

public class Zinema {
	
	private int idZinema;
	private String izena;
	private String helbidea;
	private ArrayList<Integer> aretoList;
	private String NIF;

	//--------------------Konstruktorea--------------------//
	public Zinema(String izena, String helbidea, String NIF) {
		this.izena = izena;
		this.helbidea = helbidea;
		this.NIF = NIF;
	}
	//--------------------Konstruktorea--------------------//
	
	
	//--------------------Set--------------------//
	public void setIdZinema(int idZinema) {
		this.idZinema = idZinema;
	}
	
	public void setIzena(String izena) {
		this.izena = izena;
	}
	
	public void setNIF(String nIF) {
		NIF = nIF;
	}
	
	public void setAretoList(ArrayList<Integer> aretoKop) {
		this.aretoList = aretoKop;
	}
	
	public void setHelbidea(String helbidea) {
		this.helbidea = helbidea;
	}
	//--------------------Set--------------------//
	
	
	//--------------------Get--------------------//
	public int getIdZinema() {
		return idZinema;
	}

	public String getIzena() {
		return izena;
	}

	public String getNIF() {
		return NIF;
	}

	public ArrayList<Integer> getAretoList() {
		return aretoList;
	}

	public String getHelbidea() {
		return helbidea;
	}
	//--------------------Get--------------------//
	
	
	//--------------------toString--------------------//
	@Override
	public String toString() {
		return "Zinema [idZinema=" + idZinema + ", izena=" + izena + ", helbidea=" + helbidea + ", aretoKop=" + aretoList
				+ ", NIF=" + NIF + "]";
	}
	//--------------------toString--------------------//
	
	
	//--------------------Equals--------------------//
	@Override
	public int hashCode() {
		return Objects.hash(NIF, aretoList, helbidea, idZinema, izena);
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
		return Objects.equals(NIF, other.NIF) && Objects.equals(aretoList, other.aretoList)
				&& Objects.equals(helbidea, other.helbidea) && idZinema == other.idZinema
				&& Objects.equals(izena, other.izena);
	}
	//--------------------Equals--------------------//

}
