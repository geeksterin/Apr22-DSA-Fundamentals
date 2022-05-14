import java.util.ArrayList;
import java.util.*;

public class collections {
    public static void main(String[] args) {
        // Collections.binarySearch(list, key);
        // Collections.shuffle(list);
        // Collections.sort();

        LinkedList<Integer> al = new LinkedList<>();
        al.add(1);
        al.add(2);
        al.add(-1);
        al.add(0);
        al.add(-7);

        for (var x : al) {
            System.out.print(x + ",");
        }

        System.out.println("");

        Collections.sort(al);

        System.out.println("After sorting");
        for (var x : al) {
            System.out.print(x + ",");
        }

        al.

    }
}
