public class main {
    public static void main(String[] args) {
        //
        if (isPrime(31) == true) {
            System.out.println("It's a PRIME no.");
        } else
            System.out.println("Not a PRIME No.");
    }

    // TC: O(sqrt(N))
    // SC: O(1)
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        // 2 is the smallest and the one and only even prime
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i <= Math.sqrt(n); i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }
}
