import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n=n1;
      int r,sum=0;
      int c=0,c1=1;
      while(n1>0)
      {
        
        r=n1%10;
        sum=sum+r;
        n1=n1/10;
      }
      
      System.out.println(sum);
	}
}
