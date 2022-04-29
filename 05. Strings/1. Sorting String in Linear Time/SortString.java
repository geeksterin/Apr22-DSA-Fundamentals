public class SortString {
    public static void main(String[] args) {
        String str = "abcsgzdgaxgszgdexyzt";
        int fa[] = new int[26]; // O(1)

        // TC:O(N): length of string
        for (int i = 0; i < str.length(); i++) {
            fa[str.charAt(i) - 'a']++;
        }

        // generate the sorted string as output
        String ans = "";
        for (int i = 0; i < 26; i++) {
            while (fa[i] > 0) {
                ans = ans + (char) (i + 'a');
                fa[i]--;
            }
        }
        System.out.println(ans);
    }
}
