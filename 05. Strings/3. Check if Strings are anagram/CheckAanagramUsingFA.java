public class CheckAanagramUsingFA {
    public static void main(String[] args) {
        String s = "arun";
        String t = "uran";

        if (s.length() == t.length()) {
            int fa[] = new int[26];
            for (int i = 0; i < s.length(); i++) {
                fa[s.charAt(i) - 'a']++;
            }
            for (int i = 0; i < t.length(); i++) {
                if (fa[t.charAt(i) - 'a'] <= 0) {
                    System.out.println("NOT ANAGRAM");
                } else
                    fa[t.charAt(i) - 'a']--;
            }
            //
            for (int i = 0; i < 26; i++) {
                if (fa[i] != 0)
                    System.out.println("NOT ANAGRAM");
            }
            System.out.println("ANAGRAM");
        } else
            System.out.println("NOT ANAGRAM");
    }
}
