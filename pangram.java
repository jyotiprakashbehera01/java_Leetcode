

class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];
        for (char c : sentence.toCharArray()) {
            if ('a' <= c && c <= 'z') {
                seen[c - 'a'] = true;
            }
        }
        for (boolean present : seen) {
            if (!present) return false;
        }
        return true;
    }
}
public class pangram{
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        Solution sol = new Solution();
        System.out.println(sol.checkIfPangram(sentence)); // Output: true
    }
}