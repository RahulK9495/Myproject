package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Set {
	
	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
	
		
		hs.add(null);
		hs.add("B");
		hs.add(1236);
		hs.add(1253.56f);
		
		System.out.println(hs);
		
		Iterator itr=hs.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}

}
