package _1;

import java.util.Scanner;

public class _29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] c = sc.next().toCharArray();
        int cnt = 0;
        int flag = 0;
        int j = n - 1;
        for (int i = 0; i < j; i++) {
            for (int k = j; k >= i; k--) {
                if(i==k){
                    if((n & 1)== 0 || flag==1){
                        System.out.println("Impossible");
                        return;
                    }
                    flag = 1;
                    cnt += n / 2 - i;
                }else if(c[i] == c[k]){
                    for (int l = k; l < j; l++) {
                        swap(c, l, l+1);
                        cnt++;
                    }
                    j --;
                    break;
                }

            }
        }
        System.out.println(cnt);
    }

    private static void swap(char[] c, int m, int n){
        char t = c[m];
        c[m] = c[n];
        c[n] = t;
    }
}
