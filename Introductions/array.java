package Introductions;
import java.util.*;
public class array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("input the size of an Arrya");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the elements of array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("which element you want to search?");
        int b=sc.nextInt();

        for(int i=0;i<size;i++){
            if(b==arr[i]){
                System.out.println("found at "+i+" place");
            }
        }
        
    }
}
