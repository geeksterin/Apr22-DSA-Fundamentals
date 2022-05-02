
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// TC: O(N) SC: O(N)
public class GroupAnagram2 {
    // TC:O(len(word)) SC:O(1)
    static public String mysort(String word) {
        char freq[] = new char[26];

        // Populating your freq table. O(len(word))
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        // O(1)
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                sb.append((char) ('a' + i)).append(freq[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        HashMap<String, List<String>> map = new HashMap<>();

        String strs[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
        for (var word : strs) {
            String sword = mysort(word);

            if (map.containsKey(sword) == true) {
                map.get(sword).add(word);
            } else {
                map.put(sword, new ArrayList<>());
                map.get(sword).add(word);
            }
        }

        System.out.println(new ArrayList<>(map.values()));

    }
}
