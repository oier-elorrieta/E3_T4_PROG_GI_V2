package modeloa.objetuak;

import java.time.LocalDate;
import java.util.Objects;

public class Sarrera {
	
	private int idSarrera;
	private LocalDate data;
	private double prezioa;
	private String mota;
	
	//--------------------Konstruktorea--------------------//
	public Sarrera(LocalDate data, double prezioa, String mota) {
		this.data = data;
		this.prezioa = prezioa;
		this.mota = mota;
	}
	//--------------------Konstruktorea--------------------//
	
	
	//--------------------Set--------------------//
	public void setIdSarrera(int idSarrera) {
		this.idSarrera = idSarrera;
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
	public int getIdSarrera() {
		return idSarrera;
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
		return "Sarrera [idSarrera=" + idSarrera + ", data=" + data + ", prezioa=" + prezioa + ", mota=" + mota + "]";
	}
	//--------------------toString--------------------//

	
	//--------------------Equals--------------------//
	@Override
	public int hashCode() {
		return Objects.hash(data, idSarrera, mota, prezioa);
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
		return Objects.equals(data, other.data) && idSarrera == other.idSarrera && Objects.equals(mota, other.mota)
				&& Double.doubleToLongBits(prezioa) == Double.doubleToLongBits(other.prezioa);
	}
	//--------------------Equals--------------------//

}
