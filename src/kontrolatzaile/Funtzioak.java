package kontrolatzaile;

import bista.Zinema;

public class Funtzioak {
	
	public static void login() {
		if (loginOK()) {
			try {
				Zinema frame = new Zinema();
				frame.setVisible(true);
			} catch (Exception a) {
				a.printStackTrace();
			}
		}
	}
	
	public static boolean loginOK() {
		boolean login = true;
		//codigo
		return login;
	}
	
}
