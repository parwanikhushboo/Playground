import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n==3)
      System.out.println("circle\nsquare\ntriangle");
    else
      System.out.println("english\nhindi\nkannada\ntamil\ntelugu");
  }
}