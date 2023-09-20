// climb stair with jump -- Tabulation method
// https://www.youtube.com/watch?v=uNqoQ0sNZCM&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=3

package PepcodingLevel1.Dynamic_programming;
import java.util.*;
import java.io.*;

class CountPathJump
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = scn.nextInt();
        }
        int dp[] = new int [n+1];

        dp[n] = 1 ;

        for (int i = n-1 ; i>=0 ; i--)
        {
           for (int j = 1 ; j<= arr[i] && i+j < dp.length ; j++)
           {
               dp[i] += dp[i+j];
           }
        }

        System.out.println (dp[0]);
    }
}