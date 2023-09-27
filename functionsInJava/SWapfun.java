package functionsInJava;
import java.util.*;
public class SWapfun {
    static int swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        int swaps=swap(a, b);
        // System.out.println();
        return swaps;
    }
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int a,b;
        System.out.print("enter first nun1: ");
        a=sc.nextInt();
        System.out.print("enter first nun2: ");
        b=sc.nextInt();
        
        int ans=swap(a,b);
        System.out.println(ans);
    }
}
