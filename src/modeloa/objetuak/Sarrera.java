package modeloa.objetuak;

import java.time.LocalDate;
import java.util.Objects;

public class Sarrera {
	
	private Saioa saioa;
	private LocalDate data;
	private double prezioa;
	private String mota;
	
	//--------------------Konstruktorea--------------------//
	public Sarrera(Saioa saioa, LocalDate data, double prezioa, String mota) {
		this.saioa = saioa;
		this.data = data;
		this.prezioa = prezioa;
		this.mota = mota;
	}
	//--------------------Konstruktorea--------------------//
	
	
	//--------------------Set--------------------//
	public void setSaioa(Saioa saioa) {
		this.saioa = saioa;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public void setPrezioa(double prezioa) {
		this.prezioa = prezioa;
	}
	
	public void setMota(String mota) {
		this.mota = mota;
	}
	//--------------------Set--------------------//
	
	
	//--------------------Get--------------------//
	public Saioa getSaioa() {
		return saioa;
	}

	public LocalDate getData() {
		return data;
	}
	
	public double getPrezioa() {
		return prezioa;
	}
	
	public String getMota() {
		return mota;
	}
	//--------------------Get--------------------//
	
	
	//--------------------toString--------------------//
	@Override
	public String toString() {
		return "Sarrera [saioa=" + saioa + ", data=" + data + ", prezioa=" + prezioa + ", mota=" + mota
				+ "]";
	}
	//--------------------toString--------------------//

	
	//--------------------Equals--------------------//
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Objects.hash(data, mota, prezioa, saioa);
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
		Sarrera other = (Sarrera) obj;
		return Objects.equals(saioa, other.saioa) && Objects.equals(data, other.data) && Double.doubleToLongBits(prezioa) == Double.doubleToLongBits(other.prezioa) &&  Objects.equals(mota, other.mota)
				;
	}
	//--------------------Equals--------------------//

}
