public class findevennumber {

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        findevennumber obj = new findevennumber();

        int[] nums1 = {12, 345, 2, 6, 7896};
        System.out.println(obj.findNumbers(nums1));  
        // Output: 2

        int[] nums2 = {555, 901, 482, 1771};
        System.out.println(obj.findNumbers(nums2));  
        // Output: 1
    }
}