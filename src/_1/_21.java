package _1;

import java.util.Arrays;
import java.util.Scanner;


public class _21 {
    private static int sum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] m = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println();
        d(n, m, 0, 2);
        System.out.println(sum);
    }

    private static void d(int n, int[][] m, int r, int s){
        if(r==n){
            if(s==3){
                sum ++;
                for (int[] ints : m) {
                    System.out.println(Arrays.toString(ints));
                }
                System.out.println("-------------------");
            }else {
                d(n, m, 0, 3);
            }
            return;
        }
        for (int i = 0; i < n; i++) {
            if(m[r][i]==1){
                if(b(n, m, r, s, i)){
                    m[r][i] = s;
                    d(n, m, r+1, s);
                    m[r][i] = 1;
                }
            }
        }
    }

    private static boolean b(int n, int[][] m, int r, int s, int i) {
        for (int j = 0; j < n; j++) {
            if(m[j][i] == s){
                return false;
            }
        }
        for (int j = 0; j < n; j++) {
            if(r==j){
                continue;
            }
            for (int k = 0; k < n; k++) {
                if(((float)(i-k) / (r-j) == 1) || ((float)(i-k) / (r-j) == -1)){
                    if(m[j][k] == s){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
