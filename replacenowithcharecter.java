class Solution {
    public String replaceDigits(String s) {
        char[] arr = s.toCharArray();
        for (int i = 1; i < arr.length; i += 2) {
            // Convert digit character to integer
            int shift = arr[i] - '0';
            // Replace digit with shifted letter
            arr[i] = (char)(arr[i - 1] + shift);
        }
        return new String(arr);
    }
}
public class replacenowithcharecter {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.replaceDigits("a1c1e1")); // Output: "abcdef"
        System.out.println(sol.replaceDigits("a1b2c3d4e")); // Output: "abbdcfdhe"
    }
}
