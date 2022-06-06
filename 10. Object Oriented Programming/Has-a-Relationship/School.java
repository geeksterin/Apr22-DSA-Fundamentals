public class School {
    String name = "LPU";
    static Teachers obj;

    // methods
    static Teachers staff() {
        obj = new Teachers();
        return obj;
    }

    public static void main(String[] args) {
        School s = new School();
        System.out.println(staff());
    }
}

class Teachers {
    String name = "abc";
    int age = 29;

}
