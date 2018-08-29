package CyclicRotation;

/**
 * Created by user on 8/29/2018.
 */
public class Solution {
    public int[] solution(int[] A, int K) {
        int[] arrayTemp = new int[A.length];

        for (int i = 0; i < K; i++) {
            
            for (int j = 0; j < A.length ; j++) {
                arrayTemp[j] = A[j];
            }
            for (int k = 0; k < arrayTemp.length; k++) {
                int index = 0;
                if (k == 0) {
                    index = arrayTemp.length-1;
                } else {
                    index = k - 1;
                }
                A[k] = arrayTemp[index];
            }
        }

        return A;
    };

}
