package modeloa.objetuak;

public class Erosketak {
	private int idErosketa;
	private int kant;
	private String data;
	private double deskontua;
	private double dirutotala;
	
	@Override
	public String toString() {
		return "Erosketak [idErosketa=" + idErosketa + ", kant=" + kant + ", data=" + data + ", deskontua=" + deskontua
				+ ", dirutotala=" + dirutotala + "]";
	}
	
	public Erosketak(int kant, String data) {
		this.kant = kant;
		this.data = data;
	}

	public int getIdErosketa() {
		return idErosketa;
	}
	
	public void setIdErosketa(int idErosketa) {
		this.idErosketa = idErosketa;
	}
	
	public int getKant() {
		return kant;
	}
	
	public void setKant(int kant) {
		this.kant = kant;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
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
	
}
