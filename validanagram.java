import java.util.Scanner;

class Solution {
    public boolean isAnagram(String s, String t) {
        s = s.toLowerCase().trim();
        t = t.toLowerCase().trim();

        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }
}

public class validanagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        boolean result = sol.isAnagram(s1, s2);
        System.out.println("Are the strings anagrams? " + result);

        sc.close();
    }
}
