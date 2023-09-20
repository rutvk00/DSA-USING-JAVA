//https://www.youtube.com/watch?v=Jv-eGC2xmtU&list=PL-Jc9J83PIiFc7hJ5eeCb579PS8p-en4f&index=1

package PepcodingLevel1.Sorting;
import java.util.*;
import java.io.*;

class SelectionSort
{
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = scn.nextInt();
        }

        int min_idx;
        for (int i = 0 ; i < n ; i++)
        {
            min_idx = i;
            for (int j = i+1 ; j < n ;j++)
            {
                if(arr[i] > arr[j])
                {
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
        for (int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i] +" ");
        }
    }
}