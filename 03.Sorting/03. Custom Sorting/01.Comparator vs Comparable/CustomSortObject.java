
import java.util.*;

class Employee {
    int salary;
    String name;

    Employee(int sal, String name) {
        this.salary = sal;
        this.name = name;
    }

}

public class CustomSortObject {

    // Old way of doing
    static class comp implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            Employee f = (Employee) o1;
            Employee s = (Employee) o2;
            return s.salary - f.salary;
        }
    }

    public static void main(String[] args) {
        // 1. Arrange employees based on decreasing of salary .
        Employee arr[] = {
                new Employee(1000, "singh"),
                new Employee(2000, "singh"),
                new Employee(3000, "singh"),
                new Employee(90000, "xyz"),
                new Employee(4500, "ar"),
                new Employee(3500, "arun"),
                new Employee(4000, "arun"),
        };

        // Arrays.sort(arr, (ob1, ob2) -> {
        // return ob2.salary - ob1.salary; // sorts in decreasing order of salary
        // });

        // Arrays.sort(arr, new comp());
        // ---------------------------------------------------------------------------

        // 2. Arranage in decreasing order of name length.
        // Arrays.sort(arr, (ob1, ob2) -> {
        // return ob2.name.length() - ob1.name.length();
        // });
        // ---------------------------------------------------------------------------

        // 3. Arrange same name employees in decreasing order of their salary , and for
        // the rest leave them as it is.
        Arrays.sort(arr, (ob1, ob2) -> {
            if (ob2.name.equals(ob1.name) == true) {
                return ob2.salary - ob1.salary;
            } // sorts in decreasing order of salary
            return 0;
        });

        // foreach loop with var keyword.
        for (Employee x : arr) {
            System.out.println(x.salary + ": " + x.name);
        }

    }
}
