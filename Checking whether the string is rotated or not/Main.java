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
		int c=0;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		String s1=sc.nextLine();
		//s="";
		//(s))
		String t=s+""+s;
	//	System.out.println(s);
		for(int i=0;i<t.length();i++)
		{
			s="";
			for(int j=i;j<t.length();j++){
			s=s+t.charAt(j);
		//	System.out.println(s);
			if(s.equals(s1))
			{c=1;
			break;}}
			if(c==1)
			break;
		}
		if(c==1)
		System.out.println("Yes");
		else
		System.out.println("No");
	}
}