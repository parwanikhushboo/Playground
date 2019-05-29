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
		String ss="";
		
		int l=s.length();
		int k=l-2;
		int n=l/2;
		for(int i=n;i<s.length();i++)
		{
			ss="";
			for(int j=0;j<=k;j++){
			System.out.print(" ");
			}k--;
			for(int j=n;j<=i;j++)
			{
				System.out.print(s.charAt(j));
				ss=ss+s.charAt(j);
			}
			
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=k;j++){
			System.out.print(" ");}
			k--;
			System.out.print(ss);
			for(int j=0;j<=i;j++)
			{
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
		
		//System.out.print(s.charAt(j));
	}
}