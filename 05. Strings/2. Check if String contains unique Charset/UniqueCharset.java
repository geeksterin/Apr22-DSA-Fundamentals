public class UniqueCharset {
    // TC : O(N)
    // SC : O(1)
    public static void main(String[] args) {
        // https://www.geeksforgeeks.org/determine-string-unique-characters/
        // String str = "abcdabxyz";
        String str = "abcsgzdgaxgszgdexyzt";

        int fa[] = new int[26]; // O(1)

        // TC:O(N): length of string
        for (int i = 0; i < str.length(); i++) {
            fa[str.charAt(i) - 'a']++;
            if (fa[i] > 1) {
                System.out.println("Contains duplicate!");
                break;
            }
        }
    }
}
