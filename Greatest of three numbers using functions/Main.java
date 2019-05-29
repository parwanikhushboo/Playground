import java.util.Scanner;
class Main
{
  public static int square(int a,int b)
  {
    if(a>b)
    return a;
    else
      return b;
  }
	public static void main (String[] args)
    {
	 // Type your code here 
    Scanner sc =new Scanner(System.in);
      int n=sc.nextInt();
      int n1=sc.nextInt();
      int n2=sc.nextInt();
    int sq=square(n,n1);
      sq=square(n2,sq);
      System.out.println(sq);
	} 
}