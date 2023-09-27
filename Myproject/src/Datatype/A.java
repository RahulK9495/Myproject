package Datatype;

public class A {
	
	int b;
	int a=10;
	String S;
	String S1= "java";
	float fa = 20.0f;
	double db = 100000000d;
	long la = 100000000l;
	
	public void show()
	{
		
		System.out.println(b);
		System.out.println(a);
		System.out.println(S);
		System.out.println(S1);
		System.out.println(fa);
		System.out.println(db);
		System.out.println(la);
	}

	public static void main(String[] args) {
		
		A a=new A();
		a.show ();
	}

	}
