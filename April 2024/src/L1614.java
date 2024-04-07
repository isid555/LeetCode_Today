import java.util.Stack;

public class L1614 {
    public int maxDepth(String s) {


        char ch[] = s.toCharArray();
        int cnt = 0;
        int ans = 0;
        for (int i = 0; i < ch.length; i++) {

            if(ch[i]=='('){
                cnt++;
            } else if (ch[i]==')') {
                cnt--;

            }
            ans = Math.max(ans,cnt);
        }
        return ans;
    }
}
