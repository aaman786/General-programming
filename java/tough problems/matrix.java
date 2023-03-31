import java.util.Scanner;

public class matrix {

    public static int[][] createMatrix() {
        int n = 3;
        int[][] matrix = new int[n][n];

        Scanner sc = new Scanner(System.in);
        System.out.println(matrix.length);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        return matrix;

    }

    static void dispplayMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = createMatrix();
        // int[][] matrix = {
        // { 1, 2, 3 },
        // { 4, 5, 6 },
        // { 7, 8, 9 } };

        dispplayMatrix(matrix);

    }
}

// 4 19 12
// 7 11 30
// 2 34 13