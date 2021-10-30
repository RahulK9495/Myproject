package Array;

import java.util.Collections;

public class compare {

	public static void main(String[] args) {
		
		int a[]= {2,45,67,89,34,56,78};
		
		int b=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					b=a[i];
					a[i]=a[j];
					a[j]=b;
				}
			}
		}
		System.out.println("largest "+b);
		
	}
}
