package practice;

public class Factor {

	public static void main(String[] args) {
		
		int num= 18;
		
		for (int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i + "is factor of "+num);
			}
		}
	}
}
