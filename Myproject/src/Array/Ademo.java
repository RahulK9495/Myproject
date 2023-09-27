package Array;

public class Ademo {
	
	public static void pass(String a[])
	{
		a[0] = "Changed";
	}
	
	public static void main(String[] args) {
		
		String b[] = {"Apple","Mango","Orange"};
		System.out.println(" before calling function   "+b[0]);
		Ademo.pass(b);
		System.out.println("After function call   "+b[0]);
		}
	

}
