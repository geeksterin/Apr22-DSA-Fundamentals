public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Arun singh");
        // StringBuilder str2 = new StringBuilder("ABC");

        str.append("123");
        System.out.println(str);

        // from stringbuilder to string
        System.out.println(str.toString());

        str.delete(1, 5);
        System.out.println(str);

        StringBuffer s = new StringBuffer("Hello world");

     
    }
}