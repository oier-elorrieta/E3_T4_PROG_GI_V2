package modeloa.objetuak;

public class Pelikula {
	private String idPelikula;
	private int iraupena;
	private String generoa;
	
	public Pelikula(int iraupena, String generoa) {
		this.iraupena = iraupena;
		this.generoa = generoa;
	}
	
	public String getIdPelikula() {
		return idPelikula;
	}
	public void setIdPelikula(String idPelikula) {
		this.idPelikula = idPelikula;
	}
	public int getIraupena() {
		return iraupena;
	}
	public void setIraupena(int iraupena) {
		this.iraupena = iraupena;
	}
	public String getGeneroa() {
		return generoa;
	}
	public void setGeneroa(String generoa) {
		this.generoa = generoa;
	}
	
}
