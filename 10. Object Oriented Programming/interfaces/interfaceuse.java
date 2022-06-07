
interface Person {
    void talk();

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

class navneet implements Person {
    public void talk() {
        System.out.println("navneet is talking");
    }

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

        Person p = new Arun();
        obj.login(p);
        p = new navneet();
        obj.login(p);


    }
}
