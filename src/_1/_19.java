package _1;

import java.math.BigInteger;
import java.util.Scanner;

public class _19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        BigInteger res = new BigInteger(String.valueOf(a)).add(new BigInteger(String.valueOf(b)));
        System.out.println(res);
    }
}
