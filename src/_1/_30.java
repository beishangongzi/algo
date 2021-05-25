package _1;

import java.math.BigDecimal;
import java.util.Scanner;

public class _30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble(); double y1 = sc.nextDouble();
        double x2 = sc.nextDouble(); double y2 = sc.nextDouble();
        double x3 = sc.nextDouble(); double y3 = sc.nextDouble();
        double x4 = sc.nextDouble(); double y4 = sc.nextDouble();
        sc.close();
        double res = 0;
        if(x1 > x2){ double t = x1; x1 = x2; x2 = t;}
        if(y1 > y2){ double t = y1; y1 = y2; y2 = t;}
        if(x3 > x4){ double t = x3; x3 = x4; x4 = t;}
        if(y3 > y4){ double t = y3; y3 = y4; y4 = t;}
        if(x3 > x2 || x1 > x4 || y3 > y2 || y1 > y4){

        }else{
            double xMin = Math.max(x1, x3);
            double xMax = Math.min(x2, x4);
            double yMin = Math.max(y1, y3);
            double yMax = Math.min(y2, y4);
            res = (xMax - xMin) * (yMax - yMin);
        }
        System.out.println(BigDecimal.valueOf(res).setScale(2, BigDecimal.ROUND_HALF_EVEN));
//        System.out.println(BigDecimal.valueOf(res));
    }
}
