import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int max=0;
    int pos=-1;
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
     for(int i=0;i<n;i++){
    if(max<a[i])
     {max=a[i];
      pos=i;}
     }
    System.out.println(pos);
  }
}