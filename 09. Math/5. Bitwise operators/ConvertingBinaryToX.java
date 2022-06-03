public class ConvertingBinaryToX {
    // Writig your own function to convert:
    // - Decimal --> Binary
    // - Decimal --> Octal
    // - Decimal --> Hexa

    static void DecimalToBinary(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.insert(0, (n & 1));
            n = n >> 1;
        }
        System.out.println(sb.toString());
    }

    static void binaryToOct(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.insert(0, (n & 07));
            n = n >> 3;
        }
        System.out.println(sb.toString());
    }

    static void binaryToHexDecimal(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.insert(0, (n & 0xF));
            n = n >> 4;
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        DecimalToBinary(10);
        // binaryToOct(10);
        // binaryToHexDecimal(15);
    }

}
