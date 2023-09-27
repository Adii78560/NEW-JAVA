package functionsInJava;

public class Scope {
    public static void main(String[] args) {
        //block scope!!!
        int a=20;
        int b=34;
        {
            a=32;
            int c=34;
            System.out.println("value of c= "+ c);// printing inside of the block!!!
        }
        
        
        // System.out.println(c);//this will give an error because of the block scope if we try to print outside of its block!!!
        System.out.println(a);
    }
}
