import java.util.regex.Pattern;
import java.util.*;
public class Main {
    public static void main(String... args)
    { Scanner sc=new Scanner(System.in);
    String CSV = sc.nextLine();; 
     String[] values = CSV.split("\\s*(\\s|,|and|or)\\s*"); 
     for(String x:values)
     System.out.println(x); 
    }


        
    }
