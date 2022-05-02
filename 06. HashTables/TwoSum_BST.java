import java.util.Stack;

import org.w3c.dom.Node;

public class TwoSum_BST {
    public static void main(String[] args) {
        // Inorder traversal of BST
        Stack<Node> stk = new Stack<>();
        while (true) {
            while (root != null) {
                stk.push(root);
                root = root.left;
            }
            if (stk.empty() == true)
                break;

            Node tmp = stk.peek();
            seq.add(tmp.Key);
            stk.pop();
            root = tmp;
        }
        // Two pointer approch to solve it O(N).

    }
}
