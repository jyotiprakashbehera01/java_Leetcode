public class reversstring {
    public static void main(String[] args) {
        // Example input
        char[] s = {'h', 'e', 'l', 'l', 'o'};

        System.out.println("Before reversing: ");
        System.out.println(s);

        // Call the reverse function
        reverseString(s);

        System.out.println("After reversing: ");
        System.out.println(s);
    }

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            // Swap characters
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
