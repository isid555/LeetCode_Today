import java.util.ArrayList;

public class L234 {
    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(0);
        list.next.next = new ListNode(1);
        list.next.next.next = new ListNode(3);
        list.next.next.next.next = new ListNode(2);
        list.next.next.next.next.next = new ListNode(1);
        System.out.println(isPalindrome(list));
    }
    private static  class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static boolean isPalindrome(ListNode head) {
    ArrayList<Integer> forward = new ArrayList<>();
    ArrayList<Integer> backward = new ArrayList<>();
    ListNode curr = head;
    while(curr != null){
        forward.add(curr.val);
        curr = curr.next;
    }

        for(int i = forward.size()-1; i>=0;i--){
            backward.add(forward.get(i));
        }

//        checking
        for (int i = 0; i < forward.size() ; i++) {
            if(forward.get(i) != backward.get(i)){
                return false;
            }
        }
        return true;

    }
}
