import java.util.Scanner;
import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // in case k > n

        // Step 1: reverse whole array
        reverse(nums, 0, n - 1);
        // Step 2: reverse first k elements
        reverse(nums, 0, k - 1);
        // Step 3: reverse remaining n-k elements
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

public class rotatearray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input k
        System.out.print("Enter k (steps to rotate): ");
        int k = sc.nextInt();

        // Call solution
        Solution sol = new Solution();
        sol.rotate(nums, k);

        // Print result
        System.out.println("Rotated Array: " + Arrays.toString(nums));

        sc.close();
    }
}
