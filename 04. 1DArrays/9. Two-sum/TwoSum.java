import java.util.*;

//TC: O(NlgN)
//SC: O(1)
public class TwoSum {
    public static void main(String[] args) {
        int arr[] = { 1, 10, 4, 6, 9, 3, 4, 5, 7 };
        int target = 5;

        Arrays.sort(arr); // O(NlgN)
        // [1,3,4,4,5,6,7,9,10]

        // Two-pointer approch
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            if (arr[low] + arr[high] == target) {
                System.out.println(low + "," + high);
                low++;
                --high;
            } else if (arr[low] + arr[high] > target) {
                --high;
            } else
                low++;
        }

        // brute-force

    }
}
