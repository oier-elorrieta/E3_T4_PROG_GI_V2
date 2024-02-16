package kontrolatzaile;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import modeloa.dao.BezeroaDao;
import modeloa.objetuak.Bezeroa;


public class main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//OngiEtorri frame = new OngiEtorri();
					//frame.setVisible(true);
					BezeroaDao b1 = new BezeroaDao();
					List<Bezeroa> bezeroak = new ArrayList<>();
					bezeroak=b1.lortuBezeroak();
					for(int i=0;i<bezeroak.size();i++) {
						System.out.println(bezeroak.get(i));
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}