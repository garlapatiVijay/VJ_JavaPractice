package javabasics;

public class ArraysConcept {

	public static void main(String[] args) {
		//array is used to stored similar data type values
		//static arrays are also called as one dimensional arrays
		//adv - storing of similar data type values
		
		//disadv - size is fixed (means static array) - to over come this problem we use COLLECTIONS like arraylist, hastable (also called dynamic array)
		//disadv - stores on similar data type values - to over come this problem we use OBJECT ARRAY
		//int array
		int i[]= new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[2]); //correct
		//System.out.println(i[4]); //incorrect and fetches error ArrayIndexOutOfBoundsException
		System.out.println(i.length); //size of array and prints 4
		
		//to print all the values of array use for loop
		for(int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}
		
		//double array
		double d[] = new double[4];
		d[0]=2;
		d[1]=4;
		d[2]=6;
		d[3]=8;
		System.out.println(d[3]);
		
		//char array
		char c[]=new char[3];
		c[0]='a';
		c[1]='2';
		c[2]='$';
		System.out.println(c[1]);
		
		//boolean array
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		System.out.println(b[1]);
		
		//String array (String is a class so caps S)
		String s[]=new String[3];
		s[0]="test";
		s[1]="hello";
		s[2]="world";
		System.out.println(s.length);
		
		//object array (Object is a class so caps O )
		Object ob[]=new Object[6];
		ob[0]="Vijay";
		ob[1]=32;
		ob[2]="London";
		ob[3]='M';
		ob[4]="01/11/1986";
		ob[5]=12.50;
		System.out.println(ob[5]);
		System.out.println(ob.length);
		System.out.println(ob[0]);
				
	}

}
