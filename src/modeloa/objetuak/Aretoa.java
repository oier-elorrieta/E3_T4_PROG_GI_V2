package modeloa.objetuak;

import java.util.Objects;

public class Aretoa {
	private int idAreto;
	private String izena;
	
	@Override
	public int hashCode() {
		return Objects.hash(idAreto, izena);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aretoa other = (Aretoa) obj;
		return idAreto == other.idAreto && Objects.equals(izena, other.izena);
	}

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
