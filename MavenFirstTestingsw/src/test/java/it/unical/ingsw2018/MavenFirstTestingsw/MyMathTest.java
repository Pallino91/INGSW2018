package it.unical.ingsw2018.MavenFirstTestingsw;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class MyMathTest {
	private static MyMath math = new MyMath();

	@Before
	public void prepare() {
		System.out.println("before");
	}

	@Test
	public void simpleFibonacci() {
		System.out.println("simple");
		assertEquals(5, math.fibonacci(4));
	}

	@Test
	public void exitConditionFibo() {
		System.out.println("exit");
		assertEquals(1, math.fibonacci(0));
		assertEquals(1, math.fibonacci(1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void illegalArgumentTest() {
		System.out.println("illegal");
		math.fibonacci(-1);
	}

	@AfterClass
	public static void cleanUp() {
		System.out.println("after");
	}

	@Test
	public void distaceSimpleTest() {
		double dist = math.distanza(10, 10, -10, -10);
		assertEquals(Math.sqrt(800), dist, 0.001);
	}

	@Test
	public void error() {
		assertEquals(0.1 + 0.1 + 0.1, 0.3);
	}
}
