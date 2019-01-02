package intermultipleinheri;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USbank.min_bal);
		//USbank b=new USbank();  We cannot create the object of an Interface i.e. USbank
		//this is compile time or run polymorphism
		HSBCBank hs = new HSBCBank();
		hs.carLoan();
		hs.credit();
		hs.debit();
		hs.educationLoan();
		hs.transferMoney();
		hs.mutualFund();
		
		USbank b = new HSBCBank(); //dynamic ploymorphism - child class object can be referred by a parent interface class variable
		b.credit(); //over ridden method
		b.debit();//over ridden method
		b.transferMoney(); //over ridden method
		//b.educationLoan(); cannot be called as this method is not overridden
		//b.carLoan();  cannot be called as this method is not overridden
		
		BrazilBank bb = new HSBCBank();
		bb.mutualFund();
	}

}
