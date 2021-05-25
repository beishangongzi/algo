package _1;

import java.util.Scanner;

public class _23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int t = 0;
        int count = 0;
        int total = n * m;
        while (count < total){
            for (int i = t; i < m-t; i++) {
                System.out.print(arr[i][t] + " ");
                count++;
            }
//            System.out.print("|");
            for (int i = t+1; i < n-t; i++) {
                System.out.print(arr[m-t-1][i] + " ");
                count++;
            }
//            System.out.print("|");
            for (int i = m-t-2; i > t; i--) {
                if(t == n-t-1){
                    break;
                }
                System.out.print(arr[i][n-t-1] + " ");
                count++;
            }
//            System.out.print("|");
            for (int i = n - t-1; i > t; i--) {
                if(m-t-1==t){
                    break;
                }
                System.out.print(arr[t][i] + " ");
                count++;
            }
//            System.out.print("|");
            t++;
//            System.out.println(total);
        }
    }
}
