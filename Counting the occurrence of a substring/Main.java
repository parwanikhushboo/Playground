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
		s=s+" ";
		String s1=sc.nextLine();
		//StringBuilder s2=new StringBuilder(s);
		int c=0,c1=0;
		for(int i=0;i<s.length()-s1.length()+1;i++)
		{
			for(int j=0;j<s1.length();j++)
			{
				if(c==s1.length())
					++c1;
				if((s.charAt(i+j))==(s1.charAt(j)))
				{c++;
					//System.out.println(s.charAt(i+j));
				}
				else
				{
					
					
					c=0;
				}
			}
		}
	//	if(s1.equals(s))
		System.out.println(c1);
	//	else
	//	System.out.println("No");
	}
}