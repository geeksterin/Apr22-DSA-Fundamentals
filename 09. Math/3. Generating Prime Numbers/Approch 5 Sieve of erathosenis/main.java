
public class main {
    static void sieveOfEratosthenes(int n) {
        // so that N is also covered as part of index
        boolean primes[] = new boolean[n + 1];
        for (int i = 0; i < primes.length; i++) {
            primes[i] = true;
        }

        // sieve of
        for (int i = 2; i < primes.length; i++) {
            if (primes[i] == true) {
                for (int j = 2 * i; j < primes.length; j = j + i) {
                    primes[j] = false;
                }
            }
        }

        // Print all prime numbers
        for (int i = 2; i <= n; i++) {
            if (primes[i] == true)
                System.out.print(i + " ");
        }
    }

    // TC: O(N*lglgN)
    static void optimizedSieveOfEratosthenes(int n) {
        // so that N is also covered as part of index
        boolean primes[] = new boolean[n + 1];
        for (int i = 0; i < primes.length; i++) {
            primes[i] = true;
        }
        // 1. Optimization 1: i < Math.sqrt(N)
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (primes[i] == true) {
                // 2. Optimization : j = i^2;
                for (int j = i * i; j < primes.length; j = j + i) {
                    primes[j] = false;
                }
            }
        }

        // Print all prime numbers
        for (int i = 2; i <= n; i++) {
            if (primes[i] == true)
                System.out.print(i + " ");
        }
    }

    // Driver Program to test above function
    public static void main(String args[]) {
        int n = 100;
        System.out.println("Following are the prime numbers:");
        optimizedSieveOfEratosthenes(n);
    }
}
