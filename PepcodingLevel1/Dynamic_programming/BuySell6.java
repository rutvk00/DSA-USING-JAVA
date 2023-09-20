//https://www.youtube.com/watch?v=3YILP-PdEJA&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=35

package PepcodingLevel1.Dynamic_programming;
import java.util.*;
import java.io.*;

class BuySell6
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
            for (int d = 1 ; d < n ; d++)
            {
               int max = dp[t][d-1];
               for (int pd = 0; pd <d ; pd++)
               {
                   int mptm1 = dp[t-1][pd];
                   int ptth = price[d] - price[pd];

                   if (mptm1 + ptth > max)
                   {
                       max = mptm1 + ptth;
                   }
               }
               dp[t][d] = max;
            }
        }
        System.out.println(dp[k][n-1]);
    }
}