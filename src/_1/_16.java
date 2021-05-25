package _1;

import java.util.Scanner;

public class _16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        sc.close();
        long res = (n + 1) * n / 2;
        System.out.println(res);
    }


}
