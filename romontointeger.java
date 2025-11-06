
    
import java.util.HashMap;
import java.util.Map;

public class romontointeger {

    // Function to convert Roman numeral to Integer
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));

            // Check if next symbol is greater
            if (i + 1 < s.length() && map.get(s.charAt(i + 1)) > current) {
                result -= current;
            } else {
                result += current;
            }
        }

        return result;
    }

    // Main function to test
    public static void main(String[] args) {
        System.out.println("III  = " + romanToInt("III"));      // 3
        System.out.println("IV   = " + romanToInt("IV"));       // 4
        System.out.println("IX   = " + romanToInt("IX"));       // 9
        System.out.println("LVIII = " + romanToInt("LVIII"));   // 58
        System.out.println("MCMXCIV = " + romanToInt("MCMXCIV"));// 1994
    }
}

