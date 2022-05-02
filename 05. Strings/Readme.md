##                   String Problems
---------------------------------------------------------------

### Why are Java Strings immutable?

1. String pools
2. Security 
3. Conncurreny and Thread safe.

### StringBuilder vs StringBuffer vs String class

1. The StringBuilder class provides no guarantee of synchronization whereas the StringBuffer class does. Therefore this class is designed for use as a drop-in replacement for StringBuffer in places where the StringBuffer was being used by a single thread (as is generally the case).

2. Where possible, it is recommended that this class be used in preference to StringBuffer as it will be faster under most implementations. Instances of StringBuilder are not safe for use by multiple threads. If such synchronization is required then it is recommended that StringBuffer be used.

- StringBuilder is faster than StringBuffer
- StringBuffer is safer than StringBuilder
**NOTE:** By default use StringBuilder 

Reference: https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/ 



1. https://leetcode.com/problems/check-if-the-sentence-is-pangram/ 
2. https://leetcode.com/problems/valid-anagram/ 
3. 