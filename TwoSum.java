import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store value -> index mapping
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // If the complement exists in map, return indices
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            
            // Otherwise, put the current number with its index
            map.put(nums[i], i);
        }
        
        // Return empty array if no solution is found
        return new int[]{};
    }
}

public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = solution.twoSum(nums, target);
        
        // Print the result
        System.out.println("Indices: " + Arrays.toString(result));
    }
}
