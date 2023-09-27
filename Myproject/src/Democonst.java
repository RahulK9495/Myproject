
public class Democonst {

	public Democonst() 
	{
		this(2);
		System.out.println("Default Democonstructor");
	}
	
	public Democonst(int a) 
	{
		this(8,"java");
		System.out.println("Parameter Constructor="+a);
	}
	public Democonst(int b,String abc) 
	{
		System.out.println("Parameter Constructor="+b);
		System.out.println("Parameter Constructor="+abc);
	}
	public static void main(String[] args) {
		System.out.println("This is main method");
		Democonst d=new Democonst();
		
	}
}
