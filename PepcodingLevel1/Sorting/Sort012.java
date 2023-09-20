//https://www.youtube.com/watch?v=MbV26HWqxrs&list=PL-Jc9J83PIiFc7hJ5eeCb579PS8p-en4f&index=13
package PepcodingLevel1.Sorting;
import java.util.*;
import java.io.*;

class Sort012
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner  (System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = scn.nextInt();
        }

        partition (arr);

        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i] +" ");
        }
    }

    public static void partition (int[]arr)
    {
        int i = 0 ;
        int j = 0;
        int k = arr.length-1;

        while (i < arr.length && i<k)
        {
            if (arr[i] == 1)
            {
                i++;
            }
            else if (arr[i] == 0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
            else {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k--;
            }
        }
    }
}