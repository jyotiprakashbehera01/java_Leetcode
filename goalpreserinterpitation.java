
class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        int i = 0, n = command.length();
        while (i < n) {
            char c = command.charAt(i);
            if (c == 'G') {
                sb.append('G');
                i++;
            } else if (c == '(') {
                if (i + 1 < n && command.charAt(i + 1) == ')') {
                    sb.append('o');
                    i += 2;
                } else {
                    sb.append("al");
                    i += 4; // skip "(al)"
                }
            } else {
                i++;
            }
        }
        return sb.toString();
    }
}

public class goalpreserinterpitation{
    public static void main(String[] args) {
        String command = "G()(al)";
        Solution sol = new Solution();
        String result = sol.interpret(command);
        System.out.println(result); // Output: Goal
    }
}
