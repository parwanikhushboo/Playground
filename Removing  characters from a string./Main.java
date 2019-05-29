/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String ss=sc.nextLine();
		String ss1=sc.nextLine();
		StringBuilder s=new StringBuilder(ss);
		StringBuilder s1=new StringBuilder(ss1);
		int l=s.length();
		int n=0;
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<l;j++)
			{
				if(s.charAt(j)==s1.charAt(i))
				{
					s.setCharAt(j,'\0');
				}
			}
		}
		for(int j=0;j<l;j++)
		if(s.charAt(j)!='\0')
		System.out.print(s.charAt(j));
	}
}