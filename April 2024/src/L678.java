import java.util.Stack;

public class L678 {
//    Q.) Valid Parenthesis String
public static void main(String[] args) {
    System.out.println(checkValidString("(((((*)))**"));
    System.out.println(checkValidString("(*)"));
}

    public static boolean  checkValidString(String s) {
    Stack<Integer> left = new Stack<>();
    Stack<Integer> star = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c=='('){
                left.push(i);
            } else if (c=='*') {
                star.push(i);
            }
            else {
                if(!left.isEmpty()){
                    left.pop();
                } else if (!star.isEmpty()) {
                    star.pop();
                }
                else {
                    return false;
                }
            }
        }


        while (left.size()!=0){
            if (star.size() == 0) {
                return false;
            }
            if (star.peek() > left.peek()) {
                star.pop();
                left.pop();
            }
            else {
                return false;
            }
        }
        

        return true;
    }

}
