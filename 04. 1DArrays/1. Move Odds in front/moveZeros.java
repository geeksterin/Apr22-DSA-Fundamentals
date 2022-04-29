public class moveZeros {
    // TC: O(N)
    // SC: O(1)
    public static void main(String[] args) {
        int arr[] = { 1, 2, 0, 0, 4, 5, 0 };

        int low = 0, high = arr.length - 1;
        while (low <= high) {
            if (arr[low] == 0) {
                // swapping with arr[high]
                int tmp = arr[low];
                arr[low] = arr[high];
                arr[high] = tmp;
                high--;
            } else
                low++; // if low == NZ
        }

        for (var num : arr) {
            System.err.print(num + ",");
        }
    }
}
