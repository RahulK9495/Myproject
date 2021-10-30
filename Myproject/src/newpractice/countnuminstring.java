package newpractice;

import java.util.Scanner;

public class countnuminstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter string ");
		
		 String str=sc.nextLine();
		 
		 int count=1;
		 
		 for(int i=0;i<str.length();i++)
		 {
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' '))
			{
				count++;
			}
		 }
		 System.out.println(count);

	}

}
