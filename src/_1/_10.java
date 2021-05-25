package _1;

import java.util.Scanner;

public class _10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = -10000;
        int min = 10000;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            if (value > max) {
                max = value;
            }
            if(value < min){
                min = value;
            }
            sum += value;
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
    }
}
