//https://www.youtube.com/watch?v=aiUHB-3EOg8&list=PL-Jc9J83PIiFc7hJ5eeCb579PS8p-en4f&index=5

package PepcodingLevel1.Sorting;
import java.util.*;
import java.io.*;

class MergeSort
{
    public static void main(String[] args)throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = scn.nextInt();
        }
        int low = 0;
        int high = arr.length-1 ;
        int fsa[] = mergeSort (arr  , low  , high);

        for (int i = 0 ; i < fsa.length ; i++)
        {
            System.out.print(fsa[i] +" ");
        }
    }

    public static int [] mergeSort (int arr[] , int low , int high)
    {
        if (low == high)
        {
            int base[] = new int[1];
            base[0] = arr[low];
            return base;
        }
            int mid = (low+high)/2;
            int fsh[] = mergeSort (arr , low , mid);
            int ssh[] = mergeSort (arr , mid+1 , high);
            int fsa[] = mergeTwoSortedArray (fsh , ssh);
            return fsa;
    }

    public static int [] mergeTwoSortedArray (int fsh[] , int ssh[])
    {
        int []fsa = new int[fsh.length + ssh.length];
        //System.out.println("Size Of res :" + res.length);
        int i = 0 ;
        int j = 0;
        int k = 0;
        while (i <fsh.length && j <ssh.length)
        {
            if (fsh[i] < ssh[j])
            {
                fsa[k] = fsh[i];
                i++;
                k++;
            }
            else {
                fsa[k] = ssh[j];
                k++;
                j++;
            }
        }

        while (i <fsh.length)
        {
            fsa[k] = fsh[i];
            k++;
            i++;
        }
        while (j <ssh.length)
        {
            fsa[k] = ssh[j];
            k++;
            j++;
        }

        return fsa;
    }

}