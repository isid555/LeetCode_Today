import java.util.Stack;

public class L402 {
    public static void main(String[] args) {
        System.out.println(removeKdigits("1432219",3));
        System.out.println(removeKdigits("10200",1));
        System.out.println(removeKdigits("10",2));
    }
    public static String removeKdigits(String num, int k) {
        if (num.length() == k) {
            return "0";
        }
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while (i < num.length()) {
            // Pop elements from the stack while the current element is less than the top of the stack and k > 0
            while (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(i)) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
            i++;
        }
        // If k is still remaining, remove the last k elements
        while (k > 0) {
            stack.pop();
            k--;
        }

        // Build the result string from the stack
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }

        // Remove leading zeros
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        return result.toString();
    }
}
