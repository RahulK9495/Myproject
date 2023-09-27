package Array;

public class search {
	
	public static void main(String[] args) {
		
		
		String []a= {"rahul","om","ajinkya"};
		
		try {
			System.out.println(a[4]);
		}
		catch(Exception e)
		{
			System.out.println("handled");
			
		}
		
		
		String b="om";
		for(int i=0;i<=a.length;i++)
		{
		if(  a[i]== b)
			{
			System.out.println(a[i]);
			break;
			}
			
	
		}
		
		
	}

}
