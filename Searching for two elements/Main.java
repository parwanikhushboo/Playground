import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int c1=0,c2=0,p1=-1,p2=-1;
      for(int i=0;i<n;i++)
      {
        if(a[i]==n1)
        {c1=1;
         p1=i;}
        if(a[i]==n2)
        {c2=1;
         p2=i;}
        
      }
      
        System.out.println(p1+"\n"+p2);
    }
}