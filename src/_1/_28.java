package _1;

import java.util.Hashtable;
import java.util.Scanner;

public class _28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder n = new StringBuilder(sc.next());
        Hashtable<Character, String> ht = new Hashtable<>();
        ht.put('0', "ling ");
        ht.put('1', "yi ");
        ht.put('2', "er ");
        ht.put('3', "san ");
        ht.put('4', "si ");
        ht.put('5', "wu ");
        ht.put('6', "liu ");
        ht.put('7', "qi ");
        ht.put('8', "ba ");
        ht.put('9', "jiu ");
        while (true){
            System.out.println(n);
            System.out.println(read(n.toString(), ht));
            n = new StringBuilder(sc.next());
        }
    }
    private static String read(String n, Hashtable<Character, String> ht){
        if(n.length() <= 4){
            return readF(n, ht);
        } else if(n.length() <= 8){
            String n1 = new StringBuilder(n).substring(0, n.length() - 4);
            String n2 = new StringBuilder(n).substring(n.length() - 4);
            if(n2.equals("0000")){
                return readF(n1, ht) + "wan";
            }
            if(n2.charAt(n.length() - 4)=='0'){
                return readF(n1, ht) + "wan ling " + readF(n2, ht);
            }
            return readF(n1, ht) + "wan " + readF(n2, ht);
        }else {
            String n1 = new StringBuilder(n).substring(0, n.length() - 8);
            String n2 = new StringBuilder(n).substring(n.length()-8, n.length()-4);
            String n3 = new StringBuilder(n).substring(n.length()-4);
            if(n.endsWith("00000000")){
                return readF(n1, ht) + "yi";
            }
            if(n2.charAt(n.length()-8) == '0' && n.charAt(n.length() - 4)== '0'){
                return readF(n1, ht) + "yi ling " + readF(n3, ht);
            }
            if(n2.equals("0000")){
                return readF(n1, ht) + "yi ling " + readF(n3, ht);
            }
            if (n2.startsWith("0")){
                return readF(n1, ht) + "yi ling " + readF(n2, ht) + "wan " + readF(n3, ht);
            }
            if(n3.startsWith("0")){
                return readF(n1, ht) + "yi " + readF(n2, ht) + "wan ling " + readF(n3, ht);
            }
            return readF(n1, ht) + "yi " + readF(n2, ht) + "wan " + readF(n3, ht);
        }
    }
    private static String readF(String n, Hashtable<Character, String> ht){
        if(n.length() == 1){
            return readOne(n, ht);
        }else if(n.length() == 2){
            return readTen(n, ht);
        }else if(n.length() == 3){
            return readH(n, ht);
        }else {
            return readT(n, ht);
        }
    }

    private static String readOne(String n, Hashtable<Character, String> ht){
        return ht.get(n.charAt(0));
    }

    private static String readTen(String n, Hashtable<Character, String> ht){
        if(n.charAt(0) == '0'){
            return readOne(n.substring(1), ht);
        }
        String r1 = "";
        if(n.charAt(0) == '1'){
            r1 = "shi ";
        }else {
            r1 = ht.get(n.charAt(0)) + "shi ";
        }
        String r2 =  "";
        if(n.charAt(1)!='0'){
            r2 = readOne(new StringBuilder(n).substring(1), ht);
        }
        return r1 + r2;
    }

    private static String readH(String n, Hashtable<Character, String> ht){
        if(n.charAt(0) == '0'){
            return readTen(n.substring(1), ht);
        }
        String r1 = ht.get(n.charAt(0)) + "bai ";
        if(n.charAt(1) == '0' && n.charAt(2) == '0'){
            return r1;
        }
        if(n.charAt(1)=='0'){
            String r2 = "ling ";
            String r3 = readOne(new StringBuilder(n).substring(2), ht);
            return r1 + r2 + r3;
        }else {
            String r2 = readTen(new StringBuilder(n).substring(1), ht);
            return r1 + r2;
        }
    }

    private static String readT(String n, Hashtable<Character, String> ht){
        if (n.charAt(0) == '0'){
            return readH(n.substring(1), ht);
        }
        String r1 = ht.get(n.charAt(0)) + "qian ";
        if(n.charAt(1) == '0' && n.charAt(2) == '0' && n.charAt(3) == '0'){
            return r1;
        }
        if (n.charAt(1) == '0' && n.charAt(2) == '0'){
            String r2 = "ling ";
            String r3 = readOne(new StringBuilder(n).substring(3), ht);
            return r1 + r2 + r3;
        }else if(n.charAt(1) == '0'){
            String r2 = "ling ";
            String r3 = readTen(new StringBuilder(n).substring(2), ht);
            return r1 + r2 + r3;
        }else {
            String r2 = readH(new StringBuilder(n).substring(1), ht);
            return r1 + r2;
        }
    }
}
