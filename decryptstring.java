class Solution {
    public String freqAlphabets(String s) {
        StringBuilder result = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {
            if (s.charAt(i) == '#') {
                // Extract two digits before '#'
                int num = Integer.parseInt(s.substring(i - 2, i));
                result.append((char) ('a' + num - 1));
                i -= 3; // Move past the digits and '#'
            } else {
                int num = s.charAt(i) - '0';
                result.append((char) ('a' + num - 1));
                i--;
            }
        }

        // Reverse because we built the string backwards
        return result.reverse().toString();
    }
}
public class decryptstring {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String s1 = "10#11#12";
        String s2 = "1326#";
        String s3 = "25#";

        System.out.println(sol.freqAlphabets(s1)); // Output: jkab
        System.out.println(sol.freqAlphabets(s2)); // Output: acz
        System.out.println(sol.freqAlphabets(s3)); // Output: y
    }
}