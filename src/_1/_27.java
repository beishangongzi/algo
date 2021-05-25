package _1;

import java.util.Scanner;
//　　An=sin(1–sin(2+sin(3–sin(4+…sin(n))…)
//        　　Sn=(…(A1+n)A2+n-1)A3+…+2)An+1
//((sin(1)+3)sin(1–sin(2))+2)sin(1–sin(2+sin(3)))+1
public class _27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        A(n);
//        System.out.println();
        sc.close();
        Sn(n);
//        n = sc.nextInt();
//        System.out.println();
//        A(n);

    }

    private static void Sn(int n) {
        int i = n;
        while (i > 1){
            System.out.print("(");
            i --;
        }
        int t = n;
        while (i <= n){
            A(i);
            if(i==n){
                System.out.print("+" + t);
            }else {
                System.out.print("+" + t + ")");
            }

            t--;
            i ++;
        }

    }


    private static void A(int n){
        s(n);
        for (int i = 0; i < n; i++) {
            System.out.print(")");
        }
    }
    private static void s(int n){
        if(n==1){
            System.out.print("sin(1");
        }else if((n & 1) == 0){
            s(n-1);
            System.out.print("-sin(" + n);
        }else {
            s(n-1);
            System.out.print("+sin(" + n);
        }

    }
}
