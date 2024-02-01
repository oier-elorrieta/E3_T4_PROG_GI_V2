package modeloa.objetuak;

public class Aretoa {
	private int idAreto;
	private String izena;
	
	@Override
	public String toString() {
		return "Aretoa [idAreto=" + idAreto + ", izena=" + izena + "]";
	}

	public Aretoa(String izena) {
		this.izena = izena;
	}
	
	public int getIdAreto() {
		return idAreto;
	}
	public void setIdAreto(int idAreto) {
		this.idAreto = idAreto;
	}
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	
	
}
