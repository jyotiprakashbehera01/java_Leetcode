import java.util.*;
public class contentduplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true; // Duplicate found
            }
            set.add(num);
        }
        return false; // No duplicates
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};

        System.out.println("nums1 contains duplicate: " + containsDuplicate(nums1)); // true
        System.out.println("nums2 contains duplicate: " + containsDuplicate(nums2)); // false
    }
}

