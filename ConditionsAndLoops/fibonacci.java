package ConditionsAndLoops;
import java.util.*;
public class fibonacci {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a =0; int b=1;
        System.out.println("enter the nth fibonacci number: ");
        int n=sc.nextInt();
        if(n==0){
            System.out.println(0);
        }
        else if(n==1 || n==2){
            System.out.println(1);
        }
        else{
            for(int i=0;i<=n;i++){
                int temp=a;
                a+=b;
                b=temp;
           }
           System.out.println(b);
        }

    }
}
