package modeloa.objetuak;

import java.util.Objects;

public class Aretoa {
	
	private String idAretoa;
	private String idZinema;
	private String izena;

	//--------------------Konstruktorea--------------------//
	public Aretoa(String idAretoa, String idZinema,String izena) {
		this.idAretoa = idAretoa;
		this.idZinema = idZinema;
		this.izena = izena;
	}
	//--------------------Konstruktorea--------------------//
	
	
	//--------------------Set--------------------//	
	public void setIdAretoa(String idAretoa) {
		this.idAretoa = idAretoa;
	}
	
	public void setIdZinema(String idZinema) {
		this.idZinema = idZinema;
	}
	
	public void setIzena(String izena) {
		this.izena = izena;
	}
	//--------------------Set--------------------//
	
	
	//--------------------Get--------------------//
	public String getIdAretoa() {
		return idAretoa;
	}
	
	public String getIdZinema() {
		return idZinema;
	}

	
	public String getIzena() {
		return izena;
	}
	//--------------------Get--------------------//

	
	//--------------------toString--------------------//
	@Override
	public String toString() {
		return "Aretoa [idAretoa=" + idAretoa + ", idZinema=" + idZinema + ", izena=" + izena + "]";
	}
	//--------------------toString--------------------//


	@Override
	public int hashCode() {
		return Objects.hash(idAretoa, idZinema, izena);
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
		return Objects.equals(idAretoa, other.idAretoa) && Objects.equals(idZinema, other.idZinema)
				&& Objects.equals(izena, other.izena);
	}
	
}
