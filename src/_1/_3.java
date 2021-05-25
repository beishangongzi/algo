package _1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String i = "00000";
        try{
        i = Integer.toString(Integer.valueOf(s, 16), 10);

        } catch (NumberFormatException e) {
            Map<Character, Integer> m = new HashMap<>();
            m.put('1', 1);
            m.put('2', 2);
            m.put('3', 3);
            m.put('4', 4);
            m.put('5', 5);
            m.put('6', 6);
            m.put('7', 7);
            m.put('8', 8);
            m.put('9', 9);
            m.put('A', 10);
            m.put('B', 11);
            m.put('C', 12);
            m.put('D', 13);
            m.put('E', 14);
            m.put('F', 15);
            m.put('0', 0);
            char[] sb = new StringBuilder(s).reverse().toString().toCharArray();
            double value = 0.0;
            for (int j = 0; j < sb.length; j++) {
                int x = m.get(sb[j]);
                Double y = x * Math.pow(16, j);
                value += m.get(sb[j]) * Math.pow(16, j);
            }
            i = Long.toString((long) value);
        }finally {
            System.out.println(i);
        }

    }
}
