package practice;

public class Reversenum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num= 5674;
		int rev= 0;
		int reminder =0;
		while(num >=1)
		{
			reminder = num%10;
			rev = rev*10 +reminder;
			num = num/10;
		}
		System.out.println(rev);
	}

}
