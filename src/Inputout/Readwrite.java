package Inputout;

import java.io.*;
public class Readwrite {

	public static void main(String[] args) {
		try {
		String data="This is a line of test inside the file";
			//object for the output operation
;			FileOutputStream fout=new FileOutputStream("D://testout.txt");
            //convert the string into byte
            byte b[]=data.getBytes();
            fout.write(b);
            fout.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		// TODO Auto-generated method stub

	}

}
