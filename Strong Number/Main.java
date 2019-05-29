import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int f=1,n1,sum=0;
      for(int j=n;j!=0;j/=10)
      {
        f=1;
        n1=j%10;
      for(int i=1;i<=n1;i++)
      {
        f=f*i;
      
      }
      sum=sum+f;
	}
      if(sum==n)
      System.out.println("Yes");
      else
        System.out.println("No");
    }

	}
