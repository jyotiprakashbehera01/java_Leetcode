public class monotonic {
    // Function to check monotonic array
    public static boolean isMonotonic(int[] nums) {
        boolean inc = true;
        boolean dec = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                inc = false;
            }
            if (nums[i] > nums[i - 1]) {
                dec = false;
            }
        }
        return inc || dec;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 3};
        int[] nums2 = {6, 5, 4, 4};
        int[] nums3 = {1, 3, 2};

        System.out.println("Array 1 monotonic: " + isMonotonic(nums1)); // true
        System.out.println("Array 2 monotonic: " + isMonotonic(nums2)); // true
        System.out.println("Array 3 monotonic: " + isMonotonic(nums3)); // false
    }
}
    
