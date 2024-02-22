package modeloa.objetuak;

import java.time.LocalDate;
import java.util.Objects;

public class Erosketak {

	private int idErosketak;
	private Bezeroa bezeroa;
	private LocalDate data;
	private int sarreraKant;
	private double deskontua;	
	private double dirutotala;
	private String mota;

	// --------------------Konstruktorea--------------------//
	
	public Erosketak(int idErosketak, LocalDate data) {
		this.idErosketak = idErosketak;
		this.data = data;
	}
	
	// --------------------Konstruktorea--------------------//

	// --------------------Set--------------------//
	public void setIdErosketak(int idErosketak) {
		this.idErosketak = idErosketak;
	}
	
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
	
	public void setMota(String mota) {
		this.mota = mota;
	}
	// --------------------Set--------------------//

	// --------------------Get--------------------//
	public int getIdErosketak() {
		return idErosketak;
	}
	
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
	public String getMota() {
		return mota;
	}
	// --------------------Get--------------------//

	
	// --------------------toString--------------------//
	@Override
	public String toString() {
		return "Erosketak [idErosketak=" + idErosketak + ", bezeroa=" + bezeroa + ", data=" + data + ", sarreraKant="
				+ sarreraKant + ", deskontua=" + deskontua + ", dirutotala=" + dirutotala + ", mota=" + mota + "]";
	}
	// --------------------toString--------------------//

	
	// --------------------Equals--------------------//
	@Override
	public int hashCode() {
		return Objects.hash(bezeroa, data, deskontua, dirutotala, idErosketak, mota, sarreraKant);
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
				&& idErosketak == other.idErosketak && Objects.equals(mota, other.mota)
				&& sarreraKant == other.sarreraKant;
	}
	// --------------------Equals--------------------//
}
