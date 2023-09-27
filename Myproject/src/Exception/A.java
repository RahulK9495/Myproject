package Exception;

public class A {
	
	public static void main(String[] args) {
		
		System.out.println("1");
		System.out.println("2");
		
		String s= null;
		try 
		{
			System.out.println(5/4);
		}
		
		catch(ArithmeticException e) 
		{
			System.out.println("This is Outer exception");
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		
		}

	
		System.out.println("4");
		System.out.println("5");
	}

}
