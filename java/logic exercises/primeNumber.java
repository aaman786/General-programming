public class primeNumber {
    public static void main(String[] args) {

        int num = 50;

        for (int i = 1; i < num; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {

                if (count > 2) {
                    break;
                } else {
                    if (i % j == 0) {
                        count++;
                    }
                }
            }
            if (count <= 2) {
                System.out.print(i);
                System.out.print(" ");

            }
        }

    }
}
