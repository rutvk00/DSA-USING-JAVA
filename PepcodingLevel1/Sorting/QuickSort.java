// https://www.youtube.com/watch?v=kdO5Q0nmPjU&list=PL-Jc9J83PIiFc7hJ5eeCb579PS8p-en4f&index=7

package PepcodingLevel1.Sorting;
import java.util.*;
import java.io.*;

class QuickSort
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = scn.nextInt();

        }
        int pivot = arr[arr.length-1];
        quickSort (arr ,0 , arr.length-1);
        for (int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i] +" ");

        }
    }

    public static void quickSort (int [] arr ,  int low, int high)
    {
        if (low >= high) return ;
        int pivot = arr[high];
        int pivot_idx = partition (arr , pivot ,  low ,  high);
        quickSort (arr , low , pivot_idx-1);
        quickSort (arr , pivot_idx+1 , high);
    }
    public static int partition (int []arr , int pivot , int low , int high)
    {
        int i = 0 ;
        int j = 0;
        int end = high;

        while (i <= end)
        {
            if (arr[i] > pivot)
            {
                i++;
            }
            else {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp ;
                i++;
                j++;
            }
        }
        return j-1;
    }
}