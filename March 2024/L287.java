public class L287 {
    public int findDuplicate(int[] A) {
        int slow = 0 , fast = 0;
        do {
            slow = A[slow];
            fast = A[A[fast]];
        }while (slow!=fast);
        //As soon they meet ,move both pointers at same spped untill they meet again
        slow = 0;
        while(slow != fast){
            slow = A[slow];
            fast = A[fast];
        }
        return slow;
    }
}
