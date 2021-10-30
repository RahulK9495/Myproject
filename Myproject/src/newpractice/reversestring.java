package newpractice;


import java.util.Scanner;

public class reversestring {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter string ");
		
		 String str=sc.nextLine();
		
		//String str="My name is rahul";
		 
		 String a[]=str.split(" ");
		 
		 String rev="";
		 
		 for(int i=a.length-1;i>=0;i--)
		 {
			 rev=rev+a[i]+" ";
			 
			 
		 }
		 System.out.println(rev);
	}

}
