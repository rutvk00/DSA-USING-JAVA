//https://www.youtube.com/watch?v=fnbImb8lo88&list=PL-Jc9J83PIiFc7hJ5eeCb579PS8p-en4f&index=8

package PepcodingLevel1.Sorting;
import java.util.*;
import java.io.*;

class QuickSelect
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = scn.nextInt();
        }
        int kth = scn.nextInt();
        int kthSmallest_idx = quickSelect (arr , 0 , arr.length-1 , kth);
        System.out.println( "kth smallest ele index : "+kthSmallest_idx +" ----> element : "+ arr[kthSmallest_idx]);
    }

    public static int quickSelect (int []arr , int low , int high , int kth)
    {
        int pivot = arr[high];
        int pivot_idx = partition (arr , pivot , low , high);
        if (pivot_idx  == kth-1) return pivot_idx;
        else if (pivot_idx > kth-1)
        {
           return  quickSelect (arr , low , pivot_idx-1 , kth);
        }
        else {
             return quickSelect (arr , pivot_idx+1 , high , kth);
        }

    }

    public static int partition (int arr[] , int pivot , int low , int high )
    {
        int i = 0 , j = 0;
        while (i <= high)
        {
            if (arr[i] > pivot)
            {
                i++;
            }
            else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }
        return j-1 ;
    }
}