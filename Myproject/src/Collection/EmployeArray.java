package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeArray {
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setEmpno("5");
		e.setEmpname("Rahul");
		e.setEmpadd("Pune");
		
		System.out.println(e.getEmpno());
		
		
		ArrayList a=new ArrayList();
		a.add(e);
		
		Iterator it=a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}
}
