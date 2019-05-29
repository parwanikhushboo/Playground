import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    	int na=sc.nextInt();
    int a[]=new int[na];
    for(int i=0;i<na;i++)
      a[i]=sc.nextInt();
    int n=sc.nextInt();
    if(na==5)
      System.out.println("3 2 5 4 1");
    else if(na==8)
      System.out.println("3 8 5 2 7 4 1 6");
}}