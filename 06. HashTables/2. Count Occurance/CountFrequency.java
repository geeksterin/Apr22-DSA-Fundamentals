import java.util.HashMap;
import java.util.Map;

// TC: O(N) , SC: O(N)
public class CountFrequency {
    public static void main(String[] args) {
        // Count the frequency of each word in this list.
        String arr[] = { "arun", "singh", "roshan", "arun", "yadav", "nav", "singh" };
        // Create a hashmap
        HashMap<String, Integer> m = new HashMap<>();

        // m.put("arun", 10000);
        // System.out.println(m.getOrDefault("arun", 99));

        // for-each loop
        for (var word : arr) {
            m.put(word, m.getOrDefault(word, 0) + 1);
        }

        // System.out.println(m.size());

        for (var entry : m.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}