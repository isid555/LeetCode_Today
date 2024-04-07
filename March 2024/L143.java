import java.util.List;

public class L143 {
    private class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public void reorderList(ListNode head) {

        if(head == null || head.next == null){
            return;
        }
        ListNode last = head.next;
        ListNode secondLast = head;

        while(last.next!= null){
            last = last.next;
            secondLast = secondLast.next;
        }

        ListNode temp = head.next;
        head.next = last;
        last.next = temp;
        secondLast= null;

        reorderList(temp);
    }

}
