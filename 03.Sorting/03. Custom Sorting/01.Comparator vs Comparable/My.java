import java.util.*;

public class My {

    // Old and outdated way of doing things.
    // static public class comp implements Comparator {
    // @Override
    // public int compare(Object a, Object b) {
    // Integer x = (Integer) a;
    // Integer y = (Integer) b;
    // // return -1 * (x - y);
    // return y - x;
    // }
    // }

    // Older way
    static class lencomp implements Comparator {
        @Override
        public int compare(Object obj1, Object obj2) {
            String x = (String) obj1;
            String y = (String) obj2;
            return (x.length() - y.length());
        }
    }

    public static void main(String[] args) {
        // Integer[] arr = { 1, 2, 0, 10, 11, 15, -1, 4 };
        // Arrays.sort(arr, new comp());

        // for (int x : arr) {
        // System.out.print(x + " ");
        // }

        String[] b = { "x", "arun", "singh", "abc", "xyz", "a", "b" };
        // dict format. aka lexiographical sorting.
        // Arrays.sort(b);

        // for (String x : b) {
        // System.out.print(x + " ");
        // }

        Arrays.sort(b, new lencomp());
        System.out.println();

        for (String x : b) {
            System.out.print(x + " ");
        }

    }
}
