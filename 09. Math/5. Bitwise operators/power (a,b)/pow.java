public class pow {

    // TC: O(lg(N))
    static int power(int a, int b) {
        int ans = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                ans = ans * a;
            }
            a = a * a;
            b = b >> 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        int a = 6, b = 9;
        System.out.println(power(a, b));
    }
}
