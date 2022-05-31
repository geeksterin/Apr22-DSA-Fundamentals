import java.util.*;

public class numbersystem {
    public static void main(String[] args) {
        // NOTE: By default the number is treated as decimal number
        System.out.println(1010);

        // NOTE: 0b prefix which must appended in front to treat number as binary
        System.out.println(0b1010); // interpreated as binary

        // NOTE: 0 prefix which must appended in front to treat number as ocatl
        System.out.println(01010); // interpreated as octal number

        // NOTE: 0x prefix which must appended in front to treat number as hexadecimal
        System.out.println(0x10); // interpreated as hexadecimal

        // Inbuilt way to convert Decimal --> to other number system.
        // -------------------------------------------------------------------------------
        // System.out.println(Integer.toBinaryString(a));
        // System.out.println(Integer.toHexString(a));
        // System.out.println(Integer.toOctalString(a));

        // System.out.println(Integer.toString(100, 2)); // Decimal --> binary
        // System.out.println(Integer.toString(100, 8)); // Decimal --> octal
        // System.out.println(Integer.toString(100, 16)); // Decimal --> Hexadecimal

        // ----------------------------------------------------------------------------------
        // Inbuilt way to convert other number System --> Decimal
        System.out.println(Integer.parseInt("10010", 10));
        System.out.println(Integer.parseInt("10010", 2));
        System.out.println(Integer.parseInt("10010", 8));
        System.out.println(Integer.parseInt("400", 16));

    }
}
