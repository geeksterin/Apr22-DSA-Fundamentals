public class pow {
    public static void main(String[] args) {
        int a = 2, b = 9;
        int ans = 1;

        while (b > 0) {
            if ((b & 1) == 1) {
                // odd
                ans = ans * a;
            }
            a = a * a;
            b = b >> 1;
        }
        System.out.println(ans);
    }
}
