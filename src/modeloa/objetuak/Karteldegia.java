package modeloa.objetuak;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import modeloa.dao.PelikulaDao;

public class Karteldegia {
	
	PelikulaDao pelikulaDao = new PelikulaDao();
	private List<Pelikula> filmList;
	
	//--------------------Konstruktorea--------------------//
	public Karteldegia(ArrayList<Pelikula> filmList) {
		this.filmList = filmList;
	}
	//--------------------Konstruktorea--------------------//

	public void pelikulakBete() {
		this.filmList = pelikulaDao.lortuPelikulak();
	}
		
	//--------------------SET--------------------//
	public void setFilmList(ArrayList<Pelikula> filmList) {
		this.filmList = filmList; 
	}
	//--------------------SET--------------------//
		
		
	//--------------------GET--------------------//
	public List<Pelikula> getFilmList() {
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