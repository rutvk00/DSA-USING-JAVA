// print all subsets of given array whose sum is equal to the given target
//https://www.youtube.com/watch?v=HGDmj5NrrjM&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=49

package PepcodingLevel1.Recursion;
import java.util.*;
import java.io.*;

class PrintTargetSumSubset
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for(int i = 0 ; i< arr.length ; i++)
        {
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();

        printTargetSumSubset (arr , 0 , 0 , target , "");
    }

    public static void printTargetSumSubset (int arr[] , int idx , int sum , int target , String subset)
    {
        if (arr.length == idx)
        {
            if (sum == target)
            {
                System.out.println(subset + ".");
            }
            return;
        }

        printTargetSumSubset (arr , idx+1 , sum + arr[idx] , target , subset+arr[idx]+",");
        printTargetSumSubset (arr , idx+1 , sum  , target , subset);
    }
}