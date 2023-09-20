//https://www.youtube.com/watch?v=gRo86WqFYSE&list=PL3UlF_QlQi8xyUGvQO0pHnX64YCt76j2E&index=5
package PepcodingLevel1.RecursionAndBack2;
import java.io.*;
import java.util.*;

public class Lexicographic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        //write your code here
        for (int i = 1 ; i <10 ; i++){
            dfs (i , n);
        }
    }

    public static void dfs (int i , int n){
        if (i > n){
            return;
        }
        System.out.println(i);
        for (int j = 0 ; j < 10 ; j++){
            dfs (i*10 + j , n);
        }
    }

}