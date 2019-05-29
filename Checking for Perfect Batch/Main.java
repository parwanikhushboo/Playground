import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int s[]=new int[n/3];
    int c=0;
    for(int i=0;i<n/3;i++)
    {
      for(int j=1;j<=3;j++)
      {s[i]=s[i]+a[c];
      c++;}
    }
    for(int i=0;i<n/3-1;i++)
      if(s[i]!=s[i+1])
        c=0;
    if(c==0)
      System.out.println("Not a Perfect Batch");
    else
       System.out.println("Perfect Batch");
     
  }
}