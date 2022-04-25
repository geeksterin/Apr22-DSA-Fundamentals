
//Java program for implementation of Bubble Sort
// TC: O(N) to O(N^2)
// SC: O(1)
public class Optimized_BubbleSort {
    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int j = 0; j < n - 1; j++) {
            boolean swapped = false; // 1st optimization
            for (int i = 0; i < n - 1 - i; i++) { // 2nd optimzation
                if (arr[i + 1] < arr[i]) {
                    // swap or exchang of numbers
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }

        }
        // sorting finishes
    }

    /* Prints the array */
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method to test above
    public static void main(String args[]) {
        BubbleSort ob = new BubbleSort();
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
