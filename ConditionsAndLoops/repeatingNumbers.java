package ConditionsAndLoops;
import java.util.Scanner;
public class repeatingNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        int[] a=new int[size];
        int temp=0;
        System.out.println("enter the array");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the target element: ");
        int target=sc.nextInt();
        System.out.println(" ");
        for(int i=0;i<size;i++){
            if(a[i]==target){
                temp+=1;
            }
        }
        System.out.println("targer element was "+target);
        System.out.println(target+" element repets "+temp+" times");

        
    }
}
