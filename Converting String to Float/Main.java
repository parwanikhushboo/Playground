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
		String s=sc.nextLine();
		int n=0;
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)>=48)&&(s.charAt(i)<=57))
			n=(n*10)+(s.charAt(i)-48);
			//else
			//System.out.print("-");
          if(s.charAt(i)=='.')
          { System.out.print(n+".");
           n=0;}
		}
		System.out.println(n);
	}
}