package switchStatement;
import java.util.*;
public class first {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a="Aditya";
        String b="aditya";
        if(a==b){
            System.out.println("it works!!!");
        }
        System.out.println(" ");
        if(a.equals(b)){
            System.out.println("it works again!!!");
        }
        System.out.print("enter fruit name either apple, mango or banana:");
        String fruits=sc.nextLine();
        switch(fruits){
            case ("mango"):
                System.out.println("king of fruits");
                break;
            case("Apple"):
                System.out.println("A great red fruit");
                break;
            case("banana"):
                System.out.println("fruit that monkey loves the most");
                break;
            default:
            System.out.println("invalid fruit!!!");
        }
        
    }
}
