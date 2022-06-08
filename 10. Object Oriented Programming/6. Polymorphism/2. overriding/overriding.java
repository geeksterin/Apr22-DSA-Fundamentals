class A {
    void func() {
        System.out.println("Inside class A");
    }
}

public class overriding extends A {

    // this func shadows the func of class A aka shadowing
    // this is known as overriding
    @Override // annotation :
    // annotation makes compiler alert to check for errors
    void func() {
        System.out.println("Inside class overriding");
        System.out.println(2 + 4);
    }

    public static void main(String[] args) {
        overriding obj = new overriding();
        obj.func(); // which func will be called
    }
}
