package _1;

import java.util.Scanner;

public class _11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char a = 'A';
                if(i <= j){
                    System.out.print((char)(a + j - i));
                }else {
                    System.out.print((char)(a - j + i));

                }
            }
            System.out.println();
        }
    }
}
