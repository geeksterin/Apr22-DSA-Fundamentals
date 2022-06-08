interface human {
    void sleep();

    void eat();

    void talk();
}

interface person {
    void fight();
}

// Man interface extends multiple interfaces 
interface man extends human, person {
    void cry();

    void laugh();
}

public class multiple_inheritance_interface implements man {
    public static void main(String[] args) {

    }
}
