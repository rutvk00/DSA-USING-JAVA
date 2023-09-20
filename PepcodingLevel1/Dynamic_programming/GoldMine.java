//https://www.youtube.com/watch?v=hs0lilfJ7C0&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=9

package PepcodingLevel1.Dynamic_programming;
import java.io.*;
import java.util.*;

class GoldMine
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int arr[][] = new int [n][m];

        for (int i = 0 ; i < arr.length ; i++)
        {
            for (int j = 0 ; j < arr[0].length ; j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }
        int dp[][] = new int [n][m];

        for (int j = dp[0].length-1 ; j>=0 ; j--)
        {
            for (int i = dp.length-1 ; i>=0 ; i--)
            {
                if (j == arr[0].length-1)
                {
                    dp[i][j] = arr[i][j];
                }
                else if (i == 0)
                {
                    dp[i][j] = arr[i][j] + Math.min (arr[i][j+1] , arr[i+1][j+1]);
                }
                else if (i == dp.length-1)
                {
                    dp[i][j] = arr[i][j] + Math.max (arr[i][j+1] , arr[i-1][j+1]);
                }
                else
                {
                    dp[i][j] = arr[i][j] + Math.max  (arr[i][j+1] , Math.max (arr[i-1][j+1] , arr[i+1][j+1]));
                }
            }
        }

        int max = dp[0][0];

        for (int i = 1 ; i < dp.length ; i++)
        {
            max = Math.max (dp[i][0] , max);
        }

        System.out.println(max);
    }
}