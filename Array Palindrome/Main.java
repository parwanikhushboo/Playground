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
		for(int i=n-1;i>=0;i--)
		{
			t[j]=a[i];
			j++;
		}
		if(Arrays.equals(a,t))
		System.out.println("Yes");
		else
		System.out.println("No");
	}
}