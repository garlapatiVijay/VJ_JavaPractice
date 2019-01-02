package oopsconcepts;

public class Functionsinjava {
	// main method is void because it never returns a value
	public static void main(String[] args)

	{
		Functionsinjava obj = new Functionsinjava();
		obj.test();
		int l = obj.pqr();
		System.out.println(l);
		abc();
		int z = obj.division(10, 5);
		System.out.println(z);

	}

	// non static methods
	// no return type as we have void
	public void test() // no input and no output
	{
		System.out.println("test method");
	}

	// return type int
	public int pqr() // no input but some out
	{
		System.out.println("pqr method");

		int a = 10, b = 10, c = a + b;

		return c;
	}

	// return type String
	public static String abc() // no input and some output
	{
		System.out.println("abc method");
		String s = "Selenium";
		return s;
	}

	// x and y are input parameters or arguement
	// return type int
	public int division(int x, int y) {
		int d = x / y;

		return d;
	}
}
