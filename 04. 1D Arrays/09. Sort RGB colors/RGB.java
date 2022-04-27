import java.util.Arrays;

public class RGB {

    // TC: O(N) and single pass algorithm
    // SC: O(1)
    // Link: https://leetcode.com/problems/sort-colors/
    public static void main(String[] args) {
        // Dutch flag problem
        char arr[] = { 'G', 'R', 'G', 'R', 'B', 'B', 'G', 'B', 'R', 'R' };

        // RGB
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 'R') {
                char tmp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = tmp;
                low++;
                mid++;
            } else if (arr[mid] == 'B') {
                char tmp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = tmp;
                high--;
            } else
                mid++; // arr[mid] == 'G'
        }

        for (var x : arr) {
            System.out.print(x + ",");
        }
    }
}
