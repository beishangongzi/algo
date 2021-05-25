package _1;

import java.util.Arrays;
import java.util.Scanner;

public class _31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] A = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int[][] res = pow(A, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static int[][] mul(int[][] A, int[][] B){
        int a = A.length;
        int b = B.length;
        int c = B[0].length;
        int[][] C = new int[a][c];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < b; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    private static int[][] pow(int[][] x, int n){
        if (n == 0) {
            for (int i = 0; i < x.length; i++) {
                for (int j = 0; j < x.length; j++) {
                    if(i == j){
                        x[i][j] = 1;
                    }else {
                        x[i][j] = 0;
                    }
                }
            }
            return x;

        }
        if(n==1){
//            for (int i = 0; i < x.length; i++) {
//                for (int j = 0; j < x.length; j++) {
//                    x[i][j] = 1;
//                }
//            }
            return x;
        }
        if((n & 1) == 0){
            return mul(pow(x, n >> 1), pow(x, n>>1));
        }else {

            return mul(mul(pow(x, n>>1), pow(x, n >> 1)), x);
        }
    }
}
