package _1;

import java.util.*;


public class _32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] isPrime = new int[Math.max((int) Math.sqrt(n) + 1, 94 + 1)];
        Arrays.fill(isPrime, 1);
        sc.close();
        isPrime[0] = 0;
        isPrime[1] = 0;
        int i = 4;
        while (i < isPrime.length) {
            isPrime[i] = 0;
            i += 2;
        }
        i = 6;
        while (i < isPrime.length) {
            isPrime[i] = 0;
            i += 3;
        }
        i = 10;
        while (i < isPrime.length) {
            isPrime[i] = 0;
            i += 5;
        }
        i = 14;
        while (i < isPrime.length) {
            isPrime[i] = 0;
            i += 7;
        }
        i = 22;
        while (i < isPrime.length) {
            isPrime[i] = 0;
            i += 11;
        }
        i = 26;
        while (i < isPrime.length) {
            isPrime[i] = 0;
            i += 13;
        }
        i = 34;
        while (i < isPrime.length) {
            isPrime[i] = 0;
            i += 17;
        }
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(3);
        for (int j = 6; j < isPrime.length; j += 6) {
            if (isPrime[j - 1] == 1 && isP(isPrime[j-1])) {
                al.add(j-1);
            }
            if(j + 1 < isPrime.length){
                if(isPrime[j+1] == 1 && isP(isPrime[j+1])){
                    al.add(j+1);
                }
            }

        }
        for (int j = m; j < n+1; j++) {
            StringBuilder sb = new StringBuilder(j + "=");
            int tmp = j;
            for (int k = 0; k < al.size(); ) {
                int s = tmp / al.get(k);
                int y = tmp % al.get(k);
                if(y==0){
                    sb.append(al.get(k)).append("*");
                    tmp = s;
                }else {
                    k++;
                }
            }

            if(tmp!=1){
                sb.append(tmp).append("*");
            }
//            if(sb.toString().endsWith("=")){
//                System.out.println(sb.toString() + sb.substring(0, sb.length()-1));
//            }else {
//                System.out.println(sb.substring(0, sb.length()-1));
//            }
            System.out.println(sb.substring(0, sb.length()-1));
        }
    }
    private static boolean isP ( int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i != 0) {
                return false;
            }
        }
        return true;
    }

}
