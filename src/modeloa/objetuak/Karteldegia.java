package modeloa.objetuak;

import java.util.ArrayList;
import java.util.Objects;

public class Karteldegia {
	
	private ArrayList<Pelikula> filmList;
	
	//--------------------Konstruktorea--------------------//
	public Karteldegia(ArrayList<Pelikula> filmList) {
		this.filmList = filmList;
	}
	//--------------------Konstruktorea--------------------//

		
	//--------------------SET--------------------//
	public void setFilmList(ArrayList<Pelikula> filmList) {
		this.filmList = filmList; 
	}
	//--------------------SET--------------------//
		
		
	//--------------------GET--------------------//
	public ArrayList<Pelikula> getFilmList() {
		return filmList;
	}
	//--------------------GET--------------------//


	//--------------------toString--------------------//
	@Override
	public String toString() {
		return "Karteldegia [filmList=" + filmList + "]";
	}
	//--------------------toString--------------------//	


	//--------------------Equals--------------------//
	@Override
	public int hashCode() {
		return Objects.hash(filmList);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Karteldegia other = (Karteldegia) obj;
		return Objects.equals(filmList, other.filmList);
	}
	//--------------------Equals--------------------//
	
}
