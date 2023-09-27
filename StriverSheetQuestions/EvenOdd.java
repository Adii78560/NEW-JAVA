package StriverSheetQuestions;
import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numb");
        int n=sc.nextInt();
            int b=0;
            int c=0;
        while(n>0){
            int a=n%10;
            if(a%2==0){
                b=b+a;
            }
            else if(a%2!=0){
                c+=a;
            }
            n=n/10;
            a=n/10;
            
        }
        System.out.print(b+" "+c);
        System.out.println(" ");

        
 
            
        // int odd=0;int even=0;
        // while(n>0){
        //     int temp = n%10;
        //     n=n/10;
        //     if(temp%2==0){
        //         even+=temp;
        //     }
        //     else{
        //         odd+=temp;
        //     }
        // }
        // System.out.println(odd + " " + even);
        
    }
}
