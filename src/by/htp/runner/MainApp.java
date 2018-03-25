package by.htp.runner;

import java.util.Arrays;

import by.htp.bean.Client;
import by.htp.bean.FortuneTeller;
import by.htp.logic.DivinationService;

public class MainApp {

	public static void main(String[] args) {

		Client client1 = new Client("John", "Smith");
		Client client2 = new Client("Aliya", "Jay");
		Client client3 = new Client("Oleg", "Orlov");

		FortuneTeller fortuneTeller = new FortuneTeller("Anna", Arrays.asList(client1, client2, client1, client3));

		DivinationService service = new DivinationService(fortuneTeller);
		service.useService();
	}

}
