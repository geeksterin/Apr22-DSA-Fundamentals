public class ReverseInteger {
    public static void main(String[] args) {
        // Check for overflows if overflow happens then PRINT overflow.
        // A negative number must be negative

        boolean isNegative = false;
        long res = 0;

        int num = 1200;
        if (num < 0) {
            isNegative = true;
            num = (int) -1 * num;
        }

        // Reverse the number.
        while (num > 0) {
            int RMD = (int) num % 10;
            res = res * 10 + RMD;
            num = (int) num / 10;
        }

        // Overflow check
        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            System.out.println("OVERFLOW");
        } else if (isNegative == true) {
            System.out.println(res * -1);
        } else
            System.err.println(res);

    }
}
