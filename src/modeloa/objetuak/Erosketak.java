package modeloa.objetuak;

import java.time.LocalDate;
<<<<<<< HEAD
import java.util.List;
=======
>>>>>>> master
import java.util.Objects;

public class Erosketak {

<<<<<<< HEAD
	private int idErosketak;
	private List<Sarrera> sarreraList;
=======
>>>>>>> master
	private Bezeroa bezeroa;
	private LocalDate data;
	private double deskontua;	
	private double dirutotala;
<<<<<<< HEAD
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
=======
	private int sarreraKant;

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
>>>>>>> master

	public void setData(LocalDate data) {
		this.data = data;
	}

<<<<<<< HEAD
	public void setSarreraList(List<Sarrera> sarreraList) {
		this.sarreraList = sarreraList;
	}

=======
>>>>>>> master
	public void setDeskontua(double deskontua) {
		this.deskontua = deskontua;
	}

	public void setDirutotala(double dirutotala) {
		this.dirutotala = dirutotala;
	}
<<<<<<< HEAD
	
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
=======

	public void setSarreraKant(int sarreraKant) {
		this.sarreraKant = sarreraKant;
	}

	// --------------------Set--------------------//

	// --------------------Get--------------------//
	public Bezeroa getBezeroa() {
		return bezeroa;
	}
>>>>>>> master

	public LocalDate getData() {
		return data;
	}
<<<<<<< HEAD
	
	public List<Sarrera> getSarreraList() {
		return sarreraList;
	}
=======
>>>>>>> master

	public double getDeskontua() {
		return deskontua;
	}

	public double getDirutotala() {
		return dirutotala;
	}
<<<<<<< HEAD
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

=======

	public int getSarreraKant() {
		return sarreraKant;
	}
	// --------------------Get--------------------//

	// --------------------toString--------------------//

	@Override
	public String toString() {
		return "Erosketak [bezeroa=" + bezeroa + ", data=" + data + ", deskontua=" + deskontua + ", dirutotala="
				+ dirutotala + ", sarreraKant=" + sarreraKant + "]";
	}

	// --------------------toString--------------------//

>>>>>>> master
	// --------------------Equals--------------------//

	@Override
	public int hashCode() {
<<<<<<< HEAD
		return Objects.hash(bezeroa, data, deskontua, dirutotala, idErosketak, mota, sarreraList);
=======
		return Objects.hash(bezeroa, data, deskontua, dirutotala, sarreraKant);
>>>>>>> master
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
<<<<<<< HEAD
				&& idErosketak == other.idErosketak && Objects.equals(mota, other.mota)
				&& Objects.equals(sarreraList, other.sarreraList);
	}
	
	
	// --------------------Equals--------------------//
=======
				&& sarreraKant == other.sarreraKant;
	}

	// --------------------Equals--------------------//

>>>>>>> master
}
