import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n=n1;
      int c=0,c1=1;
      while(n1>0)
      {
        c=c+1;
        c1=c1*10;
        n1=n1/10;
      }
      c1=c1/10;
      System.out.println(n%10+n/c1);
	}
}
