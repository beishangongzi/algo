package _1;

import java.util.Scanner;

public class _34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ip = sc.nextInt();
        int h = ip / 3600;
        int m = ip % 3600 / 60;
        int s = ip % 60;
        System.out.printf("%d:%d:%d", h, m, s);
    }
}
