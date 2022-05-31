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
    // NOTE 1: Factors appear in Pairs (a,b)
    // NOTE 2: Factors follow a unique pattern of arrangement such that one factor (a) appears 
    // before Sqrt(N) and other (b) appears after Sqrt(N) and sqrt(N) is also inclusive.
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
