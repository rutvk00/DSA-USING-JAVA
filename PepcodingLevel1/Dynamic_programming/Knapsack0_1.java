//https://www.youtube.com/watch?v=bUSaenttI24&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=16

package PepcodingLevel1.Dynamic_programming;
import java.util.*;
import java.io.*;

class Knapsack0_1
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int val[] = new int[n];
        int wts[] = new int[n];

        for (int i= 0; i<val.length ; i++)
        {
            val[i] = scn.nextInt();
        }
        for (int i= 0; i<wts.length ; i++)
        {
            wts[i] = scn.nextInt();
        }
        int cap = scn.nextInt();

        int dp[][] = new int [n+1][cap+1];

         for (int i = 1 ; i < dp.length ; i++)
         {
             for (int j = 1 ; j < dp[0].length ; j++)
             {
                   if (j >= wts[i-1])
                   {
                        int rCap = j - wts[i-1];
                        if (dp[i-1][rCap] + val[i-1] > dp[i-1][j])
                        {
                            dp[i][j] = dp[i-1][rCap] + val[i-1] ;
                        }
                        else {
                            dp[i][j] = dp[i-1][j];
                        }
                   }
                   else
                   {
                       dp[i][j] = dp[i-1][j];
                   }
             }
         }

        System.out.println(dp[n][cap]);
    }
}