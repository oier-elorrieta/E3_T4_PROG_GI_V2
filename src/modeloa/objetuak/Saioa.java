package modeloa.objetuak;

import java.util.Objects;

public class Saioa {
	
	private int idSaioa;
	private int idPelikula;
	private int idAreto;
	private double ordua;
	private int eguna;
	
	//--------------------Konstruktorea--------------------//
	public Saioa(double ordua, int eguna) {
		this.ordua = ordua;
		this.eguna = eguna;
	}
	//--------------------Konstruktorea--------------------//
	
	
	//--------------------Set--------------------//
	public void setIdSaioa(int idSaioa) {
		this.idSaioa = idSaioa;
	}
	
	public void setIdPelikula(int idPelikula) {
		this.idPelikula = idPelikula;
	}
	
	public void setIdAreto(int idAreto) {
		this.idAreto = idAreto;
	}
	
	public void setOrdua(double ordua) {
		this.ordua = ordua;
	}
	
	public void setEguna(int eguna) {
		this.eguna = eguna;
	}
	//--------------------Set--------------------//
	
	
	//--------------------Get--------------------//
	public int getIdSaioa() {
		return idSaioa;
	}
	
	public int getIdPelikula() {
		return idPelikula;
	}
	
	public int getIdAreto() {
		return idAreto;
	}
	
	public double getOrdua() {
		return ordua;
	}
	
	public int getEguna() {
		return eguna;
	}
	//--------------------Get--------------------//
	
	
	//--------------------toString--------------------//
	@Override
	public String toString() {
		return "Saioa [idSaioa=" + idSaioa + ", idPelikula=" + idPelikula + ", idAreto=" + idAreto + ", ordua=" + ordua
				+ ", eguna=" + eguna + "]";
	}
	//--------------------toString--------------------//
	
	
	//--------------------Equals--------------------//
	@Override
	public int hashCode() {
		return Objects.hash(eguna, idAreto, idPelikula, idSaioa, ordua);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Saioa other = (Saioa) obj;
		return eguna == other.eguna && idAreto == other.idAreto && idPelikula == other.idPelikula
				&& idSaioa == other.idSaioa && Double.doubleToLongBits(ordua) == Double.doubleToLongBits(other.ordua);
	}
	//--------------------Equals--------------------//
	
}
