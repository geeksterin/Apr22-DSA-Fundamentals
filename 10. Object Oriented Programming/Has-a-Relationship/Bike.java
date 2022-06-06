public class Bike {
    // This is a composition relationship
    // Nested class
    class Engine {
        // properties/fields
        // method
        String SerialNumber = "100";

    }

    Engine e = new Engine();
    // This engine object is behaving as a member variable

    int color;
    int milage;

    // method
    void power() {

    }

    public static void main(String[] args) {
        Bike b = new Bike();
        System.out.println(b.e.SerialNumber);
        
    }
}
