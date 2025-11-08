public class searchinsert {

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left; // position to insert
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};

        int target1 = 5;
        int target2 = 2;
        int target3 = 7;
        int target4 = 0;

        System.out.println("Insert position of " + target1 + " = " + searchInsert(nums, target1));
        System.out.println("Insert position of " + target2 + " = " + searchInsert(nums, target2));
        System.out.println("Insert position of " + target3 + " = " + searchInsert(nums, target3));
        System.out.println("Insert position of " + target4 + " = " + searchInsert(nums, target4));
    }
}

