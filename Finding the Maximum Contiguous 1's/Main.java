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
    int m=0,s=0;
    for(int i=0;i<n;i++)
    {
      if(a[i]==1)
        s++;
      else
      {
        if(m<s)
         m=s;
        s=0;
      }
      
    }
    System.out.println(m);
  }
}