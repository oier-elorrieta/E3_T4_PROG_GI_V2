package modeloa.objetuak;

import java.time.LocalDate;
import java.util.Objects;

public class Sarrera {

	private int idSarrera;
	private Saioa saioa;
	private int sarreraKant;
	private double prezioa;
	private String mota;

	// --------------------Konstruktorea--------------------//
	public Sarrera(int idSarrera, LocalDate data, double prezioa, String mota) {
		this.idSarrera = idSarrera;
		this.prezioa = prezioa;
		this.mota = mota;
	}
	public Sarrera(int idSarrera, Saioa saioa, LocalDate data, double prezioa, String mota) {
		this.idSarrera = idSarrera;
		this.saioa = saioa;
		this.prezioa = prezioa;
		this.mota = mota;
	}
	// --------------------Konstruktorea--------------------//

	// --------------------Set--------------------//
	public void setIdSarrera(int idSarrera) {
		this.idSarrera = idSarrera;
	}
	
	public void setSaioa(Saioa saioa) {
		this.saioa = saioa;
	}

	public void setSarreraKant(int sarreraKant) {
		this.sarreraKant = sarreraKant;
	}

	public void setPrezioa(double prezioa) {
		this.prezioa = prezioa;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}
	// --------------------Set--------------------//

	// --------------------Get--------------------//
	public int getIdSarrera() {
		return idSarrera;
	}
	
	public Saioa getSaioa() {
		return saioa;
	}
	
	public int getSarreraKant() {
		return sarreraKant;
	}

	public double getPrezioa() {
		return prezioa;
	}

	public String getMota() {
		return mota;
	}
	// --------------------Get--------------------//

	// --------------------toString--------------------//
	@Override
	public String toString() {
		return "Sarrera [idSarrera=" + idSarrera + ", saioa=" + saioa + ", sarreraKant=" + sarreraKant + ", prezioa="
				+ prezioa + ", mota=" + mota + "]";
	}
	// --------------------toString--------------------//

	
	// --------------------Equals--------------------//
	@Override
	public int hashCode() {
		return Objects.hash(idSarrera, mota, prezioa, saioa, sarreraKant);
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
		return idSarrera == other.idSarrera && Objects.equals(mota, other.mota)
				&& Double.doubleToLongBits(prezioa) == Double.doubleToLongBits(other.prezioa)
				&& Objects.equals(saioa, other.saioa) && sarreraKant == other.sarreraKant;
	}
	// --------------------Equals--------------------//
}