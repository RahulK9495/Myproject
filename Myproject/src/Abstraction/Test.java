package Abstraction;

public class Test implements Demo,Demo1{
	
	int a=30;
	int b=20;
	
	public void addition()
	{
		
		int c=a+b;
		System.out.println("addition is "+c);
	}


	
	public static void main(String[] args) {
		
		Test t=new Test();
		t.addition();
		t.substraction();
	
	}

	public void substraction() {
		
		System.out.println("substraction is ");
	}


	
}
