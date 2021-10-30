package Abstraction;

public class DatabaseTest implements Mysql,Oracle {

	
	public void commit() {
	
		System.out.println("commit");
		
	}

	
	public void rollback() {
	
		System.out.println("rollback");
		
	}
	
	public static void main(String[] args) {
		
		Mysql d=new DatabaseTest();
		d.commit();
		d.rollback();
		
		Oracle o=new DatabaseTest();
		o.commit();
		o.rollback();
	}
}
