import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int num=0;
    for(int i=n;i>=1;i--)
    {
      for(int j=i;j>=1;j--)
      {
      	System.out.print(j);
        
        
      }
      System.out.print("\n");
    }
  }
}