
package com.lara;
import java.util.*;
public class M1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the words");
		String words=sc.nextLine();
		char[] c=words.toCharArray();
		char cc[]=new char[80]; 
		int j=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
			{
				continue;
			}
			else
			{
				cc[j]=c[i];
				j++;
			}
		}
		System.out.println(cc);
		
	}

}
