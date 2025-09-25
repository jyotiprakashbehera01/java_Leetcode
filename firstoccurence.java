class Solution {
    public int strStr(String haystack, String needle) {
        // Edge case: empty needle
        if (needle.length() == 0) return 0;

        int n = haystack.length();
        int m = needle.length();

        // Loop through haystack
        for (int i = 0; i <= n - m; i++) {
            // Compare substring with needle
            if (haystack.substring(i, i + m).equals(needle)) {
                return i; // Found match
            }
        }

        return -1; // Not found
    }
}

public class firstoccurence {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String haystack1 = "hello";
        String needle1 = "ll";
        System.out.println("Result 1: " + solution.strStr(haystack1, needle1)); // 2

        String haystack2 = "aaaaa";
        String needle2 = "bba";
        System.out.println("Result 2: " + solution.strStr(haystack2, needle2)); // -1

        String haystack3 = "leetcode";
        String needle3 = "code";
        System.out.println("Result 3: " + solution.strStr(haystack3, needle3)); // 4
    }
}
