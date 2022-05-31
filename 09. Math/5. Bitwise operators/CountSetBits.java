public class CountSetBits {

    // TC: O(lgN)
    static int countBits(int n) {
        int count = 0;
        while (n > 0) {
            // Checking if LSB is set or not.
            if ((n & 1) == 1)
                count++;
            n = n >> 1;
        }
        return count;
    }

    //TC: Number of 1s present in the binary string.
    static int optimizedCountBits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n & (n - 1);
        }
        return count;

    }

    public static void main(String[] args) {
        int N = 17; // 0001 0001
        System.out.println("Set Bits present in N: " + countBits(N));
        System.out.println("Set Bits present in N: " + optimizedCountBits(N));
        // System.out.println(Integer.bitCount(N));

    }
}
