import java.util.Stack;

class MyStack {
    static int MAX = 10;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        return (top < 0);
    }

    MyStack() {
        top = -1; // means it's not pointing to any valid object/input.
    }

    // INSERT operation in stack is called PUSH
    boolean push(int x) {
        // check if the underlying array is empty or not.
        if (top >= MAX - 1) {
            System.out.println("Stack overflow");
            return false;
        }
        // top +=1;
        // a[top] = x;
        a[++top] = x;
        return true;
    }

    // DELETE operation in stack is called POP
    int pop() {
        // check if stack is empty
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            // int x = a[top];
            // top = top-1;
            int x = a[top--];
            return x;
        }
    }

    // Peek is for displaying the top element to user.
    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }

    void print() {
        for (int i = top; i > -1; i--) {
            System.out.print(" " + a[i]);
        }
    }

    public static void main(String args[]) {
        MyStack s = new MyStack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is :" + s.peek());
        System.out.print("Elements present in stack :");
        s.print();

        // Stack Collections.
        Stack<Integer> stk = new Stack<>();

    }
}
