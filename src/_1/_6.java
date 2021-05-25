package _1;

public class _6 {
    public static void main(String[] args) {
        int[] c = new int[4];
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                c[0] = i;
                c[1] = j;
                c[2] = j;
                c[3] = i;
                for (int k : c) {
                    sb.append(k);
                }
                System.out.println(sb);
                sb.setLength(0);
            }

        }
    }
}
