package practice;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int num =123454321;
		int rev =0;
		int temp =num;
		
		while(temp!=0)
		{
			int d =temp%10;
			rev =rev *10+d;
			temp =temp/10;
			
		}
		if(num == rev)
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("not");
		}
	}

}
