// print minimum move to climb a stair
//https://www.youtube.com/watch?v=Zobz9BXpwYE&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=5

package PepcodingLevel1.Dynamic_programming;
import java.util.*;
import java.io.*;

class ClimbStairMinMove
{
    public static void main(String[] args)  throws Exception{
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int arr[] = new int [n];
        for (int i = 0  ; i < n ; i ++)
        {
            arr[i] = scn.nextInt();
        }

        Integer dp[] = new Integer[n+1];
        dp[n] = 0 ;

        for (int i = n-1 ; i>=0 ; i--)
        {   if (arr[i] > 0)
            {
                int min = Integer.MAX_VALUE;
                for (int j = 1; j <= arr[i]  && i+j < dp.length; j++)
                {
                    if (dp[i+j] != null)
                    {
                        min = Math.min (min , dp[i+j]);
                    }
                }

                if (min != Integer.MAX_VALUE)
                {
                    dp[i] = min+1 ;
                }
            }
        }

        System.out.println(dp[0]) ;
    }
}