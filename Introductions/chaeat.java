package Introductions;
import java.util.*;

public class chaeat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        boolean d=Character.isUpperCase(a);
        if(d){
            System.out.println(0);
        }
        else{
            System.out.println(-1);
        }
    }
}
