
public class binarySearch {

    static void bubbleSortAlgo(int arr[]) {
        int s = arr.length;
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }
    }

    public static void displayArray(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }

    }

    public static int searchBinary(int ele, int arr[], int low, int high) {
        if (low < high) {
            int mid = (low + (high - low)) / 2;
            if (ele == arr[mid]) {
                return mid;
            } else if (ele < arr[mid]) {
                return searchBinary(ele, arr, low, mid);
            } else {
                return searchBinary(ele, arr, mid, high);
            }

        }
        return -1;
    }

    public static void iterativeBinarySearch(int arr[], int ele) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (ele == arr[mid]) {
                System.out.println();
                System.out.println("The index is: " + mid);
                return;
            } else if (ele < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 3, 5, 9, 1 };
        bubbleSortAlgo(arr);

        System.out.print("The sorted array is: ");
        displayArray(arr);

        // int find = searchBinary(5, arr, 0, arr.length);
        // System.out.println(find);

        iterativeBinarySearch(arr, 1);

    }

}
