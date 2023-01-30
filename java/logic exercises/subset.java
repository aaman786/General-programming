class subset {

	/*
	 * arr[] ---> Input Array
	 * data[] ---> Temporary array to store current combination
	 * start & end ---> Starting and Ending indexes in arr[]
	 * index ---> Current index in data[]
	 * r ---> Size of a combination to be printed
	 */
	static void combinationUtil(int arr[], int n, int r,
			int index, int data[], int i) {

		if (index == r) {
			for (int j = 0; j < r; j++) // Current combination is ready to be printed
				System.out.print(data[j] + " ");
			System.out.println(" ");
			return;
		}

		// When no more elements are there to put in data[]
		if (i >= n)
			return;

		data[index] = arr[i];

		combinationUtil(arr, n, r, index + 1,
				data, i + 1);

		combinationUtil(arr, n, r, index, data, i + 1);
	}

	static void printCombination(int arr[], int n, int r) {
		int data[] = new int[r];

		combinationUtil(arr, n, r, 0, data, 0);
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int r = 3; // no of sets require
		int n = arr.length;
		printCombination(arr, n, r);
	}
}
