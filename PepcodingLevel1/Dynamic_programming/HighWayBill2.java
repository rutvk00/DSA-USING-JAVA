// youtube.com/watch?v=SiGqwJOvflE&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=36

package PepcodingLevel1.Dynamic_programming;
import java.io.*;
import java.util.*;

class HighWayBill2
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

        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i= 0 ;i < n ; i++)
        {
            map.put (x[i] , rev[i]);
        }

        int dp[] = new int[m+1];
        dp[0] = 0;

        for (int i = 1 ; i <=m ; i++)
        {
            if (map.containsKey(i) == false)
            {
                dp[i] = dp[i-1];
            }
            else {
                int boardNotInstalled = dp[i-1];
                int boardInstalled = dp[i-t-1] + map.get(i);
                dp[i] = Math.max (boardInstalled,boardNotInstalled);
            }
        }
        System.out.println(dp[m]);
    }
}