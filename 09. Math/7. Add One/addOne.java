public class addOne {

    public static void main(String[] args) {
        int digits[] = { 1, 3, 4, 9 };

        System.out.println(addOne(digits));
    }

    static int[] addOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += carry;
            if (digits[i] <= 9) // early return
                return digits;
            digits[i] = 0;
        }
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}
