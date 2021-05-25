package _1;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class _1 {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        for(int i=0; i<len; i++){
            l.add(sc.nextInt());
        }
        Collections.sort(l);
        for(int j=0; j<len; j++){
            System.out.print(l.get(j));
            System.out.print(' ');
        }
    }
}
