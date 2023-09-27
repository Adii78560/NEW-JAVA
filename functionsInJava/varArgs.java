package functionsInJava;

import java.util.Arrays;

public class varArgs {
    static void varArgss(int ...a){
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        varArgss(23,34,23,234,3,4,42,43,4,4,3,43,4,3,5,465,46,56,746,7,3456,2345,13,4);
        // for (int i = 0; i < args.length; i++) {
        //     System.out.println(args[i]);
        // }
    }
}
