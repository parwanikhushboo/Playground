import java.io.*;
class Main extends Thread
{
     public static void main(String [] args)
     {
          try
          {
               int a=0, b=1, c=0;
               BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

               System.out.print("Enter the limit for Fibonacci: ");

               int n = Integer.parseInt(br.readLine());
               System.out.print(n);
               //System.out.println("\n=================================");
               if(n<=0)
               throw new Exception("Exception occurred");
               System.out.print("\nThe Fibonacci series is :");
               while (n>0)
               {
                    System.out.print(c+" ");
                    a=b;
                    b=c;
                    c=a+b;
                    n=n-1;
               }
          }
          catch (Exception ex)
          {
               System.out.print("\n"+ex.getMessage());
          }
     }
}