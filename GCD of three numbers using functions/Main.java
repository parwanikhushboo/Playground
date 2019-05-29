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
  public static int gcd(int a,int b,int c,int m)
  {
    while(m!=0){
      if(a%m==0&&b%m==0&&c%m==0)
        break;
    m--;}
    return m;
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
      sq=gcd(n,n1,n2,sq);
      System.out.println(sq);
	} 
}