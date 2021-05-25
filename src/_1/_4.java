package _1;

import java.util.Scanner;

public class _4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String res = Integer.toString(x, 16);
        System.out.println(res.toUpperCase());
    }
}
