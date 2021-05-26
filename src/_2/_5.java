package _2;

import java.util.Scanner;

public class _5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double[] arr = new Double[7];
        for(int i = 0; i < 7; i ++){
            arr[i] = sc.nextDouble();
        }
        Double res = arr[3] / arr[0] + arr[4] / arr[1] + arr[5] / arr[2];
        String s = "%." + arr[6].intValue() + "f";
        System.out.printf(s, res);
    }
}
