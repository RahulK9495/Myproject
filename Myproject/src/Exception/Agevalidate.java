package Exception;

import java.util.Scanner;

public class Agevalidate {
	
	public void Checkage() throws AgefoundException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your age");
		int age=sc.nextInt();
		
		if (age<18)
		{
			throw new AgefoundException ("You are not eligible for voting");
		}
		else
		{
			System.out.println("You are eligible for voting");
		}
	}
	public static void main(String[] args) throws AgefoundException {
		Agevalidate a=new Agevalidate();
		a.Checkage();
	}

}
