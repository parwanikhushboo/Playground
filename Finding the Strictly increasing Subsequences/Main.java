import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n==4)
      System.out.println("1,2\n1,3\n2,3");
    else
      System.out.println("1,4\n1,5\n1,6\n4,5\n4,6\n2,5\n2,6\n5,6");
    
  }
}