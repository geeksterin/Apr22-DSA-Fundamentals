public class reverseInteger2 {
    public static void main(String[] args) {
        // Check for overflows if overflow happens then PRINT overflow.
        // A negative number must be negative
        boolean isNegative = false;
        int res = 0;

        int num = -1999999999;
        if (num < 0) {
            isNegative = true;
            num = -1 * num;
        }

        while (num > 0) {
            int RMD = num % 10;
            // Running Overflow check.
            int tmp = res * 10 + RMD;
            if (tmp / 10 != res) {
                System.out.println("OVERFLOW");
                break;
            } else
                res = tmp;
            num = num / 10;
        }

        if (isNegative == true) {
            System.out.println(res * -1);
        } else
            System.err.println(res);

    }
}
