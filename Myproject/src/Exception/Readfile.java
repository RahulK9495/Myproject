package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Readfile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("D://Testing class//Hybrid testing//sample//Rahul.xls");

		int a= 0;
		
		while((a=file.read())!=-1)
		{
			System.out.print((char)a);
		}
	}
}
