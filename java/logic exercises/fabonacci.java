public class fabonacci {

    // iterative
    public static void fab(int n) {

        int t1 = 0, t2 = 1;
        int nxtTerm = t1 + t2;

        System.out.print(t1 + " ");
        System.out.print(t2 + " ");
        System.out.print(t2 + " ");

        while (nxtTerm < n) {
            t1 = t2;
            t2 = nxtTerm;
            nxtTerm = t1 + t2;
            System.out.print(nxtTerm + " ");
        }
    }

    // recursive approach
    static int recFab(int n) {
        if (n == 1 || n == 0)
            return n;
        else
            return recFab(n - 1) + recFab(n - 2);
    }

    public static void main(String[] args) {
        // fab(10);
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(recFab(i) + " ");
        }
    }
}