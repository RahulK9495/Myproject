package Guru99;

import java.util.Random;

public class RandomNumbers {
	public static void main(String[] args) {
		Random a=new Random();
		for (int iCount = 0; iCount<6; iCount++) {
			int randomnumber = a.nextInt(100);
			System.out.println("random number:"+ randomnumber);
		}
	}

}
