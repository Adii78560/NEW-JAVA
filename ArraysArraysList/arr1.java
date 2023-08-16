package ArraysArraysList;
import java.util.*;
public class arr1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //syntax
        //dataType[] variable_Name = new dataType[size]

        //store 5 rollno's
        // int[] arr=new int[5];
        // System.out.print("enter roll no's of 5 students: ");
        // for(int i=0;i<5;i++){
        //     arr[i]=sc.nextInt();
        // }
        // System.out.println(" ");
        // for(int i=0;i<5;i++){
        //     System.out.print(arr[i]+" ");
            
        // }
        // System.out.println(" ");
        // for(int i=0;i<5;i++){
        //     System.out.print(i+ " ");
            
        // }
        int[] arr={12,34,54,65,344,23,012,015};
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            
        }
        System.out.println(" ");

    }
}
