public class L1669 {
    //Merge in between the LL

//     Definition for singly-linked list.
      private  class ListNode {
          int val;
          ListNode next;
         ListNode() {}
          ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
            ListNode save;
            ListNode curr = list1;
            int temp = 0;
            while(curr != null && temp<b ){
                temp++;
                curr = curr.next;
            }

            if(curr.next == null){
                save = null;
            }
            else{
                save= curr.next;
            }

            curr = list1;
            temp  =0;
            while(curr.next != null && temp<a-1){
                temp++;
                curr = curr.next;
            }
            curr.next = list2;

            curr = list1;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next =save;

    return list1;
        }
    }
}
