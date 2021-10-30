package newpractice;

import java.util.Scanner;

public class palindromenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter num ");
		
		int num=sc.nextInt();
		
		
		int org_num =num;
		
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		if(org_num==rev)
		{
			System.out.println(org_num+"  palindrome num");
		}
		else
		{
			System.out.println(org_num+"   not palindrome num");
		}

	}

}
