public class args {

    static void add(int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        System.out.printf("The Sum is: %d", sum);
    }

    public static void main(String[] args) {
        System.out.println("hii");

        add(2, 4);
    }
}
