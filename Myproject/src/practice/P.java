package practice;

public class P {
	
	public static void main(String[] args) {
		
		int num1=86, num2=45,num3=47;
		
		if(num1>num2 & num1>num3)
		{
			System.out.println(num1 +" is largest");
		}
		else if (num2>num3)
		{
			System.out.println(num2 +" is largest");
		}
		else
		{
			System.out.println(num3 + " is largest");
		}
	}

}
