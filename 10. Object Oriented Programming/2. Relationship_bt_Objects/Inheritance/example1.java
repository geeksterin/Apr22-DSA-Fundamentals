
class parent {
    String serial;
}

public class child extends parent {
    String name;

    public static void main(String[] args) {
        child c = new child();
        c.serial = "10";
        c.name = "arun";
    }
}
