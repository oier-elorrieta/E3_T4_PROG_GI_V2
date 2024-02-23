package modeloa.objetuak;

import java.util.Objects;

public class Aretoa {
	
	private String idAretoa;
	private String idZinema;
	private String izena;
<<<<<<< HEAD

	//--------------------Konstruktorea--------------------//
	public Aretoa(String idAretoa, String idZinema,String izena) {
		this.idAretoa = idAretoa;
		this.idZinema = idZinema;
=======
	
	//--------------------Konstruktorea--------------------//
	public Aretoa(String izena) {
>>>>>>> master
		this.izena = izena;
	}
	//--------------------Konstruktorea--------------------//
	
	
	//--------------------Set--------------------//	
	public void setIdAretoa(String idAretoa) {
		this.idAretoa = idAretoa;
	}
	
<<<<<<< HEAD
	public void setIdZinema(String idZinema) {
		this.idZinema = idZinema;
	}
	
	public void setIzena(String izena) {
		this.izena = izena;
	}
=======
>>>>>>> master
	//--------------------Set--------------------//
	
	
	//--------------------Get--------------------//
	public String getIdAretoa() {
		return idAretoa;
	}
<<<<<<< HEAD
	
	public String getIdZinema() {
		return idZinema;
	}

	
	public String getIzena() {
		return izena;
	}
=======

>>>>>>> master
	//--------------------Get--------------------//

	
	//--------------------toString--------------------//
	@Override
	public String toString() {
<<<<<<< HEAD
		return "Aretoa [idAretoa=" + idAretoa + ", idZinema=" + idZinema + ", izena=" + izena + "]";
=======
		return "Aretoa [izena=" + izena +"]";
>>>>>>> master
	}
	//--------------------toString--------------------//


	@Override
	public int hashCode() {
<<<<<<< HEAD
		return Objects.hash(idAretoa, idZinema, izena);
=======
		return Objects.hash(izena);
>>>>>>> master
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
<<<<<<< HEAD
		return Objects.equals(idAretoa, other.idAretoa) && Objects.equals(idZinema, other.idZinema)
				&& Objects.equals(izena, other.izena);
=======
		return Objects.equals(izena, other.izena);
>>>>>>> master
	}
	
}
