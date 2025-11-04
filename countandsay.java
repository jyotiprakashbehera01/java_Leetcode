public class countandsay {
    
    public static void main(String[] args) {
        int n = 5;  // you can change this value to test other inputs
        System.out.println("Count and Say for n = " + n + " is: " + countAndSay(n));
    }

    public static String countAndSay(int n) {
        if (n == 1) return "1";
        
        String s = "1";
        for (int i = 2; i <= n; i++) {
            s = getNext(s);
        }
        return s;
    }

    private static String getNext(String s) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result.append(count).append(s.charAt(i - 1));
                count = 1;
            }
        }
        result.append(count).append(s.charAt(s.length() - 1));
        return result.toString();
    }
}
