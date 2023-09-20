// youtube.com/watch?v=SiGqwJOvflE&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=36

package PepcodingLevel1.Dynamic_programming;
import java.io.*;
import java.util.*;

class HighWayBill
{
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner  (System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int x[] = new int[n];
        for (int i = 0 ; i < n ; i ++)
        {
            x[i] = scn.nextInt();
        }
        int rev[] = new int[n];
        for (int i = 0 ; i < n ; i ++)
        {
            rev[i] = scn.nextInt();
        }
        int t = scn.nextInt();



        int ans = 0;
        int dp[] = new int[n];
        dp[0] = rev[0];

        for (int i = 1 ; i < n ; i++)
        {
            int max = 0;
            for (int j = 0 ; j < i; j++)
            {
                int dist = x[i]-x[j];
                if (dist>t)
                {
                    max = Math.max (max , dp[j]);
                }

            }
            dp[i] = max + rev[i];
            ans = Math.max (dp[i] , ans) ;
        }

        System.out.println(ans);
    }
}