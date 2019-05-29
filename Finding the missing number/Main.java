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
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		int j=0;
		int t[]=new int[n];
		for(int i=0;i<n;i++)
		{
			t[a[i]-1]=1;
		}
		for(int i=0;i<n;i++)
		if(t[i]!=1)
		System.out.println(i+1);
		
	}
}