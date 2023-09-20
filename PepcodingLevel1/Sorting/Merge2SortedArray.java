//https://www.youtube.com/watch?v=WMxNhIBA92I&list=PL-Jc9J83PIiFc7hJ5eeCb579PS8p-en4f&index=4

package PepcodingLevel1.Sorting;
import java.util.*;
import java.io.*;

class Merge2sortedArray
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int arr1[] = new int [n];
        for (int i = 0 ; i < n ; i++)
        {
            arr1[i] = scn.nextInt();
        }

        int m = scn.nextInt();
        int []arr2 = new int[m];
        for (int i = 0 ; i < m ; i++)
        {
            arr2[i] = scn.nextInt();
        }

        int []res = new int[arr1.length + arr2.length];

        int i = 0 ;
        int j = 0;
        int k = 0;
        while (i <arr1.length && j <arr2.length)
        {
            if (arr1[i] < arr2[j])
            {
                res[k] = arr1[i];
                i++;
                k++;
            }
            else {
                res[k] = arr2[j];
                k++;
                j++;
            }
        }

        while (i <arr1.length)
        {
            res[k] = arr1[i];
            k++;
            i++;
        }
        while (j <arr2.length)
        {
            res[k] = arr2[j];
            k++;
            j++;
        }

        for (int l = 0 ; l < res.length ; l++)
        {
            System.out.print(res[l] + " ");
        }
    }
}