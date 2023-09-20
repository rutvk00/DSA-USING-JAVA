package PepcodingLevel1.Getting_Pattern_Fun_Array;// Rotate Array with given K position
//https://www.youtube.com/watch?v=8RErc0VXAo8&list=PL-Jc9J83PIiHOV7lm2uSw4ZiVsIRsGS6r&index=32

import java.util.*;
import java.io.*;

class RotateArray
{
    public static void Display (int[] arr  , int n)
    {
        for (int i = 0 ; i<arr.length ; i++)
        {
            System.out.print (arr[i] +" ");
        }

    }

    public static void Reverse_Array (int[] arr , int start_index , int last_index)
    {
        int i = start_index ;
        int j = last_index;

        while (i<=j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp ;
            i++;
            j--;
        }
    }

    public static void Rotate_Array (int arr[] , int k)
    {
        k = k %arr.length;
        if (k<0)
            k = k+arr.length;
        Reverse_Array (arr , 0 , arr.length - k - 1); // part -1
        Reverse_Array (arr , arr.length-k , arr.length - 1); // part-2
        Reverse_Array (arr , 0 , arr.length  - 1); // whole

    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0 ; i <arr.length ; i++)
        {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        Rotate_Array (arr  , k);
        Display (arr , n);
    }
}