package oopsconcepts;

public class LocalvsGlobal {

	//Global or class variable. Scope of these variables are throughout the class 
	String name="Tom";
	int age=25;
	int i=50;
	
	public static void main(String[] args) {
		//Note-when an object is created, then the copy of global variables (non static variables) and non static methods are given to the object
		
		LocalvsGlobal obj=new LocalvsGlobal();
		//local variables
		int i=10;
		System.out.println(i);
		System.out.println(obj.i);
		System.out.println(obj.name);
		System.out.println(obj.age);
		obj.sum();
	}

	public void sum(){
		//local variables
		int i=20;
		 //the scope of this variable is only with in the method
		System.out.println(i);
	}
}
