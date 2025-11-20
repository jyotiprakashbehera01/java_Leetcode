import java.util.Arrays;

public class arethomaticarray {

    // LeetCode method
    public static boolean canMakeArithmeticProgression(int[] arr) {
        if (arr == null || arr.length <= 2) return true;

        Arrays.sort(arr);
        int diff = arr[1] - arr[0];

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                return false;
            }
        }
        return true;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[][] tests = {
            {3, 5, 1},        // true -> [1,3,5]
            {1, 2, 4},        // false
            {7, 7, 7, 7},     // true
            {5},              // true
            {2, 0, 4, 6, 8}   // true -> [0,2,4,6,8]
        };

        for (int[] t : tests) {
            System.out.println("arr: " + Arrays.toString(t) +
                    " -> " + canMakeArithmeticProgression(t));
        }
    }
}
