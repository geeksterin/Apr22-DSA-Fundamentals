
interface waiter {
    public void takeOrder(String[] orders); // method prototype.

    public void serveOrder();
}

public class person implements waiter {
    public void takeOrder(String[] orders) {
        System.out.println("Taking orders");
    }

    public void serveOrder() {
        System.out.println("serving order");
    }

    public void playguitar() {

    }

    public static void main(String[] args) {

    }
}
