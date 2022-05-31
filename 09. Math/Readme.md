##              Mathematics for Computing 
-------------------------------------------------------------------------------
###  GCD aka H.C.F:
- Found using Euclid's Algorithm in log(max(a,b)) 
- Relationship b/w HCF and LCM : **A*B = gcd(A,B) * LCM(A,B)**

---------------------------------------------------------------------------------
### Primality test : Methods to test a given number is prime or not.
-   Approch 1 : Generates all factors and check if factors > 2 or not.
-   Approch 2 : Same as above but now only check till Sqrt(N).
-   Approch 3 : Approch 2 is optimized by checking only 6n+1 and 6n-1 element only. 

----------------------------------------------------------------------------------
###  Generating primes:
- Seive of erathosenes 

----------------------------------------------------------------------------------
### Bitwise operators
1. **&** : Bitwise and  **(This is equivalent to bitwise multiplication)** 
2. **|** : Bitwise OR **(This is equivalent to bitwise OR)**
3. **^** : Bitwise XOR 
    - Odd ones detector (BEST WAY)
    - Addition with modulo 2 

4. **<<** : Bitwise left shift , a shift of k steps towards left is equal to multiplying by 2^k.
5. **>>** : Bitwise right shift , a shift of k steps towards right is dividing by 2^k.
6. **~**  : Bitwise complement 

----------------------------------------------------------------------------------
- What is overflow condition while storing numbers and HOW it happens.
- Basic Bit Manipulation
    - Check even or odd using bitwise. 
    - Check if Kth bit is set or not.
    - Set the kth bit.
    - Unset the kth bit.
    - Toggle the Kth bit 
    - Unsetting the rightmost set bit.
    - Writig your own function to convert:
        - Decimal --> Binary
        - Decimal --> Octal 
        - Decimal --> Hexa 

- Count number of set bits 
- Check power of two and power of 4 
 <!-- n != 0 && ((n&(n-1)) == 0) && (n & 0xAAAAAAAA) == 0; -->
- pow(a,b)

- Find the missing number.
- Taking number complement. 
- Reversing bits.
- Check number of zeros in factorials


7. Modular Arithematic 
    - What is 
    - Why ***
    - How 

----------------------------------------------------------------------------------
### Power of Two
1. 2^0 = 1
2. 2^1 = 2
3. 2^2 = 4
3. 2^3 = 8
4. 2^4 = 16
5. 2^5 = 32
6. 2^6 = 64
1. 2^7 = 128
2. 2^8 = 256
3. 2^9 = 512
4. 2^10 = 1024
5. 2^11 = 2048
6. 2^12 = 