import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int j = 0;  // slow pointer

        for (int i = 1; i < nums.length; i++) {  // start from index 1
            if (nums[i] != nums[j]) {   // found a new unique element
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;  // length of array without duplicates
    }
}

public class duplicates {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example input
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        
        // Call the method
        int newLength = solution.removeDuplicates(nums);

        // Print results
        System.out.println("New Length: " + newLength);
        System.out.println("Array after removing duplicates: " 
                           + Arrays.toString(Arrays.copyOf(nums, newLength)));
    }
}

