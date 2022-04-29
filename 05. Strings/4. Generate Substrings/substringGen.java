public class substringGen {
    public static void main(String[] args) {
        String str = "arun";

        // Method 1: Using Two for-loop and Stringbuilder
        // First loop for starting index
        for (int i = 0; i < str.length(); i++) {
            StringBuilder subStr = new StringBuilder();

            // Second loop is generating sub-String
            for (int j = i; j < str.length(); j++) {
                subStr.append(str.charAt(j));
                System.out.print(subStr + "\n");
            }
        }

        // for (int i = 0; i < str.length(); i++) {
        // for (int j = i + 1; j <= str.length(); j++) {
        // System.out.println(s.substring(i, j));
        // }
        // }
    }
}
