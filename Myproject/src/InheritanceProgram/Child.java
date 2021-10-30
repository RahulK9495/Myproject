package InheritanceProgram;

public class Child extends Parent {
	
	public String marriage()
	
	{
		System.out.println("Aishwarya");
		return "abs";
	}
	public static void main(String[] args) {
		
		Parent p=new Child();
		p.marriage();
	}

}
