package PepcodingLevel1.BitManipulation;

public class SingleEle {

    public static void main(String[] args) throws Exception {

        int []arr = {1,2,3,4,5,1,2,3,4};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int answer = 0;

        for (int val : arr){
            answer = answer ^ val;
        }

        return answer;
    }


}
