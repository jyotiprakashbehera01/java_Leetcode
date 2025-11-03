class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int x = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int y = (j >= 0) ? num2.charAt(j) - '0' : 0;
            int sum = x + y + carry;

            sb.append((char)('0' + (sum % 10)));
            carry = sum / 10;

            i--;
            j--;
        }

        return sb.reverse().toString();
    }
}

public class addstring {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String num1 = "123";
        String num2 = "1";

        String result = solution.addStrings(num1, num2);
        System.out.println("Sum: " + result);  // Output: Sum: 1110
    }
}