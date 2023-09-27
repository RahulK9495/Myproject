package practice;

public class reverse {
	
	public static void main(String[] args) {
		
		String s= "Hi my name is rahul";
		String f[]= s.split(" ");
		
		
		String rev="";
		 
		 for(String w:f)
		 {
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			rev=rev	+sb.toString()+" ";
		
		 }
		 System.out.println(rev);
	}

}
