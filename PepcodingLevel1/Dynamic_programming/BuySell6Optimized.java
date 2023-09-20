//https://www.youtube.com/watch?v=3YILP-PdEJA&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=35

package PepcodingLevel1.Dynamic_programming;
import java.util.*;
import java.io.*;

class BuySell6Optimized
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int [] price = new int[n];

        for (int i = 0 ; i < n ; i++)
        {
            price[i] = scn.nextInt();
        }

        int k = scn.nextInt();

        int [][]dp = new int[k+1][n];

        for (int t = 1 ; t<=k ; t++)
        {
            int max = dp[t-1][0]- price[0];
            for (int d = 1 ; d < n ; d++)
            {
                if (dp[t-1][d-1] - price[d-1] > max)
                {
                    max = dp[t-1][d-1] - price[d-1];
                }
              if (max + price[d] > dp[t][d-1])
              {
                  dp[t][d] = max + price[d];
              }
              else {
                  dp[t][d] = dp[t][d-1];
              }
            }
        }
        System.out.println(dp[k][n-1]);
    }
}