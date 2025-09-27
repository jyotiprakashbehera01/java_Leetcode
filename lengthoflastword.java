import java.util.Scanner;

class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        
        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        
        int length = 0;
        // Count last word length
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        
        return length;
    }
}

public class lengthoflastword{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        Solution sol = new Solution();
        int result = sol.lengthOfLastWord(s);

        System.out.println("Length of last word: " + result);

        sc.close();
    }
}
