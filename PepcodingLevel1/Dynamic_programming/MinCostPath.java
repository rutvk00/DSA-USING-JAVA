//https://www.youtube.com/watch?v=BzTIOsC0xWM&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=7

package PepcodingLevel1.Dynamic_programming;
import java.util.*;
import java.io.*;

class MinCostPath
{
    public static void main(String[] args) throws Exception{
        Scanner scn  = new Scanner (System.in) ;
        int n = scn.nextInt();
        int m = scn.nextInt();
        int arr[][] = new int[n][m];

        for (int i = 0 ; i < arr.length ; i++)
        {
            for (int j = 0 ; j < arr[0].length ; j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }

        int dp[][] = new int [n][m];

        for (int i = dp.length-1 ; i >= 0 ; i--)
        {
            for (int j = dp[0].length-1 ; j >= 0 ; j--)
            {
                if (i == dp.length-1 && j == dp[0].length-1)
                {
                        dp[i][j] = arr[i][j];
                }
                else if (i == dp.length-1)
                {
                        dp[i][j] = dp[i][j+1] + arr[i][j];
                }
                else if (j == dp[0].length-1 )
                {
                        dp[i][j] = arr[i][j] + dp[i+1][j] ;
                }
                else {
                        dp[i][j] = Math.min (dp[i][j+1] , dp[i+1][j]) + arr[i][j];
                }
            }
        }

        System.out.println (dp[0][0]);
    }
}