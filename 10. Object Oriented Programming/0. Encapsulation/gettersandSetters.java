
// 1. Security 
// 2. Filteration or permission can set using setters 
class Person {
    private String name;
    private int age;

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0 || age >= 100) {
            System.out.println("Please enter a valid age");
            return;
        }
        this.age = age;
    }

    // getters
    public String getName() {
        return this.name;
        //add some logic to return in JSON / XML.
    }

    public int getAge() {
        return this.age;
    }
}

public class gettersandSetters {
    public static void main(String[] args) {
        Person p = new Person();
        // It's a highly bad practice.
        // p.name = "arun";
        // p.age = 27;
        p.setName("arun");
        p.setAge(-27);
        System.out.println(p.getName() + ":" + p.getAge());
    }
}
