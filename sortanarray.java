import java.util.Scanner;

class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;

        // Sort left half
        mergeSort(nums, left, mid);
        // Sort right half
        mergeSort(nums, mid + 1, right);
        // Merge both halves
        merge(nums, left, mid, right);
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        // Merge two sorted halves
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        // Copy remaining elements
        while (i <= mid) temp[k++] = nums[i++];
        while (j <= right) temp[k++] = nums[j++];

        // Copy back into original array
        for (int m = 0; m < temp.length; m++) {
            nums[left + m] = temp[m];
        }
    }
}

public class sortanarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        // Input size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Input elements
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call sort function
        int[] result = sol.sortArray(nums);

        // Print sorted array
        System.out.println("Sorted array:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
