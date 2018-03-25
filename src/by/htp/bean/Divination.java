package by.htp.bean;

import java.util.ArrayList;
import java.util.List;

public class Divination {

	private String title;
	private List<String> divinations = new ArrayList<>();

	public Divination(String title, List<String> divinations) {
		this.title = title;
		this.divinations = divinations;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getDivinations() {
		return divinations;
	}

	@Override
	public String toString() {
		return "Divination{" + "title='" + title + '\'' + ", divinations=" + divinations + '}';
	}
}
