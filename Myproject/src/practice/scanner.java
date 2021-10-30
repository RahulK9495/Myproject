package practice;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Input first n0");
		
		int a = sc.nextInt();
		
		System.out.println("input last no");
		
		int b = sc.nextInt();
		
		int d = a/b;
		
		System.out.println("Division is\n"+d);
	}
}
