import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      char c=sc.next().charAt(0);
      int key=sc.nextInt();
      int o;
      if(c>='a'&&c<='z')
      {
        o=c-'a';
        o=(o-key)%26;
        c=(char)(((c+key)%26)+'a'+1);
      }
      else
      {
        o=c-'a';
        o=(o-key)%26;
        c=(char)(((c+key)%26)+'A'+9);
      }
      System.out.println(c);
    }
}