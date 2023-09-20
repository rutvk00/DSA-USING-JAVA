package PepcodingLevel1.Getting_Pattern_Fun_Array;// find ceil and floor for given array and data
//https://www.youtube.com/watch?v=qaQRRWXgFIQ&list=PL-Jc9J83PIiHOV7lm2uSw4ZiVsIRsGS6r&index=41

import java.util.*;
import java.io.*;

class Ceil_Floor
{
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0 ; i<n ; i++)
        {
            arr[i] = scn.nextInt();
        }

        int data = scn.nextInt();
        int lo = 0 ;
        int hi = arr.length-1;
        int ceil = 0;
        int floor = 0;
        while (lo <= hi)
        {
            int mid = (lo + hi)/2;
            if (data < arr[mid])
            {
                hi = mid-1;
                ceil = arr[mid];
            }
            else if( data > arr[mid])
            {
                lo = mid+1;
                floor = arr[mid];
            }
            else {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
        }

        System.out.println ("Floor of " + data + " is "+floor + " ans ceil is "+ceil);
    }
}