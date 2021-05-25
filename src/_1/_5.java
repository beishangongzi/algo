package _1;

import java.util.Scanner;

public class _5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if(((i<<1) + (j<<1) + k ) == s){
                        int[] res = new int[5];
                        res[0] = i;
                        res[1] = j;
                        res[2] = k;
                        res[3] = j;
                        res[4] = i;
                        StringBuilder sb = new StringBuilder();
                        for (int c : res) {
                            sb.append(c);
                        }
                        System.out.println(sb);
                    }
                }
            }
        }
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (((i << 1) + (j << 1) + (k << 1)) == s) {
                        int[] res = new int[6];
                        res[0] = i;
                        res[1] = j;
                        res[2] = k;
                        res[3] = k;
                        res[4] = j;
                        res[5] = i;
                        StringBuilder sb = new StringBuilder();
                        for (int c : res) {
                            sb.append(c);
                        }
                        System.out.println(sb);
                    }
                }
            }
        }

    }
}
