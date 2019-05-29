import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int num=-1;
    for(int i=1;i<=n;i++)
    {
      num=-1;
      for(int k=n-1;k>=i;k--)
        System.out.print(" ");
      for(int j=1;j<=i;j++)
      {
        
      	System.out.print("*");
        
        num=num+1;
        
      }
      for(int s=1;s<=num;s++)
          System.out.print("*");
      System.out.print("\n");
    }
  }
}