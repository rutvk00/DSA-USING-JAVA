//https://www.youtube.com/watch?v=SHDu0Ufjyk8&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=28

package PepcodingLevel1.Dynamic_programming;
import java.util.*;
import java.io.*;

class FrndPair
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i<dp.length; i++)
        {
            dp[i] = dp[i-1] + (i-1) * dp[i-2];
        }

        System.out.println(dp[n]);
    }
}