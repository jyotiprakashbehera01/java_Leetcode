import java.util.Scanner;
public class happynumber {
    // helper: return sum of squares of digits of n
    private static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }

    // Floyd's cycle-finding (tortoise and hare) to detect cycle
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = sumOfSquares(slow);            // move one step
            fast = sumOfSquares(sumOfSquares(fast)); // move two steps
        } while (slow != fast);
        return slow == 1; // if cycle meets at 1, it's happy
    }

    // main for quick testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        if (!sc.hasNextInt()) {
            System.out.println("Please enter a valid integer.");
            sc.close();
            return;
        }
        int n = sc.nextInt();
        sc.close();

        boolean result = isHappy(n);
        System.out.println(n + (result ? " is a Happy Number." : " is NOT a Happy Number."));
    }
}

