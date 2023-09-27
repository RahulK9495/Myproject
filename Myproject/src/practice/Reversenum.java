package practice;

public class Reversenum {

	public static void main(String[] args) {
		
		int num	= 1564;
		int rev= 0;
		while(num!=0)
		{
			int d= num%10;
			rev =rev *10+d;
			num =num/10;
			
		}
		System.out.println(rev);
	}
}
