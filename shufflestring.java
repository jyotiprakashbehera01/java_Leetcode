import java.util.Scanner;

class Solution {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
    }
}

public class shufflestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        // Input
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.print("Enter number of indices: ");
        int n = sc.nextInt();
        int[] indices = new int[n];
        System.out.println("Enter indices:");
        for (int i = 0; i < n; i++) {
            indices[i] = sc.nextInt();
        }

        // Output
        String result = sol.restoreString(s, indices);
        System.out.println("Shuffled string: " + result);

        sc.close();
    }
}
