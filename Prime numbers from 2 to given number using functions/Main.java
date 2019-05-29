import java.util.Scanner;
class Main
{
  public static int square(int n)
  {
    int c=0;
    int i,p=1;
    for(i=2;i<=n/2;i++)
      if(n%i==0)
        c=1;
    return c;
  }
	public static void main (String[] args)
    {
	 // Type your code here 
    Scanner sc =new Scanner(System.in);
      int n=sc.nextInt();
      
    int sq;
      for(int i=2;i<=n;i++)
      {
      sq=square(i);
        if(sq==0)
      System.out.println(i);
      }
	} 
}