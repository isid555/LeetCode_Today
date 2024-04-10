import java.util.Arrays;

public class M {
    //gain array {-5,1,5,0,-7}
    //height array - {0,-5,-4,1,1,-6}

    public static void main(String[] args) {
        int A[] = {-4,-3,-2,-1,4,3,2};
        int[]B  = {-5,1,5,0,-7};
//        int[]C = {-1,-2,-3};
        int C[] = {1,2,3};

//        System.out.println(Arrays.toString(gain_height(A)));
        System.out.println(gain_height(C));
        System.out.println(gain_height(B));
        System.out.println(gain_height(A));
    }
//    height array - {0,-4,-7,-9,-10,-6,-3,-1}
    public  static int gain_height(int []A){
        //prefix sum array...
//        for (int i = 1; i < A.length; i++) {
//            A[i]+=A[i-1];
//        }
//        int max_element = 0;
//        for (int i = 0; i < A.length; i++) {
//            max_element = Math.max(max_element,A[i]);
//        }
//        if(max_element<0){
//            return 0;
//        }
//        return max_element;
        int currSum = 0;
        int max_Sum = 0;
        for (int i = 0; i < A.length; i++) {
            currSum+=A[i];
            max_Sum = Math.max(max_Sum,currSum);
        }
        return max_Sum;
    }

}
