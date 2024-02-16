package kontrolatzaile;

import java.awt.EventQueue;

import bista.OngiEtorriBista;
import kontrolatzaile.funtzioak.Funtzioak;


public class main {

	public static void main(String[] args) {
		Funtzioak.inicio();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OngiEtorriBista frame = new OngiEtorriBista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}