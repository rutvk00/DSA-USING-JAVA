// https://www.youtube.com/watch?v=4t9jv9AkVdE&list=PL-Jc9J83PIiFc7hJ5eeCb579PS8p-en4f&index=14

package PepcodingLevel1.Sorting;
import java.util.*;
import java.io.*;

class TargetSumPair
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();

        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;

        while (i<j)
        {
            if(arr[i] + arr[j] == target)
            {
                System.out.println(arr[i] +" " + arr[j]);
                i++;
                j--;
            }
            else if (arr[i] + arr[j] > target)
            {
                j--;
            }
            else {
                i++;
            }
        }

    }
}