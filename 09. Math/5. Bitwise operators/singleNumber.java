public class singleNumber {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 4, 6, 10, 1, 10, 4 };
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        System.out.println(ans);
    }
}
