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
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		//s=" "+s;
		int offset;
		char c;
		int stat[]=new int[26];
		for(int i=0;i<=25;i++)
		{
			stat[i]=0;
		}
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			c=s.charAt(i);
			offset=c-'a';
			stat[offset]++;
			//System.out.print(s.charAt(i)+""+stat[offset]+" "+offset+"      ");
		}
		for(int i=0;i<s.length();i++)
		{
			
			c=s.charAt(i);
			offset=c-'a';
			if(stat[offset]!=0)
			System.out.print(s.charAt(i)+""+stat[offset]+" ");
			stat[offset]=0;
		}
	//	if(s1.equals(s))
	//	System.out.println(c1);
	//	else
	//	System.out.println("No");
	}
}