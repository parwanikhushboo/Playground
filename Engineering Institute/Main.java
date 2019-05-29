//import required packages
import java.util.Scanner;
class Faculty
{
  int salar;
  public void salary()
  {
    
    //write your Faculty class statements
    System.out.println("Base Salary: "+salar);
  }
}
class CSE extends Faculty
{
  public void salary()
  {
    
    //write your CSE class statements
    System.out.println("CSE Faculty: "+(salar+3000));
  }
}
class IT extends Faculty
{
  public void salary()
  {
    
    //write your IT class statements
    System.out.println("IT Faculty: "+(this.salar+5000));
  }
}
class ECE extends Faculty
{
  public void salary()
  {
    
    //write your ECE class statements
    System.out.println("ECE Faculty: "+(this.salar+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    Faculty obj = new Faculty();
    int n=sc.nextInt();
    obj.salar=n;
    obj.salary();
   
    obj = new CSE();
    obj.salar=n;
    obj.salary();
    obj = new IT();
    obj.salar=n;
    obj.salary();
     obj = new ECE();
    obj.salar=n;
    obj.salary();
    //implement your required concept here
  }
}