public class addStrings {
    public static void main(String[] args) {
        System.out.println(addStrings("124", "1999"));
    }
    
    static String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder ans = new StringBuilder();
        int carry = 0;

        while (i >= 0 && j >= 0) {
            int sum = (num1.charAt(i) - '0') + (num2.charAt(j) - '0') + carry;
            int resultant = sum % 10;
            carry = sum / 10;
            ans.append(resultant);
            --i;
            --j;
        }
        while (i >= 0) {
            int sum = (num1.charAt(i) - '0') + carry;
            int resultant = sum % 10;
            carry = sum / 10;
            ans.append(resultant);
            --i;
        }
        while (j >= 0) {
            int sum = (num2.charAt(j) - '0') + carry;
            int resultant = sum % 10;
            carry = sum / 10;
            ans.append(resultant);
            --j;
        }
        while (carry > 0) {
            int resultant = carry % 10;
            carry = carry / 10;
            ans.append(resultant);
        }

        ans.reverse();
        return ans.toString();
    }
}