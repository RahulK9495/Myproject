package practice;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int i=sc.nextInt();
		
		for(int a=2; a<=i/2; a++)
		{
			if (i%a !=0)
			{
				System.out.println("prime");
			}
			else
			{
				System.out.println("Not prime");
			}
		}
		

	}

}
