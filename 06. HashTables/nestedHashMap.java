import java.util.*;

public class nestedHashMap {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 4, 5, 5, 6, 7 };

        // List<Integer> list = new ArrayList<>();
        HashMap<Integer, List<Integer>> m = new HashMap<>();

        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(-1);
        ar.add(0);

        for (int i = 0; i < arr.length; i++) {
            m.put(arr[i], ar);
        }

        for(var entry: m.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}
