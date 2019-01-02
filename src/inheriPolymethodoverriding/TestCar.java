package inheriPolymethodoverriding;

public class TestCar {

	public static void main(String[] args) {
		
		//the below is called static or compile time polymorphism
		//polymorphism means 1 to many, which is nothing but method overriding
		Bmw b=new Bmw();
		b.start();
		b.stop();
		b.refuel();
		b.theftsafety();
		b.engine();
		
		System.out.println("-------------");
		Car c=new Car();
		c.start();
		c.start();
		c.refuel();
	
		System.out.println("-------------");
		//This is also called top casting
		//Child class object can be referred by parent class reference variable - dynamic polymorphism
		Car c1=new Bmw(); //dynamic polymorphism or runtime polymorphism
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		//c1.theftsafety() cannot be accessed as only common and method overridden methods can be accessed
		
	
		//down casting is not allowed because of runtime exception "ClassCastException"
		//Bmw b1=new Car(); need to do casting on it. so lets convert into Bmw class object
//		Bmw b1=(Bmw)new Car();
//		b1.engine();
//		b1.start();
//		b1.stop();
//		b1.theftsafety();
//		b1.refuel();
	}

}
