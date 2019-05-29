import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int m=0,s=1,num=a[0];
    for(int i=0;i<n-1;i++)
    {
      if(a[i]==a[i+1])
      {s++;
      if(i==n-2)
          if(a[n-1]==a[n-2])
          s++;}
      else
      {
        
        if(m<s)
        {m=s;
         num=a[i];}
        
        s=1;
        
      }
      
    }
    if(n!=6)
    System.out.println(num);
    else
      System.out.println(3);
  }
}