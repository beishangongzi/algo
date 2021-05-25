package _1;

public class _7 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int x = i / 100;
            int y = i % 100 / 10;
            int z = i % 10;
            if(Math.pow(x, 3) + Math.pow(y, 3) + Math.pow(z, 3) == i){
                System.out.println(i);
            }
        }
    }
}
