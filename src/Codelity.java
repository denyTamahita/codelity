/**
 * Created by user on 8/29/2018.
 */
public class Codelity {

    public static void main(String[] args) {
        CyclicRotation.Solution sol = new CyclicRotation.Solution();
        int[] numbers = new int[]{1,2,3,4};
        numbers = sol.solution(numbers,4);
        for (int i = 0; i < numbers.length ; i++) {
            System.out.print(numbers[i]);
        }
    }


    public static void mainBinaryGap(String[] args) {

        binarygap.Solution sol = new binarygap.Solution();
        int n = 20;
        System.out.println(sol.solution(n));
    }

}


