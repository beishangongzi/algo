package _1;

import java.util.Scanner;

public class _14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int x = 0;
        int y = 0;
        int res = 1;
        int old=1;
        int old2;
        for (int i = 1; i <= n; i++) {
            if(i == 1 || i == 2){
            }else {
                old2 = old;
                old = res;
                res = old2 + old;
                if(res > 10007){
                    res -= 10007;
                }
            }
        }
        System.out.println(res);
    }
}
