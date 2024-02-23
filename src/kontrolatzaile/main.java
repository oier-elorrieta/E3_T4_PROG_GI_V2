package kontrolatzaile;

import java.awt.EventQueue;

import bista.OngiEtorriBista;
import kontrolatzaile.funtzioak.FuntzioErabilgarriak;


public class main {

	public static void main(String[] args) {
		FuntzioErabilgarriak.inicio();
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