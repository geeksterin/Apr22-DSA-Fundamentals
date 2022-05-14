import java.util.Stack;

public class reverseString {
    public static void main(String[] args) {
        String str = "arun singh";
        // Use collection framework stack
        Stack<Character> stk = new Stack<>();
        for (char ch : str.toCharArray()) {
            stk.push(ch);
        }

        // print stack elements
        while (!stk.empty()) {
            System.out.print(stk.peek() + "");
            stk.pop();
        }

    }
}
