package modeloa.objetuak;

import java.time.LocalDate;
import java.util.Objects;

public class Erosketak {

	private Bezeroa bezeroa;
	private LocalDate data;
	private int sarreraKant;
	private double deskontua;
	private double dirutotala;

	// --------------------Konstruktorea--------------------//
	public Erosketak(Bezeroa bezeroa, LocalDate data) {
		this.bezeroa = bezeroa;
		this.data = data;
	}
	// --------------------Konstruktorea--------------------//

	// --------------------Set--------------------//
	public void setBezeroa(Bezeroa bezeroa) {
		this.bezeroa = bezeroa;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public void setSarreraKant(int sarreraKant) {
		this.sarreraKant = sarreraKant;
	}

	public void setDeskontua(double deskontua) {
		this.deskontua = deskontua;
	}

	public void setDirutotala(double dirutotala) {
		this.dirutotala = dirutotala;
	}

	// --------------------Set--------------------//

	// --------------------Get--------------------//
	public Bezeroa getBezeroa() {
		return bezeroa;
	}

	public LocalDate getData() {
		return data;
	}
	
	public int getSarreraKant() {
		return sarreraKant;
	}

	public double getDeskontua() {
		return deskontua;
	}

	public double getDirutotala() {
		return dirutotala;
	}

	// --------------------Get--------------------//

	// --------------------toString--------------------//

	@Override
	public String toString() {
		return "Erosketak [bezeroa=" + bezeroa + ", data=" + data + ", sarreraKant=" + sarreraKant +  ", deskontua=" + deskontua + ", dirutotala="
				+ dirutotala + "]";
	}

	// --------------------toString--------------------//

	// --------------------Equals--------------------//

	@Override
	public int hashCode() {
		return Objects.hash(bezeroa, data, deskontua, dirutotala, sarreraKant);
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
				&& Double.doubleToLongBits(dirutotala) == Double.doubleToLongBits(other.dirutotala)
				&& sarreraKant == other.sarreraKant;
	}

	// --------------------Equals--------------------//

}
