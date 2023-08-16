package functionsInJava;

public class fun3 {
    static String greet(){
        String greeting="how are you";
        return greeting;
    }
    static int add(int a, int b){
        int sum=a+b;
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
        String msg=greet();
        System.out.println(msg);
   
        int num1=234;
        int num2=134;
        add(num1, num2);
        int add=add(num1,num2);
        System.out.println("the sum is "+ add);
    }
}
