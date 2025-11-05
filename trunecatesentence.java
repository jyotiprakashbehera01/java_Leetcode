public class trunecatesentence {
    
    public static String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(words[i]);
            if (i != k - 1) sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;

        String result = truncateSentence(s, k);
        System.out.println("Truncated Sentence: " + result);
    }
}

