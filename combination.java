import java.util.*;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, n, k, new ArrayList<>(), result);
        return result;
    }
    
    private void backtrack(int start, int n, int k, List<Integer> temp, List<List<Integer>> result) {
        if (temp.size() == k) {
            result.add(new ArrayList<>(temp));
            return;
        }
        
        for (int i = start; i <= n; i++) {
            temp.add(i);                       // Choose
            backtrack(i + 1, n, k, temp, result); // Explore
            temp.remove(temp.size() - 1);      // Un-choose (backtrack)
        }
    }
}

public class combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input from user
        System.out.print("Enter n (range 1 to n): ");
        int n = sc.nextInt();
        System.out.print("Enter k (size of combination): ");
        int k = sc.nextInt();
        
        Solution sol = new Solution();
        List<List<Integer>> res = sol.combine(n, k);
        
        // Print all combinations
        System.out.println("All combinations of " + k + " numbers from 1 to " + n + ":");
        for (List<Integer> combo : res) {
            System.out.println(combo);
        }
        
        sc.close();
    }
}
