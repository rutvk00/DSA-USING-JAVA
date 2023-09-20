package PepcodingLevel1.Getting_Pattern_Fun_Array;// Print last occurance of given element in the array
//https://www.youtube.com/watch?v=bQkwHBaNioE&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=24

import java.util.*;

class PrintALlIndex
{
    public static int print_all_index (int arr[] , int i , int x)
    {
        if (i == arr.length) return -1 ;
        else if (arr[i] == x)
        {
            System.out.print (i +" ");
            return print_all_index (arr, i+1 , x);
        }
        else {
            return print_all_index (arr, i+1 , x);
        }
    }

    public static void main(String[] args)  throws Exception{
        Scanner scn = new Scanner (System.in) ;
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0 ; i< arr.length ; i++)
        {
            arr[i] = scn.nextInt();
        }

        int x = scn.nextInt();
        print_all_index (arr , 0 , x);
    }
}