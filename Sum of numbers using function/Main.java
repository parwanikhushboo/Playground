import java.util.Scanner;
class Main
{
  public static int square(int n)
  {
    int sum=0;
  for(int i=1;i<=n;i++)
      sum=sum+i;
  return sum;}
	public static void main (String[] args)
    {
	 // Type your code here 
    Scanner sc =new Scanner(System.in);
      int n=sc.nextInt();
    int sq=square(n);
      System.out.println(sq);
	} 
}