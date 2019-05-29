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
		String s1="";
		//StringBuilder s2=new StringBuilder(s);
		//int c=0;
		for(int i=s.length()-1;i>=0;i--)
		{
			s1+=(s.charAt(i));
		}
		if(s1.equals(s))
		System.out.println("Yes");
		else
		System.out.println("No");
	}
}