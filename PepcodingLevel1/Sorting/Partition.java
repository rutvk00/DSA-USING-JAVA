//https://www.youtube.com/watch?v=if40LxQ8_Xo&list=PL-Jc9J83PIiFc7hJ5eeCb579PS8p-en4f&index=6
// 0 -- j-1 ---> less than pivot
// j -- i-1 ---> greater than pivot
// i -- t ---> unknown element (not visited )
package PepcodingLevel1.Sorting;
import java.util.*;
import java.io.*;

class Partition
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0 ; i < n ;i++)
        {
            arr[i] = scn.nextInt();
        }

        int pivot = scn.nextInt();

        partition (arr , pivot);
        for (int i = 0 ; i < n ;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void partition (int arr[] , int pivot)
    {
        int i = 0 ;
        int j = 0;
        int end = arr.length;

        while (i < end)
        {
            if (arr[i] > pivot)
            {
                i++;
            }
            else {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j++;
            }
        }

        System.out.println("Before "+j+" elements are less than pivot " + pivot+" and "+j+" onwards greater than pivot" );

    }
}