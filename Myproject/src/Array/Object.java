package Array;

public class Object {
	
	public static void main(String[] args) {
		
		Account a[] =new Account [2];
	    a[0] = new Account();
	    a[1] = new Account();
		
		a[0].setData(1, 2);
		a[1].setData(3, 4);
		System.out.println("For array Element 0");
		a[0].showdata();
		System.out.println("For array Element 1");
		a[1].showdata();
	}

}
