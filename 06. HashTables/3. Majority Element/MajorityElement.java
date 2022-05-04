import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2, 1 };
        int majorityElement = -1;

        Map<Integer, Integer> m = new HashMap<>();

        for (var num : nums) {
            m.put(num, m.getOrDefault(num, 0) + 1);
        }

        // Majority element is >(N/2)
        int N = nums.length;
        for (var entry : m.entrySet()) {
            if (entry.getValue() > N / 2) {
                majorityElement = entry.getKey();
                break;
            }
        }
        // System.out.println(majorityElement);

        // System.out.println(Integer.INT_MAX);
        // System.out.println(Integer.bitCount(5));

        Integer x = 5;
        int val = Integer.parseInt("78");
        

    }
}
