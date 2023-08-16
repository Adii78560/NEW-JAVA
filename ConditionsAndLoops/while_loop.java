package ConditionsAndLoops;

public class while_loop {
    public static void main(String[] args){
        //while loops
        // print 1 to 100 using while loops
        int x=1;
        while(x<101){
            System.out.println(x);
            x+=1;
        }
        int u=1;
        while(u<11){
            System.out.println(u+" hello world");
            u+=1;
        }



        //do while loops
        // syntax
        /* do{

        }while(condition){
            body 
        }
         */
        int y=1;
        while(y!=1){
            System.out.println("yoiiii");
        }

        //do while

         do{
            System.out.println("yoii");
         }while(y!=1);
         {
            System.out.println("while is working in do while statement!!!");
         }

        
    }
}
