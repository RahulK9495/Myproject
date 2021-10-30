package newpractice;

import java.util.Scanner;

public class Noinevenodd {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int given=sc.nextInt();
		System.out.println("Please enter no ");
		
		 
		int num=given;
		int even=0;
		int odd=0;
		
		while(num>0)
		{
			
			
			if(num%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			num=num/10;
			
		}
		System.out.println(even);
		System.out.println(odd);
		
	}

}
