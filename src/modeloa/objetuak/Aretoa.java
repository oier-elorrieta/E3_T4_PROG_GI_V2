package modeloa.objetuak;

import java.util.ArrayList;
import java.util.Objects;

public class Aretoa {
	
	private String izena;
	private ArrayList<Saioa> saioList;
	
	//--------------------Konstruktorea--------------------//
	public Aretoa(String izena, ArrayList<Saioa> saioList) {
		this.izena = izena;
		this.saioList = saioList;
	}
	//--------------------Konstruktorea--------------------//
	
	
	//--------------------Set--------------------//	
	public void setIzena(String izena) {
		this.izena = izena;
	}
	
	public void setSaioList(ArrayList<Saioa> saioList) {
		this.saioList = saioList;
	}
	//--------------------Set--------------------//
	
	
	//--------------------Get--------------------//
	public String getIzena() {
		return izena;
	}
	
	public ArrayList<Saioa> getSaioList() {
		return saioList;
	}
	//--------------------Get--------------------//

	
	//--------------------toString--------------------//
	@Override
	public String toString() {
		return "Aretoa [izena=" + izena + ", saioList=" + saioList + "]";
	}
	//--------------------toString--------------------//


	//--------------------Equals--------------------//
	@Override
	public int hashCode() {
		return Objects.hash(izena, saioList);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aretoa other = (Aretoa) obj;
		return Objects.equals(izena, other.izena) && Objects.equals(saioList, other.saioList);
	}
	//--------------------Equals--------------------//
	
}
