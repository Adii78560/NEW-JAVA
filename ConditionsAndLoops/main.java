package ConditionsAndLoops;
import java.util.*;

public class main {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // for(int i=2;i<1;i++){
        //     if(a==hasNextInt()){
        //         break;
        //     }
        // }

        int salary=24000;
        if(salary >= 10000){
            salary+=2000;
            System.out.println("incremented salary= "+salary);
        }
        else{
            salary+=1000;
            System.out.println("incremented salary= "+salary);
        }

    }
}
