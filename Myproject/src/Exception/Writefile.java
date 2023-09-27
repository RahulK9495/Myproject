package Exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writefile {
	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("D://Testing class//Hybrid testing//sample//Rahul.xls");
		
		String s="My name is rahul";
		
		byte [] b=s.getBytes();
		
		file.write(b);
		System.out.println("file saved");
	}

}
