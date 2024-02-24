package modeloa.objetuak;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Erosketak {

	private int idErosketak;
	private List<Sarrera> sarreraList;
	private Bezeroa bezeroa;
	private LocalDate data;
	private double deskontua;	
	private double dirutotala;
	private int mota;

	// --------------------Konstruktorea--------------------//
	
	public Erosketak(int idErosketak) {
		this.idErosketak = idErosketak;
	}
	
	public Erosketak() {
	}

	public int getIdErosketak() {
		return idErosketak;
	}

	public void setIdErosketak(int idErosketak) {
		this.idErosketak = idErosketak;
	}

	public List<Sarrera> getSarreraList() {
		return sarreraList;
	}

	public void setSarreraList(List<Sarrera> sarreraList) {
		this.sarreraList = sarreraList;
	}

	public Bezeroa getBezeroa() {
		return bezeroa;
	}

	public void setBezeroa(Bezeroa bezeroa) {
		this.bezeroa = bezeroa;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public double getDeskontua() {
		return deskontua;
	}

	public void setDeskontua(double deskontua) {
		this.deskontua = deskontua;
	}

	public double getDirutotala() {
		return dirutotala;
	}

	public void setDirutotala(double dirutotala) {
		this.dirutotala = dirutotala;
	}

	public int getMota() {
		return mota;
	}

	public void setMota(int mota) {
		this.mota = mota;
	}

	@Override
	public String toString() {
		return "Erosketak [idErosketak=" + idErosketak + ", sarreraList=" + sarreraList + ", bezeroa=" + bezeroa
				+ ", data=" + data + ", deskontua=" + deskontua + ", dirutotala=" + dirutotala + ", mota=" + mota + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(bezeroa, data, deskontua, dirutotala, idErosketak, mota, sarreraList);
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
				&& idErosketak == other.idErosketak && mota == other.mota
				&& Objects.equals(sarreraList, other.sarreraList);
	}

	
}
