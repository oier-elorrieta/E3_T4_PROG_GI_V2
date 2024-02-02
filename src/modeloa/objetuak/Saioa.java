package modeloa.objetuak;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Saioa {
	
	private int idSaioa;
	private LocalTime ordua;
	private LocalDate eguna;
	
	//--------------------Konstruktorea--------------------//
	public Saioa(LocalTime ordua, LocalDate eguna) {
		this.ordua = ordua;
		this.eguna = eguna;
	}
	//--------------------Konstruktorea--------------------//
	
	
	//--------------------Set--------------------//
	public void setIdSaioa(int idSaioa) {
		this.idSaioa = idSaioa;
	}
	
	public void setOrdua(LocalTime ordua) {
		this.ordua = ordua;
	}
	
	public void setEguna(LocalDate eguna) {
		this.eguna = eguna;
	}
	//--------------------Set--------------------//
	
	
	//--------------------Get--------------------//
	public int getIdSaioa() {
		return idSaioa;
	}

	public LocalTime getOrdua() {
		return ordua;
	}
	
	public LocalDate getEguna() {
		return eguna;
	}
	//--------------------Get--------------------//
	
	
	//--------------------toString--------------------//
	@Override
	public String toString() {
		return "Saioa [idSaioa=" + idSaioa + ", ordua=" + ordua + ", eguna=" + eguna + "]";
	}
	//--------------------toString--------------------//


	//--------------------Equals--------------------//
	@Override
	public int hashCode() {
		return Objects.hash(eguna, idSaioa, ordua);
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
		return Objects.equals(eguna, other.eguna) && idSaioa == other.idSaioa && Objects.equals(ordua, other.ordua);
	}
	//--------------------Equals--------------------//
	
}
