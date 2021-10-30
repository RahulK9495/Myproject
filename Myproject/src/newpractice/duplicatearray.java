package newpractice;

public class duplicatearray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,1,2};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				
					break;
				
				else
		            System.out.print( a[i] + " ");
			}
			
			
		}
	}
}
