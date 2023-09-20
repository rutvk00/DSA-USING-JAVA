//https://www.youtube.com/watch?v=jgps7MXtKRQ&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=17

package PepcodingLevel1.Dynamic_programming;
import java.sql.SQLOutput;
import java.util.*;
import java.io.*;

class Unbounded_knapsack
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner  (System.in);
        int n = scn.nextInt();
        int val[] = new int[n];
        for (int i = 0 ; i < val.length ; i++)
        {
            val[i] = scn.nextInt();
        }
        int wts[] = new int[n];
        for (int i = 0 ; i < wts.length ; i++)
        {
            wts[i] = scn.nextInt();
        }

        int cap =scn.nextInt();

        int dp[] = new int[cap+1];
        dp[0] = 0;

        for (int bagc = 1 ; bagc < dp.length ; bagc++)
        {
            int max = 0;
            for (int i = 0 ; i < wts.length ; i++)
            {
                if (bagc >= wts[i])
                {
                    int rcap = bagc - wts[i];
                    int rbagv = dp[rcap];
                    int bagv = val[i] + rbagv ;
                    if (bagv > max)
                    {
                        max = bagv;
                    }
                }
            }
            dp[bagc] = max ;
        }

        System.out.println(dp[cap]);
    }
}