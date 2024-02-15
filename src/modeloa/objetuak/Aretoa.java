package modeloa.objetuak;

import java.util.Objects;

public class Aretoa {
	
	private String idAretoa;
	private String izena;

	//--------------------Konstruktorea--------------------//
	public Aretoa(String idAretoa, String izena) {
		this.idAretoa = idAretoa;
		this.izena = izena;
	}
	//--------------------Konstruktorea--------------------//
	
	
	//--------------------Set--------------------//	
	public void setIdAretoa(String idAretoa) {
		this.idAretoa = idAretoa;
	}
	
	public void setIzena(String izena) {
		this.izena = izena;
	}
	//--------------------Set--------------------//
	
	
	//--------------------Get--------------------//
	public String getIdAretoa() {
		return idAretoa;
	}
	
	public String getIzena() {
		return izena;
	}
	//--------------------Get--------------------//

	
	//--------------------toString--------------------//
	@Override
	public String toString() {
		return "Aretoa [idAretoa=" + idAretoa + ", izena=" + izena + "]";
	}
	//--------------------toString--------------------//
	
	
	//--------------------Equals--------------------//
	@Override
	public int hashCode() {
		return Objects.hash(idAretoa, izena);
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
		return idAretoa == other.idAretoa && Objects.equals(izena, other.izena);
	}
	//--------------------Equals--------------------//
}
