//https://www.youtube.com/watch?v=yc0LunmJA1A&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=14

package PepcodingLevel1.Dynamic_programming;
import java.util.*;
import java.io.*;

class CoinChangePermutation
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = scn.nextInt();
        }
        int amount = scn.nextInt();

        int dp[] = new int[amount+1];
        dp[0] = 1 ;

        for (int i = 1 ; i < dp.length ; i++)
        {
            for (int j = 0 ; j < arr.length ; j++)
            {
                if (arr[j] <= i )
                dp[i] += dp[ i - arr[j]];
            }
        }

        System.out.println (dp[amount]);
    }
}