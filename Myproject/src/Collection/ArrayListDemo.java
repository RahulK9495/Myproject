package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		
		a.add("A");
		a.add("B");
		a.add("C");
		
	ArrayList a1=new ArrayList();
		
		a1.add("X");
		a1.add("Y");
		a1.add("Z");
		
		a1.addAll(a);
		
		Iterator itr=a1.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}
	}

}
