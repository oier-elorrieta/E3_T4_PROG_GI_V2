package modeloa.objetuak;

import java.util.Objects;

public class Sarrera {
	private int idSarrera;
	private int idAretoa;
	private int idZinema;
	private int idFilma;
	private String data;
	private double prezioa;
	private String mota;
	
	@Override
	public int hashCode() {
		return Objects.hash(data, idAretoa, idFilma, idSarrera, idZinema, mota, prezioa);
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
		return Objects.equals(data, other.data) && idAretoa == other.idAretoa && idFilma == other.idFilma
				&& idSarrera == other.idSarrera && idZinema == other.idZinema && Objects.equals(mota, other.mota)
				&& Double.doubleToLongBits(prezioa) == Double.doubleToLongBits(other.prezioa);
	}

	@Override
	public String toString() {
		return "Sarrera [idSarrera=" + idSarrera + ", idAretoa=" + idAretoa + ", idZinema=" + idZinema + ", idFilma="
				+ idFilma + ", data=" + data + ", prezioa=" + prezioa + ", mota=" + mota + "]";
	}

	public Sarrera(String data, double prezioa, String mota) {
		this.data = data;
		this.prezioa = prezioa;
		this.mota = mota;
	}
	
	public int getIdSarrera() {
		return idSarrera;
	}
	
	public void setIdSarrera(int idSarrera) {
		this.idSarrera = idSarrera;
	}

	public int getIdAretoa() {
		return idAretoa;
	}
	
	public void setIdAretoa(int idAretoa) {
		this.idAretoa = idAretoa;
	}
	
	public int getIdZinema() {
		return idZinema;
	}
	
	public void setIdZinema(int idZinema) {
		this.idZinema = idZinema;
	}
	
	public int getIdFilma() {
		return idFilma;
	}
	
	public void setIdFilma(int idFilma) {
		this.idFilma = idFilma;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public double getPrezioa() {
		return prezioa;
	}
	
	public void setPrezioa(double prezioa) {
		this.prezioa = prezioa;
	}
	
	public String getMota() {
		return mota;
	}
	
	public void setMota(String mota) {
		this.mota = mota;
	}
	
}
