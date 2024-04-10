import java.util.PriorityQueue;
import java.util.Queue;

public class L2073 {
    public static void main(String[] args) {
//        int[]A = {84,49,5,24,70,77,87,8};
        int[]A = {5,5,3,5,5};
        System.out.println(timeRequiredToBuy(A,2));
    }
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        for (int i = 0; i < tickets.length; i++) {
            if(i!=k && tickets[i]<tickets[k]){
                time+=tickets[i];
            }
            else {
                time+=tickets[k];
            }
if(i>k && tickets[i]>=tickets[k]){
time--;

            }
        }
        return time;
    }
}
