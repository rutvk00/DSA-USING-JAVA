//https://www.youtube.com/watch?v=l_nR5X9VmaI&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=13

package PepcodingLevel1.Dynamic_programming;
import java.util.*;
import java.io.*;

class CoinChange
{
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner  (System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = scn.nextInt();
        }
        int amount = scn.nextInt();
        int dp[] = new int[amount+1];

        dp[0] = 1 ;

        for (int i = 0 ; i < arr.length ; i++)
        {
            for (int j = arr[i] ; j < dp.length ; j++)
            {
                dp[j] += dp[j-arr[i]];
            }
        }

        System.out.println(dp[amount]);
    }
}