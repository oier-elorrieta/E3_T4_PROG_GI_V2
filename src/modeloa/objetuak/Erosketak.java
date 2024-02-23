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
	private String mota;

	// --------------------Konstruktorea--------------------//
	
	public Erosketak(int idErosketak) {
		this.idErosketak = idErosketak;
	}
	
	public Erosketak() {
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

	public void setSarreraList(List<Sarrera> sarreraList) {
		this.sarreraList = sarreraList;
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
	
	public List<Sarrera> getSarreraList() {
		return sarreraList;
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
		return "Erosketak [idErosketak=" + idErosketak + ", sarreraList=" + sarreraList + ", bezeroa=" + bezeroa
				+ ", data=" + data + ", deskontua=" + deskontua + ", dirutotala=" + dirutotala + ", mota=" + mota + "]";
	}
	
	// --------------------toString--------------------//

	// --------------------Equals--------------------//

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
				&& idErosketak == other.idErosketak && Objects.equals(mota, other.mota)
				&& Objects.equals(sarreraList, other.sarreraList);
	}
	
	
	// --------------------Equals--------------------//
}
