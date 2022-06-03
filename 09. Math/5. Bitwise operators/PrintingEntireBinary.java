public class PrintingEntireBinary {
    public static void main(String[] args) {
        int num = 7;
        StringBuilder res = new StringBuilder();
        for (int i = 31; i >= 0; i--) {
            int mask = 1 << i;
            res.append((num & mask) > 0 ? "1" : "0");

            if (i % 4 == 0) {
                res.append(" ");
            }
        }
        System.out.println(res.toString());
    }
}
