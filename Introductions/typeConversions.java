package Introductions;
import java.util.*;
public class typeConversions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num=(int)(67.45);
        System.out.println(num);//output will be 67
        int a=257;
        byte b=(byte)(a);
        System.out.println(b);

        int c=512;
        byte d=(byte)(c);
        System.out.println(d);
    }
}
