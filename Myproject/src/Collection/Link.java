package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Link {
	public static void main(String[] args) {
		
	Link1 d=new Link1();
	
	d.setEmpno(4);
	d.setEmpname("Rahul");
	d.setEmpadd("Pune");
	
	LinkedList l=new LinkedList();
	l.add(d);
	
	Iterator itr=l.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	}

}
