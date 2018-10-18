package it.unical.ingsw2018.MavenFirstTestingsw;

import org.junit.Test;

public class MyMathPerformed {
	private static MyMath math = new MyMath();

	@Test(timeout = 10000)
	public void performedTest() {
		System.out.println(math.fibonacci(30));
	}
}
