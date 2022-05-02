import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//TC: O(N) SC:O(N)
public class UniqueOccurance {
    public static void main(String[] args) {
        int nums[] = { 1, 2 };
        // int nums[] = { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 };
        Map<Integer, Integer> map = new HashMap<>();

        // O(N)
        for (var num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // O(N)
        HashSet<Integer> set = new HashSet<>(map.values());

        if (set.size() == map.values().size())
            System.out.println("Unique Occurance");
        else
            System.out.println("Not Unique Occurance");

    }
}
