class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR cancels out duplicate numbers
        }
        return result;
    }
}

public class singleNumber {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        int[] nums3 = {1};

        System.out.println("Single number in [2,2,1]: " + sol.singleNumber(nums1));
        System.out.println("Single number in [4,1,2,1,2]: " + sol.singleNumber(nums2));
        System.out.println("Single number in [1]: " + sol.singleNumber(nums3));
    }
}
