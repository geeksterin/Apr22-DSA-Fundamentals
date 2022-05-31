public class BasicManipulation {
    public static void main(String[] args) {
        // - Check even or odd using bitwise.
        // - Check if Kth bit is set or not.
        int N = 10; // 1010
        int k = 2;
        int mask = 1 << (k - 1);
        System.out.println(N & mask);

        // - Set the kth bit.
        k = 3;
        N = N | 1 << (k - 1);
        System.out.println(N);
        // - Unset the kth bit.
        k = 3;
        N = N & ~(1 << (k - 1));
        System.out.println(N);

        // - Toggle the Kth bit
        k = 3;
        N = N ^ (1 << (k - 1));
        System.out.println(N);

        // - Unsetting the rightmost set bit.
        System.out.println(N&(N-1));

    }
}
