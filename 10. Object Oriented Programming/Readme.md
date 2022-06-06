## Object Oriented Programming / Paradigm / Approch 
-----------------------------------------------------------

# Different approches to develope software?
-----------------------------------------------------------
1. Object oriented programming **
2. Prodcedural programming 
3. Functional programming [payment gateways are classic examples ]
4. Machine learning 


## Object: 
    - Instance of a class 
    - Object is a construct which mimics a real world entity.
## Class:
    - It's a blueprint / overall map 
    - example: A car blueprint lays down every technical and non-technical specification of the car and now using this blueprint , the factory can produce N number of cars.
    - A class has 2 broad division :
        - Class members aka fields, features
        - Methods aka Member function

Features: Are used for identifying objects 

Q: Which out of class and Object occpies memory?
Ans: Object takes memory 

## Features of OOP
-----------------------------------------------
1. Encapsulation : It's a idea to put data and methods together into a single entity. In java we use class to do encapsulation.

2. **Abstraction -> Data hiding** : Hiding unnecessary details 
- Reason to abstract :
    - **Abstracting out** / hiding unnecessary details makes software clean.
    - **Security**: At times we don't want critical thinks to be visible to other people.
    - **Loosely-Coupled System**: 
    - **Intefaces and Abstract Classes are mechanism to bring abstraction in code.**
- Data Hiding: Using Access specifiers we achieve data hiding in Java.
    - private 
    - protected
    - public 
    - default : 

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

**Q: Why is multiple inheritance is not supported in java?**
- Multiple is supported in java but not through class but ONLY through interfaces.
- **Diamond problem**: 

4. Polymorphism 
    - Compile time polymorpism 
    - Runtime polymorphism 

## Object Class : java.lang
----------------------------------------------------------------------




## GC: breif intro 
---------------------------------------------------------------------

- Island of isolation ?
- shadow class