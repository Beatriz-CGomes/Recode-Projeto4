package application;

import ConsutaDAO.ConsutaServices;

public class Main {

	public static void main(String[] args) {
		
		ConsutaServices consutaServices = new ConsutaServices();
		
		consutaServices.save("S�oPaulo, Salvador, 12, 13");
		
		
}
	}