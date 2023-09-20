// https://www.youtube.com/watch?v=p-OyKUgIrx4&list=PL-Jc9J83PIiFc7hJ5eeCb579PS8p-en4f&index=9

package PepcodingLevel1.Sorting;
import java.util.*;
import java.io.*;

class CountingSort
{
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = scn.nextInt();
        }
        int maxEle = max(arr);
        int minEle = min(arr);
        int range = maxEle - minEle +1;
        int []freq = new int[range];

        for (int i = 0 ; i < arr.length ; i++)
        {
            int idx = arr[i] - minEle;
            freq[idx]++;
        }
        for(int i = 1 ; i < freq.length ; i++)
        {
            freq[i] = freq[i] + freq[i-1];
        }

        int []ans = new int[arr.length];
        for (int i = arr.length-1 ; i>=0 ; i--)
        {
            int pos = arr[i]-minEle;
            int idx = freq[pos]-1;
            ans[idx] = arr[i];
            freq[pos]--;
        }

        for(int i = 0 ; i < ans.length ; i++)
        {
            System.out.print(ans[i] +" ");
        }
    }

    public static int max (int arr[])
    {
        int maxEle = arr[0];
        for (int i = 1 ; i < arr.length; i++)
        {
            if (maxEle < arr[i])
            {
                maxEle = arr[i];
            }
        }
        return maxEle;
    }

    public static int min (int arr[])
    {
        int minEle = arr[0];
        for (int i = 1 ; i < arr.length; i++)
        {
            if (minEle > arr[i])
            {
                minEle = arr[i];
            }
        }
        return minEle;
    }
}