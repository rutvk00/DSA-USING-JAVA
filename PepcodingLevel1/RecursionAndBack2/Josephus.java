//https://www.youtube.com/watch?v=dzYq5VEMZIg&list=PL3UlF_QlQi8xyUGvQO0pHnX64YCt76j2E&index=4
package PepcodingLevel1.RecursionAndBack2;
import java.io.*;
import java.util.*;

public class Josephus {

    public static int solution(int n, int k){
        //write your code here
        if (n == 1){
            return 0;
        }
        int x = solution (n-1 , k);
        int y = (x + k) % n;
        return y;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        System.out.println(solution(n,k));
    }


}