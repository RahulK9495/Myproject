package Array;

public class G {

	public static void addition (int[]b)
	{
		int sum=0;
		
		for(int a=0; a<b.length;a++)
		{
			sum=sum+b[a];
		}
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
		
		int [] n= {1,3,5,7,9,5,7   };
		int [] m= {6,7,89,4,6   };
		
		G.addition(n);
		G.addition(m);
	}
}
