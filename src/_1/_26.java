package _1;

import java.util.Scanner;

public class _26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(r(n));
    }
    private static String r(int n){
        if(n==1){
            return "A";
        }
        char s = (char) ('A' + n -1);
        String l = r(n-1);
        return l + s + l;
    }
}
