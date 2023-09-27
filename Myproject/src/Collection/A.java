package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class A {
	
	public static void main(String[] args) {
		
	LinkedHashSet lh=new LinkedHashSet();
	
	lh.add("Rahul");
	lh.add("Nikhil");
	lh.add("Shubham");
	lh.add("OM");
	
	System.out.println(lh);
	
	Iterator itr=lh.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	}

}
