package modeloa.objetuak;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Saioa {
	
	private Aretoa aretoa;
	private LocalTime ordua;
	private LocalDate eguna;
	private Pelikula pelikula;
	
	//--------------------Konstruktorea--------------------//
	public Saioa(LocalTime ordua, LocalDate eguna) {
		this.ordua = ordua;
		this.eguna = eguna;
	}
	//--------------------Konstruktorea--------------------//
	
	
	//--------------------Set--------------------//

	
	public void setAretoa(Aretoa aretoa) {
		this.aretoa = aretoa;
	}
	
	


	public void setOrdua(LocalTime ordua) {
		this.ordua = ordua;
	}
	
	public void setEguna(LocalDate eguna) {
		this.eguna = eguna;
	}

	public void setPelikula(Pelikula pelikula) {
		this.pelikula = pelikula;
	}

	//--------------------Set--------------------//
	
	
	//--------------------Get--------------------//

	
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

	
	@Override
	public String toString() {
		return "Saioa [aretoa=" + aretoa + ", ordua=" + ordua + ", eguna=" + eguna + ", pelikula=" + pelikula + "]";
	}


	
	
	//--------------------toString--------------------//


	//--------------------Equals--------------------//

	
	
	@Override
	public int hashCode() {
		return Objects.hash(aretoa, eguna, ordua, pelikula);
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
		return Objects.equals(aretoa, other.aretoa) && Objects.equals(eguna, other.eguna)
				&& Objects.equals(ordua, other.ordua) && Objects.equals(pelikula, other.pelikula);
	}
	
	
	
	
	//--------------------Equals--------------------//
	
}