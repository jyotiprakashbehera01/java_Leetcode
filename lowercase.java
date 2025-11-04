public class lowercase {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        System.out.println(solution.toLowerCase("Hello"));     // Output: hello
        System.out.println(solution.toLowerCase("LOVELY"));    // Output: lovely
        System.out.println(solution.toLowerCase("LeetCode"));  // Output: leetcode
        System.out.println(solution.toLowerCase("123ABCxyz")); // Output: 123abcxyz
    }
}

class Solution {
    public String toLowerCase(String s) {
        if (s == null || s.length() == 0) return s;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c >= 'A' && c <= 'Z') {
                chars[i] = (char)(c + 32); // Convert uppercase to lowercase
            }
        }
        return new String(chars);
    }
}
