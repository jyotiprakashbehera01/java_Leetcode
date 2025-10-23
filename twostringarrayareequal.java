import java.util.*;

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // Using StringBuilder method
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for (String w : word1) {
            s1.append(w);
        }
        for (String w : word2) {
            s2.append(w);
        }

        return s1.toString().equals(s2.toString());
    }
}



public class twostringarrayareequal{
    public static void main(String[] args) {
        // Create Scanner for user input
        Scanner sc = new Scanner(System.in);

        // Input first string array
        System.out.print("Enter number of elements in word1: ");
        int n1 = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] word1 = new String[n1];
        System.out.println("Enter elements of word1:");
        for (int i = 0; i < n1; i++) {
            word1[i] = sc.nextLine();
        }

        // Input second string array
        System.out.print("Enter number of elements in word2: ");
        int n2 = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] word2 = new String[n2];
        System.out.println("Enter elements of word2:");
        for (int i = 0; i < n2; i++) {
            word2[i] = sc.nextLine();
        }

        // Create object of Solution class and check result
        Solution sol = new Solution();
        boolean result = sol.arrayStringsAreEqual(word1, word2);

        // Print result
        System.out.println("Are both string arrays equivalent? " + result);
    }
}

       