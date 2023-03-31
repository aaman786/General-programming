
public class pattern {

    public static void xPattern() {
        int n = 5;
        int m = n * 2 - 1;
        int k = 0;
        boolean flag = false;

        for (int i = 1; i <= m; i++) {

            if (!flag && k < 5) {
                k++;
            } else {
                flag = true;
                k--;
            }

            // k++;
            for (int j = 1; j <= m; j++) {
                if (i == j || j == ((n * 2) - i)) {
                    System.out.print(k);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        xPattern();
    }
}
