
interface Person {
    // interfaces can contain public static final propteries
    public static final int a = 100;

    // interface can also contain static methods.
    public static void greet() {
        System.out.println("Hello guys");
    }

    default public void talk() {
        System.out
                .println("This is the default implmentation of talk method, since the base class didn't override me!");
    }

    void walk();
}

class Arun implements Person {
    public void talk() {
        System.out.println("Arun is talking");
    }

    public void walk() {
        System.out.println("Arun is walking");
    }
}

// class navneet doesn't implements talk() method, ie it gets the default
// implementation.
class navneet implements Person {
    public void walk() {
        System.out.println("navneet is walking");
        String name = "arun";
    }
}

public class interfaceuse {

    // dealing with interface as a parameter
    void login(Person p) {
        System.out.println("Inside login");
        p.walk();
        p.talk();
    }

    public static void main(String[] args) {
        interfaceuse obj = new interfaceuse();
        // Arun a = new Arun();
        // navneet n = new navneet();
        // obj.login(a); //correct
        // obj.login(n); //incorrect

        // Person p = new Arun();
        // obj.login(p);

        Person p = new navneet();
        obj.login(p);

        // System.out.println(Person.a);
        // Person.greet();

    }
}
