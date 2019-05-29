import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),t;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
      int k=sc.nextInt();
      	for(int i=0;i<n;i++)
        {
          for(int j=i+1;j<n;j++)
          {
            if(a[i]<a[j])
            {
              t=a[i];
              a[i]=a[j];
              a[j]=t;
            }
            
          }
        }
      System.out.println(a[k-1]);
    }   
}