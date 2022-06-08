class Engine {
    private String SerialNumber;

    Engine(String serialNo) {
        System.out.println("Engine created");
        this.SerialNumber = serialNo;
    }

    void start() {
        System.out.println("engine started!");
    }
}

public class Bike {
    private int color;
    private int milage;
    private String brandName;

    // composition: if bike object gets destroyed then engine object will also get
    // destroyed ie. strong coupling.
    Bike(String serialno) {
        Engine e = new Engine(serialno);
        e.start();
    }

    // methods
    void power() {

    }

    public static void main(String[] args) {
        Bike b = new Bike("12244");
    }
}
