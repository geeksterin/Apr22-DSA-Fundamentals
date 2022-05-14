import java.util.Stack;

public class balanceParenthesis {
    public static void main(String[] args) {
        String str = "))(())()((";

        Stack<Character> stk = new Stack<>();
        for (var ch : str.toCharArray()) {
            if (!stk.empty() && stk.peek() == '(' && ch == ')') {
                stk.pop();
            } else
                stk.push(ch);
        }

        if (stk.empty()) {
            System.out.println("String has balanced parenthesis");
        } else {
            System.out.println("Not balanced");
        }

    }
}
