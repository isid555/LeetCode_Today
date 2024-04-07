//import java.util.*;
//
//public class L1249 {
//    public static void main(String[] args) {
//        System.out.println(minRemoveToMakeValid("()))((ksg(((u((()c)("));
////        System.out.println(minRemoveToMakeValid("a)b(c)d"));
//    }
//    public static String minRemoveToMakeValid(String s) {
//
//        int getM = getMin(s);
//        StringBuilder d =new StringBuilder();
//        solution(s,getM,d);
//
//        return d.toString();
//    }
//    public static   void solution(String str, int minRemoval, StringBuilder dummy){
//        if(minRemoval==0){
//            int mrNow = getMin(str);
//            if(mrNow==0){
////                if(isValid(str)){
////                    ans.add(str);
////                }
//                dummy.append(str);
//            }
//            return;
//        }
//        for (int i = 0; i < str.length(); i++) {
//            String left = str.substring(0,i);
//            String right = str.substring(i+1);
//            solution(left+right , minRemoval-1,dummy);
//        }
//    }
//    public static int getMin(String str){
//        Stack<Character> stk = new Stack<>();
//        for (int i = 0; i < str.length(); i++) {
//            char ch  = str.charAt(i);
//            if(ch=='('){
//                stk.push(ch);
//            } else if (ch==')') {
//                if(stk.size()==0){
//                    stk.push(ch);
//                } else if (stk.peek()==')') {
//                    stk.push(ch);
//                } else if (stk.peek()=='(') {
//                    stk.pop();
//                }
//            }
//        }
//        return stk.size();
//    }
//}
//


import java.util.*;

public class L1249 {
    public static void main(String[] args) {
        System.out.println(minRemoveToMakeValid("()))((ksg(((u((()c)("));
        System.out.println(minRemoveToMakeValid("a)b(c)d"));
    }


    public static String minRemoveToMakeValid(String s) {
        StringBuilder result = new StringBuilder();
        int openCount = 0; // Count of '('
        int removals = 0; // Count of removals needed
        List<Integer> removalIndices = new ArrayList<>();

        // Find indices of invalid ')' and '('
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                openCount++;
            } else if (ch == ')') {
                if (openCount > 0) {
                    openCount--; // Matched '(' found
                } else {
                    removalIndices.add(i); // Invalid ')' found
                    removals++;
                }
            }
        }

        // Find indices of excess '('
        for (int i = s.length() - 1; i >= 0 && openCount > 0; i--) {
            if (s.charAt(i) == '(') {
                removalIndices.add(i); // Excess '(' found
                removals++;
                openCount--;
            }
        }

        // Construct the result string excluding removal indices
        for (int i = 0; i < s.length(); i++) {
            if (!removalIndices.contains(i)) {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}
