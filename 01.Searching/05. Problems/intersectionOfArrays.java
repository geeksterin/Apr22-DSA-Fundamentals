import java.util.Arrays;

public class intersectionOfArrays {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 5, -1 };
        int arr2[] = { 10, -1, 3, 11, 10, 10 };

        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            int target = arr1[i];
            int idx = Arrays.binarySearch(arr2, target);
            if (idx > -1) {
                System.out.println(target); // common element in both arrays
            }
        }

    }

}
