## Relationship between Objects
-----------------------------------------------------------------------------------------------
Relationship b/w objects can be expressed using 2 ways
### Inheritance: (IS-A relationship)
    - Inheritance depicits IS-A relationship b/w two objects. In other words when two objects exhibits 
    parent-child relationship then inheritance is used. 
    - It brings code reusability 

### Association
1. **Aggregation:(Loose relationship):**
    - It represents **Has-A’s relationship.**
    - It is a unidirectional association i.e. a one-way relationship. For example, a department can have students but vice versa is not possible and thus unidirectional in nature.
   -  What distinguishes it from composition, that it doesn't involve owning. As a result, the lifecycles of the objects aren't tied: every one of them can exist independently of each other.

2. **Composition: (Strong relationship)**
    - It represents **part-of or belongs-to relationship**.
    - In composition, lifecycle of both entities/objects are tied together therefore they dependent on each other.
    - When there is a composition between two entities, the composed object cannot exist without the other entity.
    - Example: 
        -  The room is destroyed with building 
        -  Human cannot exit without heart.
        -  A vehicle cannot exits without engine.


NOTE: Code reuse is best achieved by aggregation.  
--------------------------------------------------------------------------------------------------
## 2. Inheritance

**Merits:**
- Inheritance promotes reusability. When a class inherits or derives another class, it can access all the functionality of inherited class.
- Reusability enhanced reliability. The base class code will be already tested and debugged.
- Reusablitiy brings cost and time reducation .
- Inheritance makes the sub classes follow a standard interface.

**Demrits**:
- Creates a strong coupling between the base class and derived class.

### Which one to use inheritance or composition
-   To get the higher design flexibility, the design principle says that composition should be favored over inheritance. 

- Inheritance should only be used when subclass ‘is a’ superclass. Don’t use inheritance to get code reuse. If there is no ‘is a’ relationship, then use composition for code reuse.

-   The fact that Java does not support multiple inheritances is one reason for favoring composition over inheritance in Java. Since you can only extend one class in Java, but if you need multiple features, such as reading and writing character data into a file, you need Reader and Writer functionality. It makes your job simple to have them as private members, and this is called Composition.
Composition offers better test-ability of a class than Inheritance. If one class consists of another class, you can easily construct a Mock Object representing a composed class for the sake of testing. This privilege is not given by inheritance.


## Types of inheritance



**Q: Why is multiple inheritance is not supported in java?**
- Multiple is supported in java but not through class but ONLY through interfaces.
- **Diamond problem**: 
----------------------------------------------------------------------------------------------------