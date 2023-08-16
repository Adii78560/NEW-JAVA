package functionsInJava;
import java.util.*;
public class fun2 {

   static String greet(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your name: ");
        String name=sc.nextLine();
        System.out.println("hello "+ name+ " how are you?");
        String how=sc.nextLine();
        System.out.println("heyy!!! am always with you okie "+ name);
        return name;
    }
    public static void main(String[] args) {

        greet();
        
    }
}
