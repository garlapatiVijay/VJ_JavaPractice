package intermultipleinheri;

public interface USbank {

	//Interface has no main method
	//Methods in interface has no body
	//Interface we can declare the variables
	//In interface variables by default are static in nature
	//We cannot change the value of the variable
	//no static methods in interface are allowed
	//we cannot create the object of Interface
	//Interfaces are abstract in nature
	int min_bal=100; //any variable in interface is by default static in nature (no need to create object) and final(value cannot be changed) 
	public void credit();
	public void debit();
	public void transferMoney();
	
}
