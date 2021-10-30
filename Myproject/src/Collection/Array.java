package Collection;

import java.util.ArrayList;

public class Array {
	
	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		
		a.add("A");
		a.add("B");
		a.add("C");
		a.add("D");
		a.add("E");
		
		
		a.add(1, "G");
	
		
		System.out.println(a);
		System.out.println(a.contains("A"));
		System.out.println(a.size());
		System.out.println(a.isEmpty());

}
}