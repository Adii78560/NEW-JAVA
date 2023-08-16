package functionsInJava;
import java.util.*;
public class SWapfun {
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;

    }
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int a,b;
        System.out.print("enter first nun1: ");
        a=sc.nextInt();
        System.out.print("enter first nun2: ");
        b=sc.nextInt();
        
        swap(a,b);
        System.out.println("num1= "+a+" "+"num2= "+b);
    }
}
