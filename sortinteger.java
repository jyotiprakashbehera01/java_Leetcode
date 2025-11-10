import java.util.*;

public class sortinteger {

    public int[] sortByBits(int[] arr) {
        // Convert array to list for sorting
        Integer[] nums = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        // Sort using custom comparator
        Arrays.sort(nums, (a, b) -> {
            int bitCountA = Integer.bitCount(a);
            int bitCountB = Integer.bitCount(b);
            if (bitCountA == bitCountB)
                return a - b;  // If same bit count, sort by number
            return bitCountA - bitCountB;  // Otherwise sort by bit count
        });

        // Convert back to primitive array
        return Arrays.stream(nums).mapToInt(Integer::intValue).toArray();
    }

    // For testing
    public static void main(String[] args) {
        sortinteger obj = new sortinteger();
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] result = obj.sortByBits(arr);
        System.out.println(Arrays.toString(result));
    }
}
