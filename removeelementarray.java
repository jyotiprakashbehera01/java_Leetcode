import java.util.Scanner;
import java.util.Arrays;

class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}

public class removeelementarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Input array
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input value to remove
        System.out.print("Enter value to remove: ");
        int val = sc.nextInt();

        Solution sol = new Solution();
        int newLength = sol.removeElement(nums, val);

        // Print result
        System.out.println("New length: " + newLength);
        System.out.println("Array after removal: " + Arrays.toString(Arrays.copyOf(nums, newLength)));

        sc.close();
    }
}
