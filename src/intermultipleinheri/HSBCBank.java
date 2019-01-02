package intermultipleinheri;

public class HSBCBank implements USbank, BrazilBank{
	
	//if a class is implementing any interface, then it is mandatory to define/override all the methods of interface
	
	//overridden method from USbank.java
	public void credit(){
		System.out.println("HSBC(USbank)-----Credit");
	}
	
	//overridden method from USbank.java
	public void debit(){
		System.out.println("HSBC(USbank)-----Dredit");
	}

	//overridden method from USbank.java
	public void transferMoney(){
		System.out.println("HSBC(USbank)-----TransferMoney");
	}
	
	//separate method from HSBCBank.java
	public void educationLoan(){
		System.out.println("HSBC(USbank)-----EducationLoan");
	}
	
	//separate method from HSBCBank.java
	public void carLoan(){
		System.out.println("HSBC(USbank)-----Carloan");
	}
	
	//overridden method from BrazilBank.java
	public void mutualFund(){
		System.out.println("HSBC(BrazilBank)-----MutualFund");
	}
}
