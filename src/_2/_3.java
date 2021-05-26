package _2;

import java.util.Arrays;
import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {
        int[] data = new int[200];
        for (int i=0; i<200; i++) {
            data[i] = 4 * i + 6;
        }
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        System.out.println(fun(data,value, 0, 200));
    }

    public static int fun(int[] data, int value, int from, int to){
        int index = (to + from) >> 1;
        if(data[index] == value){
            return index;
        }else if(data[index] < value){
            return fun(data, value, index, to);
        }else{
            return fun(data, value, from, index);
        }
    }
}
