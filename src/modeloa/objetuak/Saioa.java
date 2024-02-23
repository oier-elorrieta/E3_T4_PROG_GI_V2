package modeloa.objetuak;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Saioa {
	
<<<<<<< HEAD
	private int idSaioa;
=======
>>>>>>> master
	private Aretoa aretoa;
	private LocalTime ordua;
	private LocalDate eguna;
	private Pelikula pelikula;
	
	//--------------------Konstruktorea--------------------//
	public Saioa(int idSaioa, Aretoa aretoa, LocalTime ordua, LocalDate eguna, Pelikula pelikula) {
		this.idSaioa = idSaioa;
		this.aretoa = aretoa;
		this.ordua = ordua;
		this.eguna = eguna;
		this.pelikula = pelikula;
	}
	//--------------------Konstruktorea--------------------//
	
	
	public Saioa() {
		
	}


	//--------------------Set--------------------//
<<<<<<< HEAD
	public void setIdSaioa(int idSaioa) {
		this.idSaioa = idSaioa;
	}
=======

>>>>>>> master
	
	public void setAretoa(Aretoa aretoa) {
		this.aretoa = aretoa;
	}
<<<<<<< HEAD
=======
	
	

>>>>>>> master

	public void setOrdua(LocalTime ordua) {
		this.ordua = ordua;
	}
	
	public void setEguna(LocalDate eguna) {
		this.eguna = eguna;
	}

	public void setPelikula(Pelikula pelikula) {
		this.pelikula = pelikula;
	}
<<<<<<< HEAD
=======

>>>>>>> master
	//--------------------Set--------------------//
	
	
	//--------------------Get--------------------//
<<<<<<< HEAD
	public int getIdSaioa() {
		return idSaioa;
	}
=======

>>>>>>> master
	
	public Aretoa getAretoa() {
		return aretoa;
	}

	public LocalTime getOrdua() {
		return ordua;
	}
	
	public LocalDate getEguna() {
		return eguna;
	}
	public Pelikula getPelikula() {
		return pelikula;
	}
	//--------------------Get--------------------//


	
	
	//--------------------toString--------------------//

<<<<<<< HEAD
	@Override
	public String toString() {
		return "Saioa [idSaioa=" + idSaioa + ", aretoa=" + aretoa + ", ordua=" + ordua + ", eguna=" + eguna
				+ ", pelikula=" + pelikula + "]";
	}
=======
	
	@Override
	public String toString() {
		return "Saioa [aretoa=" + aretoa + ", ordua=" + ordua + ", eguna=" + eguna + ", pelikula=" + pelikula + "]";
	}


	
>>>>>>> master
	
	//--------------------toString--------------------//


	//--------------------Equals--------------------//

	
	
	@Override
	public int hashCode() {
<<<<<<< HEAD
		return Objects.hash(idSaioa, aretoa, eguna, ordua, pelikula);
=======
		return Objects.hash(aretoa, eguna, ordua, pelikula);
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
		Saioa other = (Saioa) obj;
<<<<<<< HEAD
		return Objects.equals(aretoa, other.aretoa) && Objects.equals(eguna, other.eguna) && idSaioa == other.idSaioa
=======
		return Objects.equals(aretoa, other.aretoa) && Objects.equals(eguna, other.eguna)
>>>>>>> master
				&& Objects.equals(ordua, other.ordua) && Objects.equals(pelikula, other.pelikula);
	}
	
	
	
	
	//--------------------Equals--------------------//
}