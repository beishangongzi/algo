package _1;

import java.math.BigInteger;
import java.util.Scanner;

public class _18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger s = fun(n);
        System.out.println(s);

    }
    public static BigInteger fun(int n){
        if(n==1){
            return new BigInteger(String.valueOf(1));
        }
        return new BigInteger(String.valueOf(n)).multiply(fun(n -1));
    }
}
