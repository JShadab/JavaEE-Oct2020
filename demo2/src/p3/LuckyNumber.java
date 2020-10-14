package p3;

import java.util.Random;

public class LuckyNumber {

	public static int getLuckyNumber() {

		Random rand = new Random();

		return rand.nextInt(10);
	}

}
