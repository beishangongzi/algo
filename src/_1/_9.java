package _1;

import java.util.Scanner;

public class _9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        sc.close();
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == k){
                System.out.println(i+1);
                break;
            }
        }
        if(i==arr.length){
            System.out.println(-1);
        }

    }
}
