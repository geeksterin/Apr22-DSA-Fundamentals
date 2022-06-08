
**What is interface:**
-------------------------------------------------------------------------------------------
- It' a construct which only contains abstract methods / method prototypes ie interface is all about actions that are allowed, not about data or implementation of those actions.
- ALL Variables/fields declared inside a interface are **public static final**.
- All method prototypes are **public by default.** 
- Interfaces brings in extensiblity and creates loosly coupled system. by following interface segregation principle of SOLID design principle.
- Interface can inherit multiple interfaces at once using **extends** keyword.


**Interface Default Methods**
----------------------------------------------------------------------------------------------
Before Java 8 Java interfaces could not contain an implementation of the methods, but only contain the method signatures. However, this results in some problems when an API needs to add a method to one of its interfaces. If the API just adds the method to the desired interface, all classes that implements the interface must implement that new method. That is fine if all implementing classes are located within the API. But if some implementing classes are located in client code of the API (the code that uses the API), then that code breaks.

Let me illustrate this with an example. Look at this interface and imagine that it is part of e.g. an open source API which many applications are using internally:

```
public interface ResourceLoader {
    Resource load(String resourcePath);
}
```
Now imagine that a project uses this API and has implemented the ResourceLoader interface like this:

```
public class FileLoader implements ResourceLoader {

    public Resource load(String resourcePath) {
        // in here is the implementation +
        // a return statement.
    }
}
```
If the developer of the API wants to add one more method to the ResourceLoader interface, then the FileLoader class will be broken when that project upgrades to the new version of the API.

To alleviate this Java interface evolution problem, Java 8 has added the concept of interface default methods to Java interfaces. An interface default method can contain a default implementation of that method. Classes that implement the interface but which contain no implementation for the default interface will then automatically get the default method implementation.

You mark a method in an interface as a default method using the default keyword. Here is an example of adding a default method to the ResourceLoader interface:

```
public interface ResourceLoader {

    Resource load(String resourcePath);

    default Resource load(Path resourcePath) {
        // provide default implementation to load
        // resource from a Path and return the content
        // in a Resource object.
    }

}
```
This example adds the default method load(Path). The example leaves out the actual implementation (inside the method body) because this is not really interesting. What matters is how you declare the interface default method.

A class can override the implementation of a default method simply by implementing that method explicitly, as is done normally when implementing a Java interface. Any implementation in a class takes precedence over interface default method implementations.

