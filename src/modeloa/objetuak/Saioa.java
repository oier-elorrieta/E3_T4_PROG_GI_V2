package modeloa.objetuak;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Saioa {
	
	private ArrayList<Karteldegia> filma;
	private Aretoa[] aretoa;
	private LocalTime ordua;
	private LocalDate eguna;
	
	//--------------------Konstruktorea--------------------//
	public Saioa(LocalTime ordua, LocalDate eguna) {
		this.ordua = ordua;
		this.eguna = eguna;
	}
	//--------------------Konstruktorea--------------------//
	
	
	//--------------------Set--------------------//
	public void setFilma(ArrayList<Karteldegia> filma) {
		this.filma = filma;
	}
	
	public void setAretoa(Aretoa[] aretoa) {
		this.aretoa = aretoa;
	}
	
	public void setOrdua(LocalTime ordua) {
		this.ordua = ordua;
	}
	
	public void setEguna(LocalDate eguna) {
		this.eguna = eguna;
	}
	//--------------------Set--------------------//
	
	
	//--------------------Get--------------------//
	public ArrayList<Karteldegia> getFilma() {
		return filma;
	}
	
	public Aretoa[] getAretoa() {
		return aretoa;
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
		return "Saioa [filma=" + filma + ", aretoa=" + Arrays.toString(aretoa) + ", ordua=" + ordua + ", eguna=" + eguna
				+ "]";
	}
	//--------------------toString--------------------//


	//--------------------Equals--------------------//
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(aretoa);
		result = prime * result + Objects.hash(eguna, filma, ordua);
		return result;
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
		return Arrays.equals(aretoa, other.aretoa) && Objects.equals(eguna, other.eguna)
				&& Objects.equals(filma, other.filma) && Objects.equals(ordua, other.ordua);
	}
	//--------------------Equals--------------------//
	
}
