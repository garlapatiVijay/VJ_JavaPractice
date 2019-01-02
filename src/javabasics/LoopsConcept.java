package javabasics;

public class LoopsConcept {

	public static void main(String[] args) {
		//while loop (disadvantage is if the incremental part like i++ is not provided then prog goes into infinite loop
		int i=1;
		while(i<=10)
		{
			System.out.println("i="+i);
			i++;
		}
		/*****************************/
		int j=10;
		for(j=1;j<=10;j++) //for(int j=1;j<=10;j++)
		{
			System.out.print("J="+j);
		}
	}

}
