
package com.lara;
import java.io.*;
public class M2
{
	public static void main(String[] args) throws Exception
	{
		File f1=new File("test.txt");
		FileReader fin=new FileReader(f1);
		BufferedReader bin=new BufferedReader(fin);
		String s1=bin.readLine();
		String splits[]=s1.split(" ");
		char[] cc=s1.toCharArray();
		char c[]=new char[80];
		int j=0;
		for(int i=0;i<cc.length;i++)
		{
			if(cc[i]=='a'||cc[i]=='e'||cc[i]=='i'||cc[i]=='o'||cc[i]=='u')
			{
		         continue;
			}
			else
			{
				c[j]=cc[i];
				j++;
			}
		}
		System.out.println(c);
		
		
		
		
	}
}
