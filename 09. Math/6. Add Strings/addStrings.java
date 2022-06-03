public class addStrings {

    static String method_1(String n, String m) {
        int a = Integer.parseInt(n);
        int b = Integer.parseInt(m);
        return Integer.toString(a + b);
    }

    static String method_2(String n, String m) {
        // convert n into interger datatype
        int a = 0;
        for (int i = 0; i < n.length(); i++) {
            a = a * 10 + (n.charAt(i) - '0');
        }

        int b = 0;
        for (int i = 0; i < m.length(); i++) {
            b = b * 10 + (m.charAt(i) - '0');
        }
        return Integer.toString(a + b);
    }

    public static void main(String[] args) {
        String num1 = "124";
        String num2 = "1999";
        // System.out.println(method_1(num1, num2));
        // System.out.println(method_2(num1, num2));

        System.out.println(addStrings("124", "1999"));

    }

    static String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder ans = new StringBuilder();
        int carry = 0;

        // This while loop stops when either of the number is exhausted in length
        while (i >= 0 && j >= 0) {
            int sum = (num1.charAt(i) - '0') + (num2.charAt(j) - '0') + carry;
            int resultant = sum % 10;
            carry = sum / 10;
            ans.append(resultant);
            --i;
            --j;
        }
        // This while only runs if first number is longer than second number
        while (i >= 0) {
            int sum = (num1.charAt(i) - '0') + carry;
            int resultant = sum % 10;
            carry = sum / 10;
            ans.append(resultant);
            --i;
        }
        /// This while only runs if second number is longer than first number
        while (j >= 0) {
            int sum = (num2.charAt(j) - '0') + carry;
            int resultant = sum % 10;
            carry = sum / 10;
            ans.append(resultant);
            --j;
        }
        // so for left over carry
        // 999+1 = 1000
        if (carry > 0) {
            ans.append(carry);
        }

        ans.reverse();
        return ans.toString();
    }
}