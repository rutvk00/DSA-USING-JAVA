// Print nth fibonacci number with memoization
// https://www.youtube.com/watch?v=A6mOASLl2Dg&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=2

package PepcodingLevel1.Dynamic_programming;
import java.util.*;
import java.io.*;

class FibboMemoization
{
    public static void main(String[] args)  throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int fibn = fiboMemoization (n , new int[n+1]);
        System.out.println (fibn);
    }

    public static int fiboMemoization (int n , int dp_array[])
    {
        if (n == 0 || n == 1) return n ;
        if (dp_array[n] != 0) return dp_array[n];

        int fibnm1 = fiboMemoization (n-1 , dp_array);
        int fibnm2 = fiboMemoization (n-2 , dp_array);
        int fibn = fibnm1 + fibnm2 ;
        dp_array[n] = fibn ;
        return fibn ;
    }
}