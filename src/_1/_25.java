package _1;

import java.util.Scanner;

public class _25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for (int j = 0; j < n; j++) {
            int c = 0;
            for (int i = 0; i <n; i++) {
                if(i==j) continue;
                if(a[i][j]==1) c++;
            }
            if(c>=n/2){
                System.out.print(j+1 + " ");
            }
        }
    }
}
