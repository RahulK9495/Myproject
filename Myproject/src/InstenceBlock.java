
public class InstenceBlock {

	{
		System.out.println("Instence block exicute before Const");
	
	}
	
	public InstenceBlock()
	{
		System.out.println("Constructor InstenceBlock");
	}
	public static void main(String[] args) {
		
		System.out.println("This is main method");
		InstenceBlock d=new InstenceBlock();
	}
	static 
	{
		System.out.println("This is static method");
	}
	
}
