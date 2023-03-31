public class chef {
    public static boolean isPossible(int p, int[] cook, int n, int mid) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {

            // For each cook count the pratas
            int c = 0;
            int time = mid;

            // Time taken to cook each
            // pratas by ith cook
            int perpratas = cook[i];
            while (time > 0) {
                time = time - perpratas;
                if (time >= 0) {
                    c += 1;
                    perpratas += cook[i];
                }
            }
            cnt += c;
            if (cnt >= p)
                return true;
        }
        return false;
    }

    // Function to find the minimum time required
    // to fulfill the orders
    static int findMinTime(int n, int[] arr, int l) {
        // write your code here
        int s = 0, e = 10000007;
        int mid, ans = -1;

        // Loop to implement binary search
        while (s <= e) {
            mid = (s + e) / 2;
            if (isPossible(n, arr, l, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int N = 10, L = 4;
        int[] rank = new int[] { 1, 2, 3, 4 };

        // Function call
        System.out.println(findMinTime(N, rank, L));
    }
}