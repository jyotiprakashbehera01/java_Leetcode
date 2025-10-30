

class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sorted = new String[words.length];
        for (String word : words) {
            int pos = word.charAt(word.length() - 1) - '1'; // index 0-based
            sorted[pos] = word.substring(0, word.length() - 1);
        }
        return String.join(" ", sorted);
    }
}

public class sortingsentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        Solution sol = new Solution();
        System.out.println(sol.sortSentence(s)); // Output: This is a sentence
    }
}