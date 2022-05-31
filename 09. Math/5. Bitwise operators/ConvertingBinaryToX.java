public class ConvertingBinaryToX {
    // Writig your own function to convert:
    // - Decimal --> Binary
    // - Decimal --> Octal
    // - Decimal --> Hexa

    public static void main(String[] args) {
        binaryToOct(20);
    }

    static void binaryToOct(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.insert(0, n & 07);
            n = n >> 3;
        }
        System.out.println(sb.toString());
    }
}
