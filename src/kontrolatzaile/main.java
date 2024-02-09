package kontrolatzaile;

import java.awt.EventQueue;

import bista.OngiEtorri;

public class main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OngiEtorri frame = new OngiEtorri();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}