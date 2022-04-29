import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {
        String s = "Arun";
        String t = "urnAsfsaf";

        if (s.length() == t.length()) {
            char[] charS = s.toCharArray();
            char[] charT = t.toCharArray();

            Arrays.sort(charS); // nlogn
            Arrays.sort(charT); // nlogn

            boolean flag = true;

            for (int i = 0; i < charS.length; i++) {
                if (charS[i] != charT[i]) {
                    System.out.println("NOT ANAGRAM");
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.err.println("ANAGRAM");
            }

        } else
            System.out.println("NOT ANAGRAM");

    }
}
