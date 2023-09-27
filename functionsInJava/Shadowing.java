package functionsInJava;

public class Shadowing {
    static int x=-90;//this is shadowed at linr 9,10 and the value of x is 50
    public static void main(String[] args) {

        System.out.println(x);
        fun();
        int x=50;
        System.out.println(x);
        fun();// but the fun() function is using the 
        
    }
    static void fun(){
        System.out.println(x);
    }
}
