// https://www.youtube.com/watch?v=IiAsqfjhZnY&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=29

package PepcodingLevel1.Dynamic_programming;
import java.util.*;
import java.io.*;

class PartitionSubset
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in) ;
        int n = scn.nextInt();
        int k = scn.nextInt();
        long [][] dp = new long[k+1][n+1];

        if (n == 0 || k == 0 || n < k)
        {
            System.out.println(0);
        }

        for (int t = 1 ; t <= k ; t++)
        {
            for (int p = 1 ; p <= n ;p++)
            {
                if(p < t)
                {
                    dp[t][p] = 0;
                }
                else if (p == t)
                {
                    dp[t][p] = 1;
                }
                else
                {
                    dp[t][p] = dp[t-1][p-1] + dp[t][p-1] * t ;
                }
            }
        }
        System.out.println(dp[k][n]);
    }
}