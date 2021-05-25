package _1;

import java.util.Scanner;

public class _13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        sc.close();
        String yB = Integer.toBinaryString(y);
        if(y==0 || y == 1 || y==2 || y==3 || ((yB.charAt(yB.length()-2) == '1') || (yB.charAt(yB.length()-1) == '1' ))){
            System.out.println("no");
        }else {
            if(y%400==0){
                System.out.println("yes-");
            }else if(y%100==0){
                System.out.println("no");
            }else {
                System.out.println("yes");
            }
        }
    }
}
