// https://www.youtube.com/watch?v=VT4bZV24QNo&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=22

package PepcodingLevel1.Dynamic_programming;
import java.util.*;
import java.io.*;

class MaxSumNonAdj
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0 ; i <arr.length ; i++)
        {
            arr[i] = scn.nextInt();
        }
        int exc = 0;
        int inc = arr[0];

        for (int i = 1 ; i < arr.length ; i++)
        {
           int temp = inc ;
           inc = exc + arr[i];
           exc = Math.max (temp , exc);
        }
        int ans = Math.max (inc , exc);
        System.out.println(ans);
    }
}