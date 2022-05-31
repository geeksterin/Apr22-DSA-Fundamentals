public class BasicManipulation {
    public static void main(String[] args) {
        // - Check even or odd using bitwise.
        int N = 11;
        if ((N & 1) == 1) {
            System.out.println("Odd number");
        } else
            System.out.println("Even Numbers");

        // - Check if Kth bit is set or not.
        int k = 5;
        N = 17; // 0001 0001
        N = 15; // 0000 1111

        int mask = 1 << (k - 1);
        if ((N & mask) > 0) {
            System.out.println("Bit is Set");
        } else
            System.out.println("Bit is Not Set");

        // - Set the kth bit.
        k = 4;
        N = 17;
        mask = 1 << (k - 1);
        N = (N | mask);
        System.out.println(Integer.toString(N, 2));

        // - Unset the kth bit.
        System.out.print("Unsetting the bit:");
        k = 5;
        N = 17;
        N = N & ~(1 << (k - 1));
        System.out.println(Integer.toString(N, 2));

        // - Toggle the Kth bit
        // k = 3;
        // N = N ^ (1 << (k - 1));
        // System.out.println(N);

        //Unsetting the rightmost set bit.
        System.out.println(N & (N - 1));

        // Power of Two
        int number = 132;
        if ((number & number - 1) == 0) {
            System.out.println("Power of 2");
        } else
            System.out.println("Not Power of Two");

    }
}
