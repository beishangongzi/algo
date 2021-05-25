package _1;

import java.util.Hashtable;
import java.util.Scanner;

public class _22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(0,"zero");
        ht.put(1,"one");
        ht.put(2,"two");
        ht.put(3,"three");
        ht.put(4,"four");
        ht.put(5,"five");
        ht.put(6,"six");
        ht.put(7,"seven");
        ht.put(8,"eight");
        ht.put(9,"nine");
        ht.put(10,"ten");
        ht.put(11,"eleven");
        ht.put(12,"twelve");
        ht.put(13,"thirteen");
        ht.put(14,"fourteen");
        ht.put(15,"fifteen");
        ht.put(16,"sixteen");
        ht.put(17,"seventeen");
        ht.put(18,"eighteen");
        ht.put(19,"nineteen");
        ht.put(20,"twenty");
        ht.put(30,"thirty");
        ht.put(40,"forty");
        ht.put(50,"fifty");
        ht.put(60,"sixty");
        for (int i = 21; i < 60; i++) {
            char[] tmp = Integer.toString(i).toCharArray();
            int ts = ((int) tmp[0] - '0') * 10;
            int os = (int) tmp[1] - '0';
            if(os!=0){
                String o = ht.get(os);
                String t = ht.get(ts);
                ht.put(i, t + " " + o);
            }
        }
        String resH = ht.get(h);
        String resM = ht.get(m);
        if(resM.equals("zero")){
            resM = "o'clock";
        }
        System.out.println(resH + " " + resM);
    }
}
