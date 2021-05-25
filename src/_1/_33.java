package _1;

import java.util.Locale;
import java.util.Scanner;

public class _33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        sc.close();
        int res = 4;
        if(s1.length() != s2.length()){
            res = 1;
        }else if(s1.equals(s2)){
            res = 2;
        }else if(s1.toUpperCase(Locale.ROOT).equals(s2.toUpperCase(Locale.ROOT))){
            res = 3;
        }
        System.out.println(res);
    }
}
