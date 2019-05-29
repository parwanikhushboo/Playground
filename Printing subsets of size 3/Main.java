import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        //int v=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        	for(int j=i+1;j<n;j++)
        	{
        		//if(a[i]+a[j]==v)
              for(int k=j+1;k<n;k++)
        		System.out.print("("+a[i]+", "+a[j]+", "+a[k]+") ");
        	}
          if(i!=n-1)
          System.out.println();
        }
      //if(n==5)
       // System.out.println("(1, 7, 3) (1, 7, 4) (1, 7, 9) (1, 3, 4) (1, 3, 9) (1, 4, 9)\n(7, 3, 4) (7, 3, 9) (7, 4, 9)\n(3, 4, 9)");
    }
}