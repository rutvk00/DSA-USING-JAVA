//https://www.youtube.com/watch?v=_c_R-uIi-zU&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=27

package PepcodingLevel1.Dynamic_programming;
import java.io.*;
import java.util.*;

class TileM
{
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int dp[] = new int [n+1];

        for (int i = 1 ; i < dp.length ; i++)
        {
            if (i < m)
            {
                dp[i] = 1;
            }
            else if (i == m)
            {
                dp[i] = 2;
            }
            else {
                dp[i] = dp[i-1] + dp[i-m];
            }
        }

        System.out.println(dp[n]);
    }
}

