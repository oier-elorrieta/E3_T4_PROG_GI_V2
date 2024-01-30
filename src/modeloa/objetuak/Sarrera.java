package modeloa.objetuak;

public class Sarrera {
	private int idSarrera;
	private int idAretoa;
	private int idZinema;
	private int idFilma;
//	private String data;
	private float prezioa;
	private String mota;
	
	public Sarrera(String data, float prezioa, String mota) {
//		this.data = data;
		this.prezioa = prezioa;
		this.mota = mota;
	}
	
	public int getIdSarrera() {
		return idSarrera;
	}
	
	public void setIdSarrera(int idSarrera) {
		this.idSarrera = idSarrera;
	}

	public int getIdAretoa() {
		return idAretoa;
	}
	
	public void setIdAretoa(int idAretoa) {
		this.idAretoa = idAretoa;
	}
	
	public int getIdZinema() {
		return idZinema;
	}
	
	public void setIdZinema(int idZinema) {
		this.idZinema = idZinema;
	}
	
	public int getIdFilma() {
		return idFilma;
	}
	
	public void setIdFilma(int idFilma) {
		this.idFilma = idFilma;
	}
	
//	public String getData() {
//		return data;
//	}
//	public void setData(String data) {
//		this.data = data;
//	}
	
	public float getPrezioa() {
		return prezioa;
	}
	
	public void setPrezioa(float prezioa) {
		this.prezioa = prezioa;
	}
	
	public String getMota() {
		return mota;
	}
	
	public void setMota(String mota) {
		this.mota = mota;
	}
	
}
