package ConditionsAndLoops;
import java.util.*;
public class QuestionsOnLoops {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // System.out.print("enter three numbers: ");
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=sc.nextInt();
        // int max=a;
        // if(b>max){
        //     max=b;
        // }
        // if(c>max){
        //     max=c;
        // }
        // System.out.println("maximum number entered is: "+max);

        char character='a';

        // 
        for(;character<='z';character++){
            System.out.print(character+" ");
            if(character=='s'){
                continue;
            }
        }
    }
}
