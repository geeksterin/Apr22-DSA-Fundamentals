import java.util.Stack;

public class alph {
    public static void main(String[] args) {
        String str = "LeEeetcCodeE";
        Stack<Character> stk = new Stack<>();

        for (var ch : str.toCharArray()) {
            if (!stk.empty() && Math.abs(stk.peek() - ch) == 32) {
                stk.pop();
            } else
                stk.push(ch);
        }

        StringBuilder res = new StringBuilder();
        while (!stk.empty()) {
            res.append(stk.peek());
            stk.pop();
        }

        res.reverse();
        System.out.println(res.toString());

    }
}
