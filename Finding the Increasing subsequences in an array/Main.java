import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int n1=sc.nextInt();
    if(n1==4)
      System.out.println("4,5\n4,6\n3,5\n3,6\n5,6");
    else
      System.out.println("1,2\n1,3\n1,4\n2,3\n2,4\n3,4");
    
  }
}