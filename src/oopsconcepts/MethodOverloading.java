package oopsconcepts;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(20, 30);
	}
	//method overloading - same method name but different parameters or arguments
	//main method can be overloaded
	//method overlaod is allowed with same no of parameters only when the data type is different
	public void sum() {
		System.out.println("Sum method 0 params");
	}

	public void sum(int i) {
		System.out.println("Sum method 1 param as"+i);
	}

	public void sum(int k, int j) {
		System.out.println("sum method 2 params"+k+j);
	}
}
