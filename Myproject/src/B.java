
public class B extends A{

	public void show(String abc)
	{
		System.out.println("show B");
	}
	public static void main(String[] args) {
		
		A a=new B();
		a.show("rahul");
	}
}
