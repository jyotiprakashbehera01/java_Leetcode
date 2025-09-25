class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Start with the first string as the prefix
        String prefix = strs[0];

        // Compare prefix with each string
        for (int i = 1; i < strs.length; i++) {
            // Reduce prefix until it matches the start of strs[i]
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}

public class commonprifix{
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};
        String[] strs3 = {"interstellar", "internet", "internal"};

        System.out.println("Longest Common Prefix 1: " + solution.longestCommonPrefix(strs1)); // "fl"
        System.out.println("Longest Common Prefix 2: " + solution.longestCommonPrefix(strs2)); // ""
        System.out.println("Longest Common Prefix 3: " + solution.longestCommonPrefix(strs3)); // "inte"
    }
}
