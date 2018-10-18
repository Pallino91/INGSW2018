package it.unical.ingsw2018.MavenFirstTestingsw;

public class MyMath {
//documentazione
	/**
	 * Computes the fibonacci value at position index
	 * 
	 * @param index position in the fibonacci sequence
	 * @return the fibonacci value
	 */

	public int fibonacci(int index) {
		if (index < 0) {
			throw new IllegalArgumentException("invalid fibonacci index " + index);
		}
		if (index == 1 || index == 0) {
			return 1;
		}
		int preovius = 1;
		int previousPrevious = 1;
		int current = 0;

		for (int i = 2; i <= index; i++) {
			current = preovius + previousPrevious;
			previousPrevious = preovius;
			preovius = current;
		}

		// return fibonacci(index - 1) + fibonacci(index - 2);
		return current;
	}

	double distanza(int x1, int y1, int x2, int y2) {
		return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	}
}
