package _1;

import java.util.Scanner;

public class _24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1, v2, t, s, l;
        v1 = sc.nextInt();
        v2 = sc.nextInt();
        t = sc.nextInt();
        s = sc.nextInt();
        l = sc.nextInt();
        sc.close();
        int l1 = 0, l2 = 0, uT = 0;
        while (l1 < l && l2 < l) {
            uT++;
            l1 += v1;
            l2 += v2;
            if (l1 >= l || l2 >= l) {
                break;
            }
            if (l1 - l2 >= t) {
                for (int i = 0; i < s; i++) {
                    l2 += v2;
                    uT++;
                    if (l2 >= l) {
                        break;
                    }
                }
            }
        }
        if(l1 > l2){
            System.out.println("R");
        }else if(l1==l2){
            System.out.println("D");
        }else {
            System.out.println("T");
        }
        System.out.println(uT);

    }
}
