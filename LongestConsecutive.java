import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {

    /**
     * Returns the length of the longest consecutive elements sequence.
     * Time: O(n)
     * Space: O(n)
     */
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);

        int longest = 0;

        for (int n : set) {
            // only start counting when n is the beginning of a sequence
            if (!set.contains(n - 1)) {
                int current = n;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }

    // Example main method
    public static void main(String[] args) {
        LongestConsecutive obj = new LongestConsecutive();

        int[] nums1 = {100, 4, 200, 1, 3, 2};
        System.out.println("Expected 4, got: " + obj.longestConsecutive(nums1)); // sequence 1,2,3,4

        int[] nums2 = {0, -1};
        System.out.println("Expected 2, got: " + obj.longestConsecutive(nums2)); // sequence -1,0

        int[] nums3 = {};
        System.out.println("Expected 0, got: " + obj.longestConsecutive(nums3));

        int[] nums4 = {9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6};
        System.out.println("Expected 7, got: " + obj.longestConsecutive(nums4)); // sequence 3..9
    }
}
