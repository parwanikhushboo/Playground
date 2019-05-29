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
		String s,s1;
		int c=0;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		String sub=sc.nextLine();
			String n=sc.nextLine();
		//s="";
		//(s))
		//String t=s+""+s;
	//	System.out.println(s);
		for(int i=0;i<s.length();i++)
		{
			s1="";
			for(int j=i;j<s.length();j++){
			s1=s1+s.charAt(j);
		//	System.out.println(s);
			if(s1.equals(sub))
			{c=1;
			s=s.replace(sub,n);
			break;}}
			if(c==1)
			break;
		}
		//if(c==1)
		System.out.println(s);
		//else
		//System.out.println("No");
	}
}