import java.util.Scanner;
class Main{
	public static void main (String[] args) {
	  Scanner in = new Scanner(System.in);
	  //int base = in.nextInt();
	  int exponent = in.nextInt();
	  System.out.print(f(exponent));
	}
	public static int f(int n)
	{
	  if(n == 0){
	    return 0;
	  }
	  
	  else {
	    return (n+f(n-1));
	  }
    }
	
}