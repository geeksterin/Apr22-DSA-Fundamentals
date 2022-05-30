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
        int factors = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                factors++;
        }
        if (factors > 0)
            return false;
        return true;
    }
}
