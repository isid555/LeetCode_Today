public class L41 {
    public int firstMissingPositive(int[] A) {
        int n =  A.length;
        // [3,4,-1,1]
        for (int i = 0; i < n; i++) {
            if(A[i] <=0 || A[i] >n){
                A[i] = n+1;
            }
        }
        //[3,4,5,1]
        for (int i = 0; i < n; i++) {
            int id = Math.abs(A[i]);
            if(id>n){
                continue;
            }
           id--;
            if(A[id]>0 ){
                A[id] = -A[id];
            }

        }
        //[-3,4,-5,-1]
        for (int i = 0; i < n; i++) {
            if(A[i] >0){
                return i+1;
            }
        }
return n+1;
    }
}
