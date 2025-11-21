public class unique {


    public int firstUniqChar(String s) {
        int[] freq = new int[26];

        // count frequency of each character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // find first unique character
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1; // no unique character
    }

    // main function to test
    public static void main(String[] args) {
        unique obj = new unique();
        
        System.out.println(obj.firstUniqChar("leetcode"));   // Output: 0
        System.out.println(obj.firstUniqChar("loveleetcode")); // Output: 2
        System.out.println(obj.firstUniqChar("aabb")); // Output: -1
    }
}

