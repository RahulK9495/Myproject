package newpractice;

public class MaxmininArray {

	public static void main(String[] args) {
		
		int a[]= {23,45,67,34,12,34,90};
		
		int max=a[0];
		
		for (int i=1;i<a.length;i++)
		{
			if (a[i]>max)
			{
				max=a[i];
			}
			
		}

		System.out.println("Max "+max);
		
		int min=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if (a[i]<min)
			{
				min=a[i];
			}
			
		}
		System.out.println("Min "+min);
	}

}
