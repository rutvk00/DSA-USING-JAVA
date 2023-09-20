package PepcodingLevel1.Getting_Pattern_Fun_Array;// Inverse Array
//https://www.youtube.com/watch?v=TCDPgRgCNr0&list=PL-Jc9J83PIiHOV7lm2uSw4ZiVsIRsGS6r&index=33
import java.util.*;
import java.io.*;
class Inverse_Array
{
    public static void Display (int[] arr  , int n)
    {
        for (int i = 0 ; i<arr.length ; i++)
        {
            System.out.print (arr[i] +" ");
        }

    }

    public static int[] Inverse_Arr (int arr[] , int n) {
        int inv[] = new int [n];

        for (int i = 0 ; i < n ; i++) {
         int v = arr[i] ;
         inv [v] = i ;
        }
        return inv;

    }

    public static void main(String[] args) throws Exception
    {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0 ; i <arr.length ; i++)
        {
            arr[i] = scn.nextInt();
        }
        int inv[] =  Inverse_Arr (arr , n);
        Display (inv , n);
    }
}


