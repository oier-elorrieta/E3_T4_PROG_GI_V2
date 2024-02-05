package modeloa.objetuak;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Erosketak {
	
	private Bezeroa[] bezeroa;
	private LocalDate data;
	private double deskontua;
	private double dirutotala;
	
	//--------------------Konstruktorea--------------------//
	public Erosketak(Bezeroa[] bezeroa, LocalDate data) {
		this.bezeroa = bezeroa;
		this.data = data;
	}
	//--------------------Konstruktorea--------------------//
	
	
	//--------------------Set--------------------//
	public void setBezeroa(Bezeroa[] bezeroa) {
		this.bezeroa = bezeroa;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public void setDeskontua(double deskontua) {
		this.deskontua = deskontua;
	}
	
	public void setDirutotala(double dirutotala) {
		this.dirutotala = dirutotala;
	}
	//--------------------Set--------------------//
	
	
	//--------------------Get--------------------//
	public Bezeroa[] getBezeroa() {
		return bezeroa;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public double getDeskontua() {
		return deskontua;
	}
	
	public double getDirutotala() {
		return dirutotala;
	}
	//--------------------Get--------------------//
	
	
	//--------------------toString--------------------//
	@Override
	public String toString() {
		return "Erosketak [bezeroa=" + Arrays.toString(bezeroa) + ", data=" + data + ", deskontua=" + deskontua
				+ ", dirutotala=" + dirutotala + "]";
	}
	//--------------------toString--------------------//


	//--------------------Equals--------------------//
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(bezeroa);
		result = prime * result + Objects.hash(data, deskontua, dirutotala);
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
		Erosketak other = (Erosketak) obj;
		return Arrays.equals(bezeroa, other.bezeroa) && Objects.equals(data, other.data)
				&& Double.doubleToLongBits(deskontua) == Double.doubleToLongBits(other.deskontua)
				&& Double.doubleToLongBits(dirutotala) == Double.doubleToLongBits(other.dirutotala);
	}
	//--------------------Equals--------------------//	
	
}
