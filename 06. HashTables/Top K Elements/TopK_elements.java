
import java.util.*;
// TC: O(NlgN) SC: O(N)
public class TopK_elements {
    static public void topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        //TC: O(N) ,SC: O(N)
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // SC: O(lgN)
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
                (a, b) -> -1 * (a.getValue() - b.getValue()));

        //O(NlgN)
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            maxHeap.add(entry);
        }

        List<Integer> res = new ArrayList<>();
        while (res.size() < k) {
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            res.add(entry.getKey());
        }

        // print the res
        for (int i : res) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int arr[] = { -1, 11, 10, 3, 5, 9, -3, 0, 11, 11, 3, 11, 3, -1 };
        int k = 3;
        topKFrequent(arr, k);

    }
}
