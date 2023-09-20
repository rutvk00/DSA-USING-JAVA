//https://www.youtube.com/watch?v=Jv-eGC2xmtU&list=PL-Jc9J83PIiFc7hJ5eeCb579PS8p-en4f

package PepcodingLevel1.Sorting;
import java.util.*;
import java.io.*;

class BubbleSort
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []arr = new int[n];

        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = scn.nextInt();
        }

        for (int itr = 0 ;  itr < arr.length-1 ; itr++)
        {
            for (int j = 0 ; j < arr.length - itr - 1 ; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i] +" ");
        }
    }
}