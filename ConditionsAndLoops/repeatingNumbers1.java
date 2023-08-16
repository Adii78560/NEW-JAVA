package ConditionsAndLoops;
import java.util.*;
public class repeatingNumbers1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int nums=sc.nextInt();
        int count=0;
        System.out.print("enter the target: ");
        int target=sc.nextInt();
        while(nums>0){
            int rem=nums%10;
            if(rem==target){
                count++;
            }
            nums/=10;
        }
        sc.close(); 
        System.out.println(count);
    }
}
