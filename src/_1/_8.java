package _1;

import java.util.Arrays;
import java.util.Scanner;

public class _8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tri(n);

    }

    private static void tri(int n){
        int i = 0;
        int[] old = new int[2];
        old[0] = 1;
        old[1] = 1;
        while (i < n){
            if(i==0){
                System.out.println("1");
            }else if(i==1){
                System.out.println("1 1");
            }else {
                old = fun(old);
                System.out.println(Arrays.toString(old).replace("[", "").replace("]", "").replaceAll(",", ""));
            }
            i ++;
        }
    }

    private static int[] fun(int[] arr){
        int lenArr = arr.length;
        int lenNew = lenArr + 1;
        int[] newArr = new int[lenNew];
        newArr[0] = 1;
        newArr[lenNew - 1] = 1;
        for (int i = 0; i < lenArr - 1; i++) {
            int sum = arr[i] + arr[i+1];
            newArr[i+1] = sum;
        }
        return newArr;
    }
}
