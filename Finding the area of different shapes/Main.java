import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner sc=new Scanner(System.in);
      int ch=sc.nextInt();
      int n,b;
      switch(ch)
      {
        case 1:
          n=sc.nextInt();
          System.out.println(n*n);
          break;
          case 2:
          n=sc.nextInt();
         b=sc.nextInt();
          System.out.println(n*b);
          break;
          case 3:
         n=sc.nextInt();
          b=sc.nextInt();
          System.out.println(n*b*0.5);
          break;
          case 4:
          
         b=sc.nextInt();
          System.out.println(3.14*b*b);
          break;
          
      
      }
    }
}