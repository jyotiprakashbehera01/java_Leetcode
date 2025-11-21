import java.util.ArrayDeque;
import java.util.Deque;

public class baseball {

    public int calPoints(String[] ops) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String op : ops) {
            switch (op) {
                case "C":  // Remove last score
                    stack.pop();
                    break;

                case "D":  // Double last score
                    stack.push(stack.peek() * 2);
                    break;

                case "+":  // Sum of last two scores
                    int last = stack.pop();
                    int secondLast = stack.peek();
                    int sum = last + secondLast;
                    stack.push(last);  // Put it back
                    stack.push(sum);
                    break;

                default:  // It's a number
                    stack.push(Integer.parseInt(op));
            }
        }

        int total = 0;
        for (int score : stack) {
            total += score;
        }

        return total;
    }

    public static void main(String[] args) {
        baseball b = new baseball();

        System.out.println(b.calPoints(new String[]{"5","2","C","D","+"})); 
        // Output: 30

        System.out.println(b.calPoints(new String[]{"5","-2","4","C","D","9","+","+"}));
        // Output: 27
    }
}
