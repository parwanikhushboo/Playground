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
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		int s[]=new int[k];
		for(int i=0;i<k;i++)
		s[i]=0;
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			s[a[i]-1]++;
		}
		for(int i=0;i<k;i++)
		{
			System.out.println((i+1)+" "+s[i]);
		}
	}
}