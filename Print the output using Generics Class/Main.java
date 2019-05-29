import java.util.*;
public class Main<T> 
{ 
  // type your code here  
       private T t;
	
	public T get(){
		return this.t;
	}
	
	public void set(T t1){
		this.t=t1;
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Main type1 = new Main(); 
		type1.set(sc.nextLine()); 
        System.out.println("Integer Value: "+type1.get());
        type1.set(sc.nextLine()); 
        System.out.println("String Value: "+type1.get());
        type1.set(sc.nextDouble()); 
         System.out.println("Float value: "+type1.get());
		
	}
}