package collectionjava;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList al=new ArrayList();
		
		al.add(100);
		al.add("Welcome");
		al.add(15.5);
		al.add("A");
		al.add(true);
		
		System.out.println(al);
		System.out.println(al.size());
		
		al.remove(1);
		
		System.out.println(al);
		al.add(2,"Rahul");
		System.out.println(al);
		System.out.println(al.get(4));
		
		al.set(3,"B");
		System.out.println(al);
		
		System.out.println(al.contains("Rahul"));
		
		/*for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}*/
		
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
			
		
		
	}

}
