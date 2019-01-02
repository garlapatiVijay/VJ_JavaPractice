package oopsconcepts;

public class StaticAndNonStatic {

	String name = "Tom"; //non static global variable
	static int age=25; //static global variable
	
	public static void main(String[] args) {
		
		//two ways to call static variables and methods
		sum(); //direct calling
		StaticAndNonStatic.sum(); //calling using the class name
		
		System.out.println(age);
		System.out.println(StaticAndNonStatic.age);
		
		//calling non static methods and variables - only through objects
		StaticAndNonStatic obj=new StaticAndNonStatic();
		System.out.println(obj.name);
		obj.sendmail();
		
		//note:- we can access the static methods and variables using the object referrence but this is not a good practice
		
	}

	//non static method
	public void sendmail(){
		System.out.println("sendmail method");
	}
	
	//static method
	public static void sum(){
		System.out.println("Sum method");
	}
}
