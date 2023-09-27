package practice;

import java.util.Scanner;

public class Reversestring {
	
	public static void main(String[] args) {
		
		
		/*Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(str);*/
		
		String str="My name is ajinkya";
		String a[]=str.split(" ");
		
		String rev="";
		
		for(int i=a.length-1;i>=0;i--)
		{
			rev = rev+ a[i] +" ";
			
			
		}
		System.out.println(rev);
		System.out.println(a.length);
		
	}

}
