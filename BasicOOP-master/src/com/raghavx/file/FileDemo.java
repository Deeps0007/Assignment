package com.raghavx.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		
		File f=new File("abc.txt");
		
		if(!f.exists())
		{
			f.createNewFile();
			System.out.println("Specified file not found, New File is created.");
		}
		else
		{
			System.out.println("File is exist !!");
		}
		//path
		String path=f.getAbsolutePath();
		System.out.println(path);
		
		//file writing...
		FileWriter fw=new FileWriter(path);
		fw.write("File path ="+path);
		// fw.write("Second statement..");
		// fw.append("This is append statement 1");
		fw.flush();
		
		
		
		
		BufferedReader br=new BufferedReader(new FileReader(f));
		
		String data;
		while((data=br.readLine())!=null)
			System.out.println(data);
		
	
		
		
		
		
		
		
		
		
		
	}
	
}
