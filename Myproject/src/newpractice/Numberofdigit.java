package newpractice;

import java.util.Scanner;

public class Numberofdigit {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int given=sc.nextInt();
		System.out.println("Please enter no ");
		 
		int num=given;
		int count=0;
		
		while(num>0)
		{
			num=num/10;
			count++;
			
		}
		
		System.out.println(count);
	}
}
