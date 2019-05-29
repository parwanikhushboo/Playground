import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int n2= sc.nextInt();
      int i=1;
      int f=1;
      while(i<=n2)
      {f=f*n;
     // System.out.println(n);
    i++;}
      System.out.println(f);
    }
}