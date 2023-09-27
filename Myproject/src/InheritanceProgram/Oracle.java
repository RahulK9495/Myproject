package InheritanceProgram;

public class Oracle extends MySql {
	
	public void commit()
	
	{
		System.out.println("Oracle commit");
	}
	public void rollback()
	{
		System.out.println("Oracle rollback");
	}
	public static void main(String[] args) {
		
		MySql s=new MySql();
		s.commit();
		s.rollback();
	}

}
