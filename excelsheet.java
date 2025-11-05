public class excelsheet {

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test examples
        System.out.println(sol.convertToTitle(1));   // Output: A
        System.out.println(sol.convertToTitle(28));  // Output: AB
        System.out.println(sol.convertToTitle(701)); // Output: ZY
        System.out.println(sol.convertToTitle(2147483647)); // Large number test
    }
}

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        
        while (columnNumber > 0) {
            columnNumber--; // Because Excel columns start at 1 (A = 1)
            char ch = (char) ('A' + (columnNumber % 26));
            result.insert(0, ch); // prepend the character
            columnNumber /= 26;   // move to next digit
        }
        
        return result.toString();
    }
}
