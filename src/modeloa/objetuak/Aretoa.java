package modeloa.objetuak;

import java.util.Objects;

public class Aretoa {
	
	private String izena;
	
	//--------------------Konstruktorea--------------------//
	public Aretoa(String izena) {
		this.izena = izena;
	}
	//--------------------Konstruktorea--------------------//
	
	
	//--------------------Set--------------------//	
	public void setIzena(String izena) {
		this.izena = izena;
	}
	
	//--------------------Set--------------------//
	
	
	//--------------------Get--------------------//
	public String getIzena() {
		return izena;
	}

	//--------------------Get--------------------//

	
	//--------------------toString--------------------//
	@Override
	public String toString() {
		return "Aretoa [izena=" + izena +"]";
	}
	//--------------------toString--------------------//


	//--------------------Equals--------------------//
	@Override
	public int hashCode() {
		return Objects.hash(izena);
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
		return Objects.equals(izena, other.izena);
	}
	//--------------------Equals--------------------//
	
}
