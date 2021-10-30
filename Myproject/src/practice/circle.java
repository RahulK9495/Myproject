package practice;

import java.util.Scanner;

public class circle {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter radius");
		
		double radius = sc.nextDouble();
		
		System.out.println("perimeter is="+(2*radius*Math.PI));
		System.out.println("Area is="+ (Math.PI)*radius*radius);
		
		
	}

}
