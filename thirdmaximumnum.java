import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        long v1 = Long.MIN_VALUE;
        long v2 = Long.MIN_VALUE;
        long v3 = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == v1 || nums[i] == v2 || nums[i] == v3) {
                continue;
            }
            if (nums[i] > v1) {
                v3 = v2;
                v2 = v1;
                v1 = nums[i];
            } else if (nums[i] > v2) {
                v3 = v2;
                v2 = nums[i];
            } else if (nums[i] > v3) {
                v3 = nums[i];
            }
        }

        return v3 == Long.MIN_VALUE ? (int)v1 : (int)v3;
    }
}

public class thirdmaximumnum {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {3, 2, 1};
        int[] nums2 = {1, 2};
        int[] nums3 = {2, 2, 3, 1};

        System.out.println("Third Max of [3,2,1]: " + solution.thirdMax(nums1)); // 1
        System.out.println("Third Max of [1,2]: " + solution.thirdMax(nums2));   // 2 (only two distinct)
        System.out.println("Third Max of [2,2,3,1]: " + solution.thirdMax(nums3)); // 1
    }
}
