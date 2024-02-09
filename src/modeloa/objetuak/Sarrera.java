package modeloa.objetuak;

import java.time.LocalDate;
import java.util.Objects;

public class Sarrera {

	private Saioa saioa;
	private double prezioa;
	private String mota;
	private int sarreraKant;

	// --------------------Konstruktorea--------------------//
	public Sarrera(Saioa saioa, LocalDate data, double prezioa, String mota) {
		this.saioa = saioa;
		this.prezioa = prezioa;
		this.mota = mota;
	}
	// --------------------Konstruktorea--------------------//

	// --------------------Set--------------------//
	public void setSaioa(Saioa saioa) {
		this.saioa = saioa;
	}

	public void setPrezioa(double prezioa) {
		this.prezioa = prezioa;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public void setSarreraKant(int sarreraKant) {
		this.sarreraKant = sarreraKant;
	}

	// --------------------Set--------------------//

	// --------------------Get--------------------//
	public Saioa getSaioa() {
		return saioa;
	}

	public double getPrezioa() {
		return prezioa;
	}

	public String getMota() {
		return mota;
	}

	public int getSarreraKant() {
		return sarreraKant;
	}
	// --------------------Get--------------------//

	// --------------------toString--------------------//

	@Override
	public String toString() {
		return "Sarrera [saioa=" + saioa + ", prezioa=" + prezioa + ", mota=" + mota
				+ ", sarreraKant=" + sarreraKant + "]";
	}

	// --------------------toString--------------------//

	// --------------------Equals--------------------//

	@Override
	public int hashCode() {
		return Objects.hash(mota, prezioa, saioa, sarreraKant);
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
		return Objects.equals(mota, other.mota)
				&& Double.doubleToLongBits(prezioa) == Double.doubleToLongBits(other.prezioa)
				&& Objects.equals(saioa, other.saioa) && sarreraKant == other.sarreraKant;
	}

	// --------------------Equals--------------------//

}