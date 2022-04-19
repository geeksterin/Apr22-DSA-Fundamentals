import java.util.Arrays;

public class CheckDouble {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 9 };
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            int target = arr[i] * 2;

            // Arrays.binarySearch(a, key);
            // Arrays.binarySearch(a, fromIndex, toIndex, key);
            int idx = Arrays.binarySearch(arr, i + 1, arr.length, target);
            if (idx > -1) {
                // valid index found ie pair exits
                System.out.println("TRUE");
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("FALSE");
        }

    }
}
