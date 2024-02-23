package modeloa.objetuak;

import java.util.Objects;

public class Pelikula {
	
	private int idPelikula;
	private String izena;
	private String generoa;
	private int iraupena;
	
	//--------------------Konstruktorea--------------------//
	
	public Pelikula() {
		
	}
	
	
	
	public Pelikula(int idPelikula , String izena, String generoa, int iraupena) {
		this.idPelikula = idPelikula;
		this.izena = izena;
		this.iraupena = iraupena;
		this.generoa = generoa;
	}
	//--------------------Konstruktorea--------------------//
	
	
	//--------------------Set--------------------//
	public void setIdPelikula(int idPelikula) {
		this.idPelikula = idPelikula;
	}
	
	public void setIzena(String izena) {
		this.izena = izena;
	}
	
	public void setIraupena(int iraupena) {
		this.iraupena = iraupena;
	}
	
	public void setGeneroa(String generoa) {
		this.generoa = generoa;
	}
	//--------------------Set--------------------//
	
	
	//--------------------Get--------------------//
	public int getIdPelikula() {
		return idPelikula;
	}

	public String getIzena() {
		return izena;
	}

	public int getIraupena() {
		return iraupena;
	}

	public String getGeneroa() {
		return generoa;
	}
	//--------------------Get--------------------//
	
	
	//--------------------toString--------------------//
	@Override
	public String toString() {
		return "Pelikula [idPelikula=" + idPelikula + ", izena=" + izena + ", generoa=" + generoa + ", iraupena="
				+ iraupena + "]";
	}
	//--------------------toString--------------------//

	
	//--------------------Equals--------------------//
	@Override
	public int hashCode() {
		return Objects.hash(generoa, idPelikula, iraupena, izena);
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
<<<<<<< HEAD
		return Objects.equals(generoa, other.generoa) && idPelikula == other.idPelikula && iraupena == other.iraupena
				&& Objects.equals(izena, other.izena);
=======
		return Objects.equals(izena, other.izena) && Objects.equals(generoa, other.generoa) && iraupena == other.iraupena;
>>>>>>> master
	}
	//--------------------Equals--------------------//
}