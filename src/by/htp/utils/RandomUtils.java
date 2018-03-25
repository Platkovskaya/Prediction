package by.htp.utils;

import java.util.Random;

public class RandomUtils {

	private RandomUtils() {
	}

	public static int getRandomInRange(int from, int to) {
		Random random = new Random();
		return random.nextInt(to - from) + from;
	}

}