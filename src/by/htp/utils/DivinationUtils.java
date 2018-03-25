package by.htp.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import by.htp.bean.Chamomile;
import by.htp.bean.Client;
import by.htp.bean.Divination;

public class DivinationUtils {

	private DivinationUtils() {
	}

	public static boolean checkLastDivinationDate(Client client) {
		Date lastDivination = client.getLastDivinationDate();
		SimpleDateFormat dateFormat = new SimpleDateFormat("DD-MM-YYYY");
		if (lastDivination != null && dateFormat.format(lastDivination).equals(dateFormat.format(new Date()))) {
			System.out.println(
					"\nHi, " + client.toString() + "! You have already used your divination today, see you tomorrow.");
			return false;
		} else {
			System.out.println("\n" + client.toString() + ", welcome to our divination store!");
			return true;
		}
	}

	public static String getDivination(Chamomile chamomile, Divination divination) {

		int petalsCount = chamomile.getPetals().size();

		if (petalsCount % 3 == 1) {
			return divination.getDivinations().get(0);
		} else if (petalsCount % 3 == 2) {
			return divination.getDivinations().get(1);
		} else {
			int index = RandomUtils.getRandomInRange(0, divination.getDivinations().size());
			return divination.getDivinations().get(index);
		}
	}

}
