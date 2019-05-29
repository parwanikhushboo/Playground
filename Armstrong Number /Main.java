import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int d=0;
      for(int i=n1;i!=0;i/=10)
      {
        d++;
      //System.out.println(i);
      }
      int r,am=0,m;
       for(int i=n1;i!=0;i/=10)
      {
       // d++;
      //System.out.println(i);
         r=i%10;
         m=1;
         for(int j=1;j<=d;j++)
           m=m*r;
         am=am+m;
      }
      if(am==n1)
        System.out.println("Armstrong Number");
      else
         System.out.println("Not a Armstrong Number");
	}

	}
