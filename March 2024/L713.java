public class L713 {
    public static void main(String[] args) {
        int[]A = {10,5,2,6};
        System.out.println(Count(A,100));
    }
    public int numSubarrayProductLessThanK(int[] A, int K) {
        //base case
        if(K<=1){
            return 0;
        }
        int product = 1;
        int left = 0;
        int ans = 0;
        for (int right = 0; right < A.length; right++) {
            product*=A[right];
            while(product>=K){
                product/= A[left++];

            }
            ans+= right-left+1;

        }
        return ans;
    }

    //Brute_Force
    public static int Count(int []A,int K){
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            int product = 1;
            for (int j = i;j< A.length;j++){
                product*=A[j];
                if(product<K){
                    count++;
                }
            }
        }
        return count;
    }
}
