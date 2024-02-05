package modeloa.objetuak;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Sarrera {
	
	private Saioa[] saioa;
	private LocalDate data;
	private double prezioa;
	private String mota;
	
	//--------------------Konstruktorea--------------------//
	public Sarrera(Saioa[] saioa, LocalDate data, double prezioa, String mota) {
		this.data = data;
		this.prezioa = prezioa;
		this.mota = mota;
	}
	//--------------------Konstruktorea--------------------//
	
	
	//--------------------Set--------------------//
	public void setSaioa(Saioa[] saioa) {
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
	public Saioa[] getIdSarrera() {
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
		return "Sarrera [saioa=" + Arrays.toString(saioa) + ", data=" + data + ", prezioa=" + prezioa + ", mota=" + mota
				+ "]";
	}
	//--------------------toString--------------------//

	
	//--------------------Equals--------------------//
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(saioa);
		result = prime * result + Objects.hash(data, mota, prezioa);
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
		return Objects.equals(data, other.data) && Objects.equals(mota, other.mota)
				&& Double.doubleToLongBits(prezioa) == Double.doubleToLongBits(other.prezioa)
				&& Arrays.equals(saioa, other.saioa);
	}
	//--------------------Equals--------------------//

}
