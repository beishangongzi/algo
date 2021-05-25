package _1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;


public class _15 {
    static final Double PI = 3.14159265358979323;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextFloat();
        r = PI * Math.pow(r, 2);
        BigDecimal bd = new BigDecimal(r);
        System.out.println(bd.setScale(7, RoundingMode.HALF_EVEN));
    }
}
