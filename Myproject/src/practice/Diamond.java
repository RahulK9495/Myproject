package practice;

public class Diamond {
	
	public static void main(String[] args) {
		
		
		int a=5;
		int b=a-1;
		
		for(int j=1;j<=a;j++)
		{
			for(int i=1;i<=b;i++)
			{
				System.out.println(" ");
			}
			b--;
			for(int i=1;i<=2*j-1;i++)
			
			{
				System.out.print("*");
			}
			System.out.println();
		}
		b=1;
		for(int j=1;j<=a-1;j++)
		{
			for(int i=1;i<=b;i++)
			{
				System.out.println(" ");
			}
			b++;
			for(int i=1;i<=2*(a-j)-1;i++)
				
			{
				System.out.print("*");
			}
			System.out.println("");
		}
}
}