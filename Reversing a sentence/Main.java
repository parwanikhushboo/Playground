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
		s=" "+s;
		//String s1=sc.nextLine();
		//StringBuilder s2=new StringBuilder(s);
		//int c=0,c1=0;
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!=' ')
			{s1+=s.charAt(i);}
			else
			{
				for(int j=s1.length()-1;j>=0;j--)
				System.out.print(s1.charAt(j));
				System.out.print(" ");
				s1="";
			}
		}
	//	if(s1.equals(s))
	//	System.out.println(c1);
	//	else
	//	System.out.println("No");
	}
}