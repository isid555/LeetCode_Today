import java.util.ArrayList;
import java.util.Stack;

public class L1544 {
    public static void main(String[] args) {
        System.out.println(makeGood("s"));
    }

    public static String makeGood(String s) {
        Stack<Character> stak = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stak.isEmpty()) {
                stak.push(s.charAt(i));
                continue;
            }
            if(stak.peek()==s.charAt(i)){
                stak.push(s.charAt(i));
                continue;
            }
            if (stak.peek() == Character.toLowerCase(s.charAt(i)) || stak.peek() == Character.toUpperCase(s.charAt(i))) {
                stak.pop();
            } else {
                stak.push(s.charAt(i));
            }
        }
        String ans = "";
        while (!stak.isEmpty()) {
            ans = stak.pop() + ans; // Append the characters in reverse order
        }
        return ans;

    }
}
