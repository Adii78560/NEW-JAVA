package functionsInJava;

public class fun1 {
    /*
     * returnType name(){
     *      body
     *      return statement;
     *  }
     */

    static int sum(int a,int b){
        System.out.println("this runs");
        System.out.println(a+b);
        int sums=a+b;
        System.out.println(" ");
        return sums;
        // System.out.println("that runs"); {after return statement you cannot pass any thing}
    }
    public static void main(String[] args){
        int b=23;
        int a=23;

        
        sum(b,a);


    }
}
