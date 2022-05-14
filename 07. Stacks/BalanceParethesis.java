import java.util.*;

//TC: O(N)
//SC :O(N)
public class BalanceParethesis {
    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '(' || currentChar == '[' || currentChar == '{')
                stack.push(currentChar);

            else if (stack.empty())
                return true;
            if (currentChar == ')' && stack.peek() != '(') {
                stack.pop();
            }
            if (currentChar == ']' && stack.peek() != '[') {
                stack.pop();
            }
            if (currentChar == '}' && stack.peek() != '{') {
                stack.pop();

            }

        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String s = "()(()){{}}[{}]";
        System.out.println(isValid(s));
    }
}