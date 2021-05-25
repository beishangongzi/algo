package _1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);
        int tmp;
        int res = 0;
        while (arr.size() > 1) {
            res += arr.get(0);
            res += arr.get(1);
            tmp = arr.get(0) + arr.get(1);
            arr.remove(0);
            arr.remove(0);
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) >= tmp) {
                    arr.add(i, tmp);
                    break;
                }else if (i == arr.size() -1){
                    arr.add(tmp);
                    break;
                }
            }
        }
        System.out.println(res);

    }
}
