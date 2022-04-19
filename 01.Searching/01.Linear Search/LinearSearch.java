public class LinearSearch {
    public static int search(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Found target");
                return i; // index of my target
            }
        }
        // target is missing in array.
        return -1;
    }

    // Driver code
    public static void main(String args[]) {

    }
}
