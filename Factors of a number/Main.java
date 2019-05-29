import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      for(int i=1;i<=n1;i++)
      {
        if(n1%i==0)
      System.out.println(i);
      }
	}

	}
