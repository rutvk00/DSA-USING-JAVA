//https://www.youtube.com/watch?v=jGywRalvoRw&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=24

package PepcodingLevel1.Dynamic_programming;
import java.util.*;
import java.io.*;

class PaintHouse2
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int c = scn.nextInt();
        int arr[][] = new int[n][c];
        for (int i = 0 ; i < arr.length ; i++)
        {
            for (int j = 0 ; j < arr[0].length ; j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }

        int dp[][] = new int[arr.length][arr[0].length] ;
        for (int i = 0 ; i<arr[0].length ; i++)
        {
            dp[0][i] = arr[0][i];
        }

        for (int i = 1 ; i < arr.length ; i++)
        {
            for (int j = 0 ; j < arr[0].length ; j++)
            {
                int min = Integer.MAX_VALUE;
                for (int k = 0 ; k < arr[0].length ; k++)
                {
                    if (k != j)
                    {
                        if (dp[i-1][k] < min)
                        {
                            min = dp[i-1][k];
                        }
                    }
                }
                dp[i][j] = min + arr[i][j];
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0 ; i < arr[0].length ; i++)
        {
            if (dp[arr.length-1][i] < min)
            {
                min = dp[arr.length-1][i];
            }
        }
        System.out.println(min);
    }
}