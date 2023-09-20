//https://www.youtube.com/watch?v=vF7gk4iaklA&list=PL-Jc9J83PIiFc7hJ5eeCb579PS8p-en4f&index=15

package PepcodingLevel1.Sorting;
import java.util.*;
import java.io.*;

class PivotSortedArray
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = scn.nextInt();
        }
        int low = 0;
        int high = arr.length-1;

        while (low < high)
        {
            int mid = (low+high)/2;

            if (arr[mid] < arr[high])
            {
                high = mid;
            }
            else {
                low = mid+1;
            }
        }
        System.out.println(arr[high]);
    }
}