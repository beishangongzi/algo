package _1;

import java.util.Scanner;

public class _12 {
    public static void main(String[] args) {
        for (int i = 0; i < 32; i++) {
            StringBuilder temp = new StringBuilder(Integer.toString(i, 2));
            int delta = 5 - temp.length();
            for (int j = 0; j < delta; j++) {
                temp.insert(0, "0");
            }
            System.out.println(temp);
        }
    }
}
