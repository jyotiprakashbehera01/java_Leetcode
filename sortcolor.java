public class sortcolor {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        System.out.println("Before Sorting:");
        printArray(nums);

        sortColors(nums);

        System.out.println("\nAfter Sorting:");
        printArray(nums);
    }

    // Method to sort colors (Dutch National Flag Algorithm)
    public static void sortColors(int[] nums) {
        int low = 0;                  // next position for 0
        int mid = 0;                  // current index
        int high = nums.length - 1;   // next position for 2

        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap nums[low] and nums[mid]
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { // nums[mid] == 2
                // Swap nums[mid] and nums[high]
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

    // Helper method to print the array
    public static void printArray(int[] nums) {
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

