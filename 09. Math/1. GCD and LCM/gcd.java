public class gcd {

    // Euclid's Algorithm : log(max(n,m))
    public static void main(String[] args) {
        // gcd : greatest common division aka HCF (highest common factor)
        System.out.println(gcd(10, 25));
    }

    static int gcd(int divisor, int dividend) {
        // Edge case
        if (divisor == 0)
            return dividend;
        if (dividend == 0)
            return divisor;

        // repeated division
        while (divisor != 0) {
            int rem = dividend % divisor; // 0th step.
            // re-assinging
            dividend = divisor;
            divisor = rem;
        }
        return dividend;
    }
}
