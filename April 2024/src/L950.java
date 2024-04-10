import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class L950 {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int  n = deck.length;
        int[]res = new int[n];
        LinkedList<Integer> queue  = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(i);
        }
        for (int i = 0; i < res.length; i++) {
            res[queue.poll()] = deck[i];
            queue.offer(queue.poll());
        }
        return res;
    }

}
