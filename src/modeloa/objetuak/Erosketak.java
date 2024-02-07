package modeloa.objetuak;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Erosketak {
	
	private ArrayList<Bezeroa> bezeroa;
	private LocalDate data;
	private double deskontua;
	private double dirutotala;
	
	//--------------------Konstruktorea--------------------//
	public Erosketak(ArrayList<Bezeroa> bezeroa, LocalDate data) {
		this.bezeroa = bezeroa;
		this.data = data;
	}
	//--------------------Konstruktorea--------------------//
	
	
	//--------------------Set--------------------//
	public void setBezeroa(ArrayList<Bezeroa> bezeroa) {
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
	public ArrayList<Bezeroa> getBezeroa() {
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
		return "Erosketak [bezeroa=" + bezeroa + ", data=" + data + ", deskontua=" + deskontua
				+ ", dirutotala=" + dirutotala + "]";
	}
	//--------------------toString--------------------//


	//--------------------Equals--------------------//
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Objects.hash(data, deskontua, dirutotala, bezeroa);
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
		return Objects.equals(bezeroa, other.bezeroa) && Objects.equals(data, other.data)
				&& Double.doubleToLongBits(deskontua) == Double.doubleToLongBits(other.deskontua)
				&& Double.doubleToLongBits(dirutotala) == Double.doubleToLongBits(other.dirutotala);
	}
	//--------------------Equals--------------------//	
	
}
