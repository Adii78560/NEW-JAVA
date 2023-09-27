package functionsInJava;

import java.util.Scanner;

public class funOverLoading {

    // static void fun(int a){
    //     System.out.println(a);
    // }
    // static void fun(String a){
    //     System.out.println(a);
    // }
    // public static void main(String[] args) {
    //     fun("adii");
    //     fun(23);
    // }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double v=sc.nextDouble(); 
        String d=sc.nextLine();
        
        System.out.println("String: "+d);
        System.out.println("Double: "+v);
        System.out.println("Int: "+a);
    }
}
