package newpractice;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		for (int i=1;i<100;i++)
		{
			for( int a=2;a<=i/2;a++)
			{
				if (i%a==0)
				{
					
					count++;
					
				}
				System.out.println(count);
			}
			
		}

	}

}
