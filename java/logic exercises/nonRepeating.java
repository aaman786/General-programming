import java.util.Arrays;

public class nonRepeating {

    public static void removingTheRepeatingElements(int arr[]) {
        boolean visited[] = new boolean[arr.length];

        Arrays.fill(visited, false);

        for (int i = 0; i < arr.length; i++) {

            for (int j = arr.length - 1; i < j; j--) {
                if (visited[i]) {
                    break;
                } else if (arr[i] == arr[j]) {
                    visited[i] = true;
                    visited[j] = true;
                }

            }
        }

        traversalOfArray(visited, arr);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 2, 7, 5, 2 };
        removingTheRepeatingElements(arr);
    }

    public static void traversalOfArray(boolean visited[], int arr[]) {
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                System.out.print(arr[i]);
                System.out.print(" ");
            }
        }
    }
}