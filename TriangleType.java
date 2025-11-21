public class TriangleType {
    

    public String triangleType(int[] nums) {
        int a = nums[0], b = nums[1], c = nums[2];

        // Check if triangle is valid
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "none";
        }

        // All sides equal
        if (a == b && b == c) {
            return "equilateral";
        }

        // Two sides equal
        if (a == b || b == c || a == c) {
            return "isosceles";
        }

        // All sides different
        return "scalene";
    }

    public static void main(String[] args) {
        TriangleType t = new TriangleType();

        System.out.println(t.triangleType(new int[]{3, 4, 5}));   // scalene
        System.out.println(t.triangleType(new int[]{2, 2, 2}));   // equilateral
        System.out.println(t.triangleType(new int[]{2, 2, 3}));   // isosceles
        System.out.println(t.triangleType(new int[]{1, 2, 3}));   // none
    }
}


