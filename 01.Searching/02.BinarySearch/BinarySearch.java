import java.util.Arrays;

public class BinarySearch {
    static int bs(int arr[], int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            // CAUTION: Prone to overflow!!
            // int mid = (start + end) / 2;

            // Optimised formula.
            int mid = start + (end - start) / 2; // (low + high) >>> 1;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else
                end = mid - 1;
        }
        // -1 indicates that target is missing from the array
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6, 9, -1, 13 };
        Arrays.sort(arr); //
        int target = 1;

        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Integer.MAX_VALUE + 1);

        // Inbuilt binary search algorithm.
        System.out.println(Arrays.binarySearch(arr, 1));
        // Our own Binary search.
        System.out.println(bs(arr, target));
    }

}