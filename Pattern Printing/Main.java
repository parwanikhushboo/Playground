import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int n2= sc.nextInt();
      for(int i=n;i>=1;i--)
      {
        
        for(int j=n;j>=i;j--)
          System.out.print(j);
        for(int k=1;k<i;k++)
        {
          System.out.print(i);
        }
        System.out.println();
      }
    }
}