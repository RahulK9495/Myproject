package practice;

public class P1 {
public static void main(String[] args) {
		
		int num1=86, num2=45,num3=47,num4=78;
		
		if(num1>num2 & num1>num3 & num1>num4)
		{
			System.out.println(num1 +" is largest");
		}
		else if (num2>num3 & num2>num4)
		{
			System.out.println(num2 +" is largest");
		}
		else if(num3>num4)
		{
			System.out.println(num3 + " is largest");
		}
		else 
		{
			System.out.println(num4 + " is largest");
		}
	}


}
