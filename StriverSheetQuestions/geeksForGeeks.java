package StriverSheetQuestions;
import java.util.*;
public class geeksForGeeks {
    public static void patterns1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void patterns2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void patterns3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    public static void patterns4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void patterns5(int n){
        for(int i=n;i>=1;i--){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void patterns6(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void patterns7(int n){
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j%2!=0){
                    System.out.print(" "+"*"+" ");
                }
            }
            System.out.println(" ");
        }
    }
    public static void patterns8(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter for patterns: ");
        int a=sc.nextInt();
        patterns1(a);
        System.out.println(" ");
        patterns2(a);
        System.out.println();
        patterns3(a);
        System.out.println();
        patterns4(a);
        System.out.println();
        patterns5(a);
        System.out.println();
        patterns6(a);
        System.out.println();
        patterns7(a);
        System.out.println();
        patterns8(a);
    }
}
