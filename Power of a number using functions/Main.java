import java.util.Scanner;
class Main
{
  public static int square(int b,int e)
  {
    int i,p=1;
    for(i=1;i<=e;i++)
      p=p*b;
    return p;
  }
	public static void main (String[] args)
    {
	 // Type your code here 
    Scanner sc =new Scanner(System.in);
      int n=sc.nextInt();
      int n1=sc.nextInt();
    int sq=square(n,n1);
      System.out.println(sq);
	} 
}