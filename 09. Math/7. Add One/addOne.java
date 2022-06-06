import java.util.ArrayList;

public class addOne {

    public static void main(String[] args) {
        int digits[] = { 1, 3, 4, 9 };

        int res[] = addOne(digits);
        for (var x : res) {
            System.out.print(x + ",");
        }
    }

    static int[] addOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += carry;
            if (digits[i] <= 9) {
                return digits;
            }
            digits[i] = 0;
        }
        ArrayList<Integer> res = new ArrayList<>(digits);
        res.add(0, 1);
        return res.toArray();

    }
}
