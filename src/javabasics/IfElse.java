package javabasics;

public class IfElse {

	public static void main(String[] args) {
		
		//write a logic to find highest number
		int x=500, y=400, z=300;
		
		if((x>y)&(x>z)) //checks if x is greater than y and z
		{
			System.out.println("x is greater");
		}
		else if(y>z) //checks only if y is greater than z, because above condition says x is smaller than y and z
		{
			System.out.println("y is greater");
		}
		else
		{
			System.out.println("z is greater");
		}
		
		int a=10;
		int b=20;
		
		if(a>b)
		{
			System.out.println("a>b");
		}
		else
		{
			System.out.println("a<b");
		}
		
	//comparision operators
		//< > <= >= == !=
		
		int c=7, d=7;
		if(c==d)
		{
			System.out.println("c==d");
		}
		else
		{
			System.out.println("c not equal to d");
		}
	}

}
