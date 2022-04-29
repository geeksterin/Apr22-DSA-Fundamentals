
public class squareOfSortedArray {
    public static void main(String[] args) {
        int arr[] = { -4, -2, -1, 0, 5, 9, 10 };
        int res[] = new int[arr.length];
        int low = 0, high = arr.length - 1, k = arr.length - 1;

        while (low <= high) {
            if (Math.abs(arr[low]) < Math.abs(arr[high])) {
                res[k] = arr[high] * arr[high];
                high--;
            } else {
                res[k] = arr[low] * arr[low];
                low++;
            }
            k--;
        }

        for (var x : res) {
            System.out.print(x + ",");
        }

    }
}
