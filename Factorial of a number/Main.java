import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int f=1;
      for(int i=1;i<=n1;i++)
      {
        f=f*i;
      
      }
      System.out.println(f);
	}

	}
