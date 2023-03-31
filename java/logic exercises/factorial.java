public class factorial {

    // iterative approach

    static void fact(int n) {
        int factorial = 1;

        for (int i = n; i >= 1; i--) {
            System.out.print(i + " * ");
            factorial *= i;
        }
        System.out.println();

        System.out.println("The factorial is: " + factorial);

    }

    // recursive approach

    static int recFact(int n) {
        System.out.print(n + " * ");

        if (n == 1 || n == 0) {
            return 1;
        }
        return n * recFact(n - 1);
    }

    public static void main(String[] args) {
        // fact(5);
        int fact = recFact(5);
        System.out.println("THe factorial is: " + fact);
    }
}