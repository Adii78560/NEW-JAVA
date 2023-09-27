package functionsInJava;

import java.util.Arrays;

public class changeNums {
    static void change(int[] nums){
        nums[0]=23;
        System.out.println("changed!!!");
    }
    public static void main(String[] args) {
        int [] arr={12,43,53,23,12,43,453,54,23};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
}
