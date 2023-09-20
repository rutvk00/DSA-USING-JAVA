//https://www.youtube.com/watch?v=MMt2x6an_i8&list=PL-Jc9J83PIiFc7hJ5eeCb579PS8p-en4f&index=3

package PepcodingLevel1.Sorting;
import java.io.*;
import java.util.*;

class InsertionSort
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i = 0 ; i<n ; i++)
        {
            arr[i] = scn.nextInt();
        }

        for (int i = 1 ; i < n ; i++)
        {
            for (int j = i-1 ; j >= 0 ;j--)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                else {
                    break;
                }
            }
        }
        for (int i = 0 ; i<n ; i++)
        {
            System.out.print(arr[i] +" ");
        }

    }
}