import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class L442 {
    private List<Integer> findDuplicates(int[] A) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if(map.containsKey(A[i])){
                int val = map.get(A[i]);
                    val++;
                    map.put(A[i],val);
            }
            else{
                map.put(A[i],1);
            }
        }
        //counting
        for (int i = 0; i < A.length; i++) {
            int val = map.get(A[i]);
            if(val >1){
                list.add(A[i]);
                val--;
                map.put(A[i],val);
            }

        }
        return list;
    }
}
