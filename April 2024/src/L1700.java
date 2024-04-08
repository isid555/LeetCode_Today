import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class L1700 {
    public static void main(String[] args) {
        int[]A = {1,1,1,0,0,1};
        int B[] = {1,0,0,0,1,1};
        System.out.println(countStudents(A,B));
    }
    public static  int countStudents(int[] students, int[] sandwiches) {
       int [] counter = new int[2];
       counter[0] = 0;
       counter[1] =1;
        for (int i = 0; i < students.length; i++) {
            if(students[i]==1){
                counter[1]++;
            }
            else {
                counter[0]++;
            }
        }

        int index = 0;
        for (;index< sandwiches.length && counter[sandwiches[index]]>0;index++){
            counter[sandwiches[index]]--;
        }
        return students.length-index;
       

    }
}
