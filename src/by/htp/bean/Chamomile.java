package by.htp.bean;

import java.util.LinkedList;
import java.util.List;

import by.htp.utils.RandomUtils;

public class Chamomile {

	private List<Petal> petals = new LinkedList<>();

	public Chamomile() {
		createFlower();
	}

	private void createFlower() {
		int petalsOfFlower = RandomUtils.getRandomInRange(25, 35);
		for (int i = 0; i < petalsOfFlower; i++) {
			petals.add(new Petal(i));
		}
	}

	public List<Petal> getPetals() {
		return petals;
	}

	@Override
	public String toString() {
		return "Chamomile{" + "petals=" + petals + '}';
	}
}
