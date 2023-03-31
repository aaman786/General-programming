public class intTObianry {
    public static void main(String[] args) {
        int num = 17, i = 0;
        int arr[] = new int[10];

        while (num > 0) {
            arr[i] = num % 2;
            num = num / 2;
            i++;

        }

        for (int j = i - 1; j >= 0; j--) {

            System.out.println(arr[j] + " ");
        }
    }
}
