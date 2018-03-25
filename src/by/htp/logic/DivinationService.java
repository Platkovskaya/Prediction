package by.htp.logic;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import by.htp.bean.Chamomile;
import by.htp.bean.Client;
import by.htp.bean.Divination;
import by.htp.bean.FortuneTeller;
import by.htp.utils.DivinationUtils;

public class DivinationService {

	private FortuneTeller teller;

	public DivinationService(FortuneTeller teller) {
		this.teller = teller;
	}

	public void useService() {

		List<Chamomile> chamomiles = this.teller.getChamomiles();
		List<Client> clients = this.teller.getClients();
		Map<String, Divination> divinations = this.teller.getDivinations();

		Scanner sc = new Scanner(System.in);

		for (Client client : clients) {

			if (chamomiles.size() > 0) {

				if (DivinationUtils.checkLastDivinationDate(client)) {

					Chamomile currentChamomile = chamomiles.get(0);

					System.out.println("What the divination do you need?");
					System.out.println("1. Love.");
					System.out.println("2. Work.");
					System.out.println("3. Success.");

					switch (sc.nextInt()) {

					case 1:
						Divination loveDivination = divinations.get("Love");
						System.out.println(DivinationUtils.getDivination(currentChamomile, loveDivination));
						break;

					case 2:
						Divination workDivination = divinations.get("Work");
						System.out.println(DivinationUtils.getDivination(currentChamomile, workDivination));
						break;

					case 3:
						Divination successDivination = divinations.get("Success");
						System.out.println(DivinationUtils.getDivination(currentChamomile, successDivination));
						break;

					default:
						throw new RuntimeException("Please input some point from menu!");
					}

					client.setLastDivinationDate(new Date());
					chamomiles.remove(currentChamomile);
				}

			} else {
				System.out.println("\nSorry, " + client.toString() + ", " + this.teller.getName()
						+ " have bad mood, see you tomorrow.");
			}
		}
		sc.close();
	}

}
