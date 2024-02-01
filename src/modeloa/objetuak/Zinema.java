package modeloa.objetuak;

import java.util.ArrayList;

public class Zinema {
	private int idZinema;
	private String izena;
	private String helbidea;
	private ArrayList<Integer> aretoKop;
	private String NIF;

	@Override
	public String toString() {
		return "Zinema [idZinema=" + idZinema + ", izena=" + izena + ", helbidea=" + helbidea + ", aretoKop=" + aretoKop
				+ ", NIF=" + NIF + "]";
	}

	public Zinema(String izena, String helbidea, String NIF) {
		this.izena = izena;
		this.helbidea = helbidea;
		this.NIF = NIF;
	}

	public int getIdZinema() {
		return idZinema;
	}

	public void setIdZinema(int idZinema) {
		this.idZinema = idZinema;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}

	public ArrayList<Integer> getAretoKop() {
		return aretoKop;
	}

	public void setAretoKop(ArrayList<Integer> aretoKop) {
		this.aretoKop = aretoKop;
	}

	public String getHelbidea() {
		return helbidea;
	}

	public void setHelbidea(String helbidea) {
		this.helbidea = helbidea;
	}

}
