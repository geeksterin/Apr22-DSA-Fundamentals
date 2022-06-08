
## Polymorphism 
    - Compile time polymorpism : method overloading
    - Runtime polymorphism : method overriding

- Interfaces formalize polymorphism. Interfaces allow us to define polymorphism in a declarative way, unrelated to implementation. Two elements are polymorphic with respect to a set of behaviors if they realize the same interfaces. You always heard that polymorphism was this big benefit of object orientation, but without interfaces there was no way to enforce it, verify it, or even express it, except in informal ways, or language-specific ways. Formalization of interfaces strips away the mystery, and gives us a good way to describe, in precise terms, what polymorphism was trying to do all along. Interfaces are testable, verifiable, and precise.

- Interfaces are the key to the "plug-and-play" ability of an architecture. Classes that realize the same interface may be substituted for one another in the system, thereby supporting the changing of implementations without affecting clients.

