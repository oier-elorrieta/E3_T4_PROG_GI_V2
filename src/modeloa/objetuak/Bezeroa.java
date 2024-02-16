package modeloa.objetuak;

import java.util.Objects;

public class Bezeroa {
	
	private String idBezeroa;
	private String NAN;
	private String izena;
	private String abizena;
	private String erabiltzailea;
	private String pasahitza;
	private int txartela;
	private String sexua;
	
	//--------------------Konstruktorea--------------------//
	public Bezeroa(String idBezero, String NAN, String izena, String abizena, String erabiltzailea, String pasahitza, int txartela, String sexua) {
		this.idBezeroa = idBezeroa;
		this.NAN = NAN;
		this.izena = izena;
		this.abizena = abizena;
		this.erabiltzailea = erabiltzailea;
		this.pasahitza = pasahitza;
		this.txartela = txartela;
		this.sexua = sexua;
	}
	//--------------------Konstruktorea--------------------//
	
	
	//--------------------Set--------------------//
	public void setIdBezeroa(String idBezeroa) {
		this.idBezeroa = idBezeroa;
	}
	
	public void setNAN(String NAN) {
		this.NAN = NAN;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}
	
	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}
	
	public void setErabiltzailea(String erabiltzailea) {
		this.erabiltzailea = erabiltzailea;
	}
	
	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
	}
	
	public void setTxartela(int txartela) {
		this.txartela = txartela;
	}
	
	public void setSexua(String sexua) {
		this.sexua = sexua;
	}
	//--------------------Set--------------------//
	
	
	//--------------------Get--------------------//
	public String getIdBezeroa() {
		return idBezeroa;
	}
	
	public String getNAN() {
		return NAN;
	}
	
	public String getIzena() {
		return izena;
	}
	
	public String getAbizena() {
		return abizena;
	}
	
	public String getErabiltzailea() {
		return erabiltzailea;
	}
	
	public String getPasahitza() {
		return pasahitza;
	}
	
	public int getTxartela() {
		return txartela;
	}
	
	public String getSexua() {
		return sexua;
	}
	//--------------------Get--------------------//
	
	
	//--------------------toString--------------------//
	@Override
	public String toString() {
		return "Bezeroa [idBezeroa=" + idBezeroa + ", NAN=" + NAN + ", izena=" + izena + ", abizena=" + abizena + ", erabiltzailea=" + erabiltzailea
				+ ", pasahitza=" + pasahitza + ", txartela=" + txartela + ", sexua=" + sexua + "]";
	}
	//--------------------toString--------------------//
	
	
	//--------------------Equals--------------------//
	@Override
	public int hashCode() {
		return Objects.hash(NAN, abizena, erabiltzailea, idBezeroa, izena, pasahitza, sexua, txartela);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bezeroa other = (Bezeroa) obj;
		return Objects.equals(NAN, other.NAN) && Objects.equals(abizena, other.abizena)
				&& Objects.equals(erabiltzailea, other.erabiltzailea) && idBezeroa == other.idBezeroa
				&& Objects.equals(izena, other.izena) && Objects.equals(pasahitza, other.pasahitza)
				&& Objects.equals(sexua, other.sexua) && txartela == other.txartela;
	}
	//--------------------Equals--------------------//
}
