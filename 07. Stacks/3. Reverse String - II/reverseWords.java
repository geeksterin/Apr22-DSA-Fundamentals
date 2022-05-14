import java.util.Stack;

public class reverseWords {
    public static void main(String[] args) {
        String sentence = "Welcome to geekster classes. Hope you are doing good.";
        // Output: "good doing are you Hope . classes geekster to Welcome"

        Stack<String> stk = new Stack<>();
        for (var word : sentence.split(" ")) {
            stk.push(word);
        }
        
        // print
        while (!stk.empty()) {
            System.out.print(stk.peek() + " ");
            stk.pop();
        }

    }
}
