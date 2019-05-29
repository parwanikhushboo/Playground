import java.util.*;
import java.util.regex.*;
import java.io.*;
import java.util.Scanner;
public class Main {

  public static void findIndexes(){
    Scanner sc=new Scanner(System.in);
     String keyword = sc.nextLine();
    String searchableString = sc.nextLine();
   
 
    int index = searchableString.indexOf(keyword);
    int c=0;
    while (index >=0){
        System.out.println("found: "+(c+1)+" : "+index+" - "+(index+keyword.length()));
        index = searchableString.indexOf(keyword, index+keyword.length())   ;
    c++;
    }
    if(c==0){
      System.out.println("The given word is not present in the string");
      return;
    }
 System.out.print(c);
    
}
  
  
    public static void main(String[] args) {
       // type your code here
      
      
      
  

    findIndexes();
}
    }
