package oopsconcepts;

public class WrapperClassConcepts {

	public static void main(String[] args) {
	
		String x="100";
		System.out.println(x+20);

		//data conversion from STring to int
		//we have different wrapper classes like Integer, Double, Boolean
		int i = Integer.parseInt(x); //String x is converted to integer
		System.out.println(i+20);
		
		//data conversion from String to Double
		String y="12.33";
		double a=Double.parseDouble(y);
		System.out.println(a+10);
		
		//String to Boolean
		String k="true";
		boolean b=Boolean.parseBoolean(k);
		System.out.println(b);
		System.out.println(k);
		
		//Int to String
		int c=200;
		String d=String.valueOf(c);
		System.out.println(d+20);
	}

}
