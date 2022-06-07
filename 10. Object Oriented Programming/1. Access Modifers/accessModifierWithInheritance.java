class Parent {
    /*
     * overridden method has
     * protected access modifier
     */
    protected void hello() {
        System.out.println("Alive is Awesome");
    }
}

public class accessModifierWithInheritance extends Parent {
    /*
     * overriding method has
     * default access modifier
     */
    void hello() {
        System.out.println("Be in present");
    }

    public static void main(String args[]) {
        Child obj = new Child();
        obj.hello();
    }
}