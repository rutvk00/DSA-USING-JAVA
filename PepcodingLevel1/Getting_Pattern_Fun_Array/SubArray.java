package PepcodingLevel1.Getting_Pattern_Fun_Array;// Print all sub array
//https://www.youtube.com/watch?v=vk8sfizNtsY&list=PL-Jc9J83PIiHOV7lm2uSw4ZiVsIRsGS6r&index=37

import java.util.*;
import java.io.*;
public class SubArray {
    public static void PrintAllSubArray (int[] arr  , int n)
    {
        for (int i = 0 ; i<n ; i++)
        {
            for (int j = i ; j <n ; j++)
            {
                for (int k = i ; k<= j ; k++)
                {
                    System.out.print (arr[k] + "\t");
                }
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = scn.nextInt();
        }

        PrintAllSubArray (arr , n);
    }
}
