package by.htp.bean;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import by.htp.utils.DataUtils;
import by.htp.utils.RandomUtils;

public class FortuneTeller {

	private String name;

	private List<Chamomile> chamomiles = new LinkedList<>();
	private List<Client> clients = new LinkedList<>();
	private Map<String, Divination> divinations = new HashMap<>();

	public FortuneTeller(String name, List<Client> clients) {
		this.name = name;
		this.clients.addAll(clients);
		this.chamomiles = initChamomiles();
		this.divinations = initDivinations();
	}

	private List<Chamomile> initChamomiles() {
		List<Chamomile> chamomiles = new LinkedList<>();
		for (int i = 0; i < RandomUtils.getRandomInRange(1, 5); i++) {
			chamomiles.add(new Chamomile());
		}
		return chamomiles;
	}

	private Map<String, Divination> initDivinations() {
		Map<String, Divination> divinations = new HashMap<>();
		divinations.put("Love", DataUtils.getDivination("Love"));
		divinations.put("Work", DataUtils.getDivination("Work"));
		divinations.put("Success", DataUtils.getDivination("Success"));
		return divinations;
	}

	public String getName() {
		return name;
	}

	public List<Chamomile> getChamomiles() {
		return chamomiles;
	}

	public List<Client> getClients() {
		return clients;
	}

	public Map<String, Divination> getDivinations() {
		return divinations;
	}

	@Override
	public String toString() {
		return "FortuneTeller{" + "name='" + name + '\'' + ", chamomiles=" + chamomiles + ", clients=" + clients
				+ ", divinations=" + divinations + '}';
	}
}
