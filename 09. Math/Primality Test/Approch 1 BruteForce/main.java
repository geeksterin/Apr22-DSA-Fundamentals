public class main {
    public static void main(String[] args) {
        //
        if (isPrime(10) == true) {
            System.out.println("It's a PRIME no.");
        } else
            System.out.println("Not a PRIME No.");

    }

    // TC: O(N)
    // SC: O(1)
    static boolean isPrime(int n) {
        // Prime: has only and only 2 factors ( 1, and the number itself)
        int factors = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                factors++;
        }
        if (factors > 2)
            return false;
        return true;
    }
}
