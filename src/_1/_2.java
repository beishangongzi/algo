package _1;

import java.util.HashMap;
import java.util.Map;
import  java.util.Scanner;

public class _2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String[] x = new String[len];
        Map<Character, String> m = new HashMap<>();
        m.put('0', "0000");
        m.put('1', "0001");
        m.put('2', "0010");
        m.put('3', "0011");
        m.put('4', "0100");
        m.put('5', "0101");
        m.put('6', "0110");
        m.put('7', "0111");
        m.put('8', "1000");
        m.put('9', "1001");
        m.put('A', "1010");
        m.put('B', "1011");
        m.put('C', "1100");
        m.put('D', "1101");
        m.put('E', "1110");
        m.put('F', "1111");
        Map<String, Character> n = new HashMap<>();
        n.put("000", '0');
        n.put("001", '1');
        n.put("010", '2');
        n.put("011", '3');
        n.put("100", '4');
        n.put("101", '5');
        n.put("110", '6');
        n.put("111", '7');
        for (int i = 0; i < len; i++) {
            x[i] = sc.next();
        }
        for (int i = 0; i < len; i++) {
//            System.out.println(x[i]);
            char[] xs = x[i].toCharArray();
            StringBuilder sb = new StringBuilder();
            for (char c : xs) {
                sb.append(m.get(c));
            }
            int lenSb = sb.length();
            int plus = 3 - Math.floorMod(lenSb, 3);
            if(plus != 3){
                for (int j = 0; j < plus; j++) {
                    sb.insert(0, '0');
                }
            }
            StringBuilder sb2 = new StringBuilder();
            for (int j = 0; j < sb.length() / 3; j++) {
                String sbPart = sb.substring(j * 3, j* 3 + 3);
                sb2.append(n.get(sbPart));
            }
            String res = sb2.toString().replaceFirst("^0*","");
            if(res.equals("")){
                res = "0";
            }
            System.out.println(res);
        }
    }
}
